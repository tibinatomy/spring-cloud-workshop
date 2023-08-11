package com.tibs.spring.cloud.workshop.userapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class UserDetails extends UserBasicInfo {
    private List<UserSkill> skills;
    private String role;
}
