package com.hs.studyPlace.subject.repository;

import com.hs.studyPlace.subject.entity.SubjectEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class SubjectRepository {
    private final EntityManager em;

    public List<SubjectEntity> findSubjectList () {
        String query = "select s from SubjectEntity s";
        return em.createQuery(query, SubjectEntity.class).getResultList();
    }

    public SubjectEntity findOne (Long subjectId) {
        return em.find(SubjectEntity.class, subjectId);
    }

}
