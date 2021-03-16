/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.response;

import com.manda.go.core.model.entity.Mission;

import java.util.List;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: MissionInquiryResult.java, v 0.1 2021‐03‐16 13.30 Achmad Yogi Prakoso Exp $$
 */
public class MissionInquiryResult extends BaseResult{
    private List<Mission> missions;

    /**
     * Getter method for property missions.
     *
     * @return property value of missions
     */
    public List<Mission> getMissions() {
        return missions;
    }

    /**
     * Setter method for property missions.
     *
     * @param missions value to be assigned to property missions
     */
    public void setMissions(List<Mission> missions) {
        this.missions = missions;
    }
}
