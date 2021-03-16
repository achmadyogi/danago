/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.common.dal.dao;

import java.math.BigInteger;
import java.util.Date;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: UserCostumeDO.java, v 0.1 2021‐03‐14 19.44 Achmad Yogi Prakoso Exp $$
 */
public class UserCostumeDO {
    private BigInteger costumeId;
    private String     userId;
    private Date       createdDate;
    private Date       updatedDate;

    /**
     * Getter method for property costumeId.
     *
     * @return property value of costumeId
     */
    public BigInteger getCostumeId() {
        return costumeId;
    }

    /**
     * Setter method for property costumeId.
     *
     * @param costumeId value to be assigned to property costumeId
     */
    public void setCostumeId(BigInteger costumeId) {
        this.costumeId = costumeId;
    }

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
     * Getter method for property createdDate.
     *
     * @return property value of createdDate
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Setter method for property createdDate.
     *
     * @param createdDate value to be assigned to property createdDate
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Getter method for property updatedDate.
     *
     * @return property value of updatedDate
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Setter method for property updatedDate.
     *
     * @param updatedDate value to be assigned to property updatedDate
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
