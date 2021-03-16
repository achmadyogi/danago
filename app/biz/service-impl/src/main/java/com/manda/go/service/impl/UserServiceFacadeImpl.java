/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.service.impl;

import com.manda.go.core.model.entity.Avatar;
import com.manda.go.core.service.UserService;
import com.manda.go.facade.UserServiceFacade;
import com.manda.go.request.UserInquiryRequest;
import com.manda.go.response.UserInquiryResult;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: UserServiceFacadeImpl.java, v 0.1 2021‐03‐16 09.57 Achmad Yogi Prakoso Exp $$
 */
public class UserServiceFacadeImpl implements UserServiceFacade {

    @Autowired
    UserService userService;

    @Override
    public UserInquiryResult userInquiry(UserInquiryRequest request) {
        // Query user
        Avatar avatar = userService.loadAvatar(request.getUserId());

        // Compose result
        UserInquiryResult result = new UserInquiryResult();
        result.setAvatar(avatar);
        result.setSuccess(true);

        return result;
    }
}
