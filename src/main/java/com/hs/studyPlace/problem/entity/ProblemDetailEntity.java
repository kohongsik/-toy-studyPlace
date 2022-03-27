package com.hs.studyPlace.problem.entity;

import com.hs.studyPlace.common.entity.CommonEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="problem_detail")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProblemDetailEntity extends CommonEntity {
    @Id @GeneratedValue
    @Column(name="problem_detail_id")
    private Long id;

    @AttributeOverrides(
            value = {
                    @AttributeOverride(name="name", column = @Column(name="problem_detail_name")),
                    @AttributeOverride(name="answerYn", column = @Column(name="answer_yn"))
            }
    )
    private ProblemDetailBasicInfo problemDetailInfo;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="problem_id")
    private ProblemEntity problemEntity;
}
