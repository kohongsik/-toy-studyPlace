package com.hs.studyPlace.member.repository;

import com.hs.studyPlace.member.entity.MemberEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {
    private final EntityManager em;
    public List<MemberEntity> findMemberList () {
        String query = "select m from MemberEntity m";
        return em.createQuery(query, MemberEntity.class).getResultList();
    }

    public MemberEntity findOne (Long memberId) {
        return em.find(MemberEntity.class, memberId);
    }


}
