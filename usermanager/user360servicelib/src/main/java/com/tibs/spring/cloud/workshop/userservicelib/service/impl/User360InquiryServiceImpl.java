package com.tibs.spring.cloud.workshop.userservicelib.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.tibs.spring.cloud.workshop.userapi.apiinterface.UserInquiryRequest;
import com.tibs.spring.cloud.workshop.userapi.model.UserDetails;
import com.tibs.spring.cloud.workshop.userservicelib.service.User360InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class User360InquiryServiceImpl implements User360InquiryService {

    @Value("classpath:data/userrepo.json")
    Resource resource;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public UserDetails getUserDetails(UserInquiryRequest request) throws IOException {
        List<UserDetails> userDetails = objectMapper
                .readValue(resource.getInputStream(), TypeFactory.defaultInstance().constructParametrizedType(ArrayList.class, List.class, UserDetails.class));
        UserDetails userDetail = userDetails.stream()
                .filter(detail -> detail.getEmail().equalsIgnoreCase(request.getEmail()))
                .findAny()
                .orElse(null);
        return userDetail;
    }
}
