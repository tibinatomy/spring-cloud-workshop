package com.tibs.spring.cloud.workshop.userapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserSkill {
    private String skill;
    private int skillRank;
}
