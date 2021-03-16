/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.manda.go.core.model.entity.Mission;
import com.manda.go.core.service.MissionService;
import com.manda.go.facade.MissionServiceFacade;
import com.manda.go.request.MissionInquiryRequest;
import com.manda.go.response.MissionInquiryResult;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: MissionServiceFacadeImpl.java, v 0.1 2021‐03‐16 13.39 Achmad Yogi Prakoso Exp $$
 */
public class MissionServiceFacadeImpl implements MissionServiceFacade {
    @Autowired
    MissionService missionService;

    @Override
    public MissionInquiryResult missionInquiry(MissionInquiryRequest request) {
        // Get mission list
        List<Mission> missions = missionService.loadUserMissions(request.getUserId(),
            request.getLevel());

        // Construct result
        MissionInquiryResult result = new MissionInquiryResult();
        result.setMissions(missions);
        result.setSuccess(true);
        return result;
    }
}
