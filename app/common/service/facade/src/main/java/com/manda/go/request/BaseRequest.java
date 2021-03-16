/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.request;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: BaseRequest.java, v 0.1 2021‐03‐16 09.45 Achmad Yogi Prakoso Exp $$
 */
public abstract class BaseRequest {
    private String requestId;

    /**
     * Getter method for property requestId.
     *
     * @return property value of requestId
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Setter method for property requestId.
     *
     * @param requestId value to be assigned to property requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
