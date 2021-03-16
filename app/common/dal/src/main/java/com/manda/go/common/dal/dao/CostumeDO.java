/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.common.dal.dao;

import java.math.BigInteger;
import java.util.Date;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: CostumeDO.java, v 0.1 2021‐03‐14 19.32 Achmad Yogi Prakoso Exp $$
 */
public class CostumeDO {
    private BigInteger id;
    private String     costumeUrl;
    private String     name;
    private BigInteger price;
    private String     category;
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
     * Getter method for property costumeUrl.
     *
     * @return property value of costumeUrl
     */
    public String getCostumeUrl() {
        return costumeUrl;
    }

    /**
     * Setter method for property costumeUrl.
     *
     * @param costumeUrl value to be assigned to property costumeUrl
     */
    public void setCostumeUrl(String costumeUrl) {
        this.costumeUrl = costumeUrl;
    }

    /**
     * Getter method for property name.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property name.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property price.
     *
     * @return property value of price
     */
    public BigInteger getPrice() {
        return price;
    }

    /**
     * Setter method for property price.
     *
     * @param price value to be assigned to property price
     */
    public void setPrice(BigInteger price) {
        this.price = price;
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
