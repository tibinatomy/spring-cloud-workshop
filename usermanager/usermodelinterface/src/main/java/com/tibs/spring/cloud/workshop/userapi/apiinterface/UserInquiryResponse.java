package com.tibs.spring.cloud.workshop.userapi.apiinterface;

import com.tibs.spring.cloud.workshop.coreapi.model.base.iModel;
import com.tibs.spring.cloud.workshop.userapi.model.UserDetails;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserInquiryResponse extends iModel {
    private UserDetails userDetail;
}
