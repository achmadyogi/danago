/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.request;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: MissionInquiryRequest.java, v 0.1 2021‐03‐16 13.30 Achmad Yogi Prakoso Exp $$
 */
public class MissionInquiryRequest extends BaseRequest {
    private String userId;
    private String level;

    /**
     * Getter method for property userId.
     *
     * @return property value of userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Setter method for property userId.
     *
     * @param userId value to be assigned to property userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Getter method for property level.
     *
     * @return property value of level
     */
    public String getLevel() {
        return level;
    }

    /**
     * Setter method for property level.
     *
     * @param level value to be assigned to property level
     */
    public void setLevel(String level) {
        this.level = level;
    }
}
