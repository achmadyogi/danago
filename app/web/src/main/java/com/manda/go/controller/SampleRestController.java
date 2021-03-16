/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.manda.go.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.manda.go.facade.MissionServiceFacade;
import com.manda.go.facade.UserServiceFacade;
import com.manda.go.request.MissionInquiryRequest;
import com.manda.go.request.UserInquiryRequest;
import com.manda.go.response.MissionInquiryResult;
import com.manda.go.response.UserInquiryResult;

/**
 * @author qilong.zql
 * @since 2.5.8
 */
@RestController
public class SampleRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SampleRestController.class);

    @SofaReference
    private UserServiceFacade   userServiceFacade;

    @SofaReference
    private MissionServiceFacade missionServiceFacade;

    @PostMapping("/danago/userInquiry")
    @ResponseBody
    public UserInquiryResult userInquiry(@RequestBody UserInquiryRequest request) {
        UserInquiryResult result;
        try {
            result = userServiceFacade.userInquiry(request);
        } catch (Exception e) {
            // Create result
            result = new UserInquiryResult();
            result.setSuccess(false);
            LOGGER.error(e.getMessage());
        }
        return result;
    }

    @PostMapping("/danago/missionInquiry")
    @ResponseBody
    public MissionInquiryResult missionInquiry(@RequestBody MissionInquiryRequest request) {
        MissionInquiryResult result;
        try {
            result = missionServiceFacade.missionInquiry(request);
        } catch (Exception e) {
            // Create result
            result = new MissionInquiryResult();
            result.setSuccess(false);
            LOGGER.error(e.getMessage());
        }
        return result;
    }

}