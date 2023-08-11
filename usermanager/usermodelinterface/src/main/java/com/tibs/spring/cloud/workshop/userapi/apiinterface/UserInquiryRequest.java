package com.tibs.spring.cloud.workshop.userapi.apiinterface;

import com.tibs.spring.cloud.workshop.coreapi.model.request.GenericApiRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserInquiryRequest extends GenericApiRequest {
    private String username;
    private String email;
}
