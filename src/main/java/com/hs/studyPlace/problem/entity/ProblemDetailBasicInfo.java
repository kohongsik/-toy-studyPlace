package com.hs.studyPlace.problem.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProblemDetailBasicInfo {
    private String name;
    @Enumerated(value = EnumType.STRING)
    private EnumAnswerFlag answerYn;
}
