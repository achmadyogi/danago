/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.response;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: BaseResponse.java, v 0.1 2021‐03‐16 09.50 Achmad Yogi Prakoso Exp $$
 */
public abstract class BaseResult {
    private boolean success;

    /**
     * Getter method for property success.
     *
     * @return property value of success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Setter method for property success.
     *
     * @param success value to be assigned to property success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }
}
