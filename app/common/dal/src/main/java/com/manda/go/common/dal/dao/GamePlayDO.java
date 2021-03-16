/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.common.dal.dao;

import java.math.BigInteger;
import java.util.Date;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: GamePlayDO.java, v 0.1 2021‐03‐14 19.38 Achmad Yogi Prakoso Exp $$
 */
public class GamePlayDO {
    private BigInteger id;
    private String     userId;
    private BigInteger points;
    private Date       createdDate;
    private Date       updatedDate;

    /**
     * Getter method for property id.
     *
     * @return property value of id
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Setter method for property id.
     *
     * @param id value to be assigned to property id
     */
    public void setId(BigInteger id) {
        this.id = id;
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
     * Getter method for property points.
     *
     * @return property value of points
     */
    public BigInteger getPoints() {
        return points;
    }

    /**
     * Setter method for property points.
     *
     * @param points value to be assigned to property points
     */
    public void setPoints(BigInteger points) {
        this.points = points;
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
