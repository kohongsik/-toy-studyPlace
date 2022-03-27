package com.hs.studyPlace.problem.entity;

import com.hs.studyPlace.common.entity.CommonEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="problem_solving_history_detail")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProblemSolvingHistoryDetailEntity extends CommonEntity {
    @Id
    @GeneratedValue
    @Column(name="problem_solving_history_detail_id")
    private Long id;

    @AttributeOverrides(
            value = {
                    @AttributeOverride(name="name", column = @Column(name="problem_solving_history_detail_name")),
                    @AttributeOverride(name="answerYn", column = @Column(name="answer_yn"))
            }
    )
    private ProblemDetailBasicInfo problemDetailInfo;

    @Enumerated(value = EnumType.STRING)
    @Column(name="check_flag")
    private EnumMyCheckFlag myCheckFlag;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="problem_solving_history_id")
    private ProblemSolvingHistoryEntity problemSolvingHistoryEntity;
}
