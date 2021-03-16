/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.core.model.entity;

import java.math.BigInteger;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: Mission.java, v 0.1 2021‐03‐16 09.35 Achmad Yogi Prakoso Exp $$
 */
public class Mission {
    private BigInteger id;
    private String     title;
    private String     description;
    private String     category;
    private String     serviceUrl;
    private BigInteger points;
    private String     level;
    private boolean    success;

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
     * Getter method for property title.
     *
     * @return property value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter method for property title.
     *
     * @param title value to be assigned to property title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter method for property description.
     *
     * @return property value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for property description.
     *
     * @param description value to be assigned to property description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter method for property category.
     *
     * @return property value of category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Setter method for property category.
     *
     * @param category value to be assigned to property category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Getter method for property serviceUrl.
     *
     * @return property value of serviceUrl
     */
    public String getServiceUrl() {
        return serviceUrl;
    }

    /**
     * Setter method for property serviceUrl.
     *
     * @param serviceUrl value to be assigned to property serviceUrl
     */
    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
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
