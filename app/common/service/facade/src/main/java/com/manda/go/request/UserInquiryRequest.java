/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.request;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: UserInquiryRequest.java, v 0.1 2021‐03‐16 09.45 Achmad Yogi Prakoso Exp $$
 */
public class UserInquiryRequest extends BaseRequest {
    private String userId;

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
}
