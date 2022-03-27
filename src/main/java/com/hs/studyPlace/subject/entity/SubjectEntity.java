package com.hs.studyPlace.subject.entity;

import com.hs.studyPlace.common.entity.CommonEntity;
import com.hs.studyPlace.member.entity.MemberEntity;
import com.hs.studyPlace.problem.entity.ProblemEntity;
import com.hs.studyPlace.problem.entity.ProblemSolvingHistoryEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="subject")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubjectEntity extends CommonEntity {
    @Id @GeneratedValue
    @Column(name="subject_id")
    private Long id;

    @Column(name="subject_name", nullable = false, unique = true)
    private String name;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="member_id")
    private MemberEntity memberEntity;

    @Builder.Default
    @OneToMany(mappedBy = "subjectEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProblemEntity> problemEntityList = new ArrayList<>();

    public void addProblem(ProblemEntity problemEntity) {
        problemEntity.setSubjectEntity(this);
        if (this.problemEntityList == null) {
            this.problemEntityList = new ArrayList<>();
        }
        this.problemEntityList.add(problemEntity);
    }
}
