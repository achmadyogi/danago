/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.response;

import com.manda.go.core.model.entity.Avatar;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: UserInquiryResult.java, v 0.1 2021‐03‐16 09.50 Achmad Yogi Prakoso Exp $$
 */
public class UserInquiryResult extends BaseResult {
    private Avatar avatar;

    /**
     * Getter method for property avatar.
     *
     * @return property value of avatar
     */
    public Avatar getAvatar() {
        return avatar;
    }

    /**
     * Setter method for property avatar.
     *
     * @param avatar value to be assigned to property avatar
     */
    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }
}
