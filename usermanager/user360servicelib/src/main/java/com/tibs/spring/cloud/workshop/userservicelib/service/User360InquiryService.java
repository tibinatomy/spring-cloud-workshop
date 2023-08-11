package com.tibs.spring.cloud.workshop.userservicelib.service;


import com.tibs.spring.cloud.workshop.userapi.apiinterface.UserInquiryRequest;
import com.tibs.spring.cloud.workshop.userapi.model.UserDetails;

import java.io.IOException;

public interface User360InquiryService {
     UserDetails getUserDetails(UserInquiryRequest request) throws IOException;
}
