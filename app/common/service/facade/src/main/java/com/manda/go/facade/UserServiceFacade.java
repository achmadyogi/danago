/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.facade;

import com.manda.go.request.UserInquiryRequest;
import com.manda.go.response.UserInquiryResult;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: UserServiceFacade.java, v 0.1 2021‐03‐16 09.47 Achmad Yogi Prakoso Exp $$
 */
public interface UserServiceFacade {
    UserInquiryResult userInquiry(UserInquiryRequest request);
}
