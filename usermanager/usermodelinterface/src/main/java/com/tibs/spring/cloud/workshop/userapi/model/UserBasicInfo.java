package com.tibs.spring.cloud.workshop.userapi.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserBasicInfo {
    private String firstName;
    private String midName;
    private String lastName;
    private String userName;
    private String email;
    private String contact;

}
