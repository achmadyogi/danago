/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.facade;

import com.manda.go.request.MissionInquiryRequest;
import com.manda.go.response.MissionInquiryResult;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: MissionServiceFacade.java, v 0.1 2021‐03‐16 13.37 Achmad Yogi Prakoso Exp $$
 */
public interface MissionServiceFacade {
    MissionInquiryResult missionInquiry(MissionInquiryRequest request);
}
