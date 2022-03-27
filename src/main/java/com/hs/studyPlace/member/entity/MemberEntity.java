package com.hs.studyPlace.member.entity;

import com.hs.studyPlace.common.entity.CommonEntity;
import com.hs.studyPlace.subject.entity.SubjectEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @Builder.Default
    @OneToMany(mappedBy = "memberEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    List<SubjectEntity> subjectEntityList = new ArrayList<>();

    public void addSubject (SubjectEntity subjectEntity) {
        subjectEntity.setMemberEntity(this);
        if (this.subjectEntityList == null) {
            this.subjectEntityList = new ArrayList<>();
        }
        this.subjectEntityList.add(subjectEntity);
    }

    // create problem

    // create problem solving history

    // solve problem




}
