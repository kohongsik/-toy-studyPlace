package com.hs.studyPlace.problem.entity;

import com.hs.studyPlace.common.entity.CommonEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="problem_solving_history")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProblemSolvingHistoryEntity extends CommonEntity {
    @Id @GeneratedValue
    @Column(name="problem_solving_history_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="problem_id")
    private ProblemEntity problemEntity;

    @AttributeOverrides(
            value={
                    @AttributeOverride(name="name", column = @Column(name = "problem_solving_history_name")),
                    @AttributeOverride(name="contents", column = @Column(name = "problem_solving_history_contents"))
            }
    )
    private ProblemBasicInfo problemInfo;

    @Enumerated(value=EnumType.STRING)
    @Column(name="result")
    private EnumResult result;
}
