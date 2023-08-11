package com.tibs.spring.cloud.workshop.usermanager.controller;


import com.tibs.spring.cloud.workshop.userapi.apiinterface.UserInquiryRequest;
import com.tibs.spring.cloud.workshop.userapi.apiinterface.UserInquiryResponse;
import com.tibs.spring.cloud.workshop.userapi.model.UserDetails;
import com.tibs.spring.cloud.workshop.userservicelib.service.User360InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class User360InquiryController {

    @Autowired
    private User360InquiryService user360InquiryService;

    @PostMapping("/user/fetch")
    public ResponseEntity<UserInquiryResponse> getUser(@RequestBody UserInquiryRequest request) throws IOException {
        UserDetails userDetails = user360InquiryService.getUserDetails(request);
        UserInquiryResponse userInquiryResponse = new UserInquiryResponse();
        userInquiryResponse.setUserDetail(userDetails);
        ResponseEntity<UserInquiryResponse> response = new ResponseEntity<>(userInquiryResponse, userDetails != null ? HttpStatus.OK : HttpStatus.NOT_FOUND);
        return response;
    }
}
