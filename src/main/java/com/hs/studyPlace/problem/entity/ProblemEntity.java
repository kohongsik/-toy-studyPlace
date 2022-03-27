package com.hs.studyPlace.problem.entity;

import com.hs.studyPlace.common.entity.CommonEntity;
import com.hs.studyPlace.subject.entity.SubjectEntity;
import lombok.*;

import javax.persistence.*;
import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="problem")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProblemEntity extends CommonEntity {
    @Id @GeneratedValue
    @Column(name="problem_id")
    private Long id;

    @AttributeOverrides(
            value={
                    @AttributeOverride(name="name", column = @Column(name = "problem_name")),
                    @AttributeOverride(name="contents", column = @Column(name = "problem_contents"))
            }
    )
    private ProblemBasicInfo problemInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="subject_id")
    private SubjectEntity subjectEntity;

    @Builder.Default
    @OneToMany(mappedBy = "problemEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProblemSolvingHistoryEntity> problemSolvingHistoryEntityList = new ArrayList<>();

    public void addProblemSolvingHistory (ProblemSolvingHistoryEntity problemSolvingHistoryEntity) {
        problemSolvingHistoryEntity.setProblemEntity(this);
        if (this.problemSolvingHistoryEntityList == null) {
            this.problemSolvingHistoryEntityList = new ArrayList<>();
        }
        this.problemSolvingHistoryEntityList.add(problemSolvingHistoryEntity);
    }
}
