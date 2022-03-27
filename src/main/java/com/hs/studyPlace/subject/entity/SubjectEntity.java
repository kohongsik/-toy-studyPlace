package com.hs.studyPlace.subject.entity;

import com.hs.studyPlace.common.entity.CommonEntity;
import com.hs.studyPlace.member.entity.MemberEntity;
import lombok.*;

import javax.persistence.*;

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
}
