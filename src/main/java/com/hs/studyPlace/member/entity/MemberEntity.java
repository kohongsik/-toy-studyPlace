package com.hs.studyPlace.member.entity;

import com.hs.studyPlace.common.entity.CommonEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="member")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberEntity extends CommonEntity {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(name="input_id", nullable = false, unique = true)
    private String inputId;

    @Column(name="user_name")
    private String name;

}
