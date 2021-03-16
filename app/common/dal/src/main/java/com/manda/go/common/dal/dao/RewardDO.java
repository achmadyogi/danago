/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.common.dal.dao;

import java.math.BigInteger;
import java.util.Date;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: RewardDO.java, v 0.1 2021‐03‐14 19.42 Achmad Yogi Prakoso Exp $$
 */
public class RewardDO {
    private BigInteger id;
    private String     title;
    private String     amountType;
    private int        quantity;
    private String     description;
    private BigInteger minTrxAmount;
    private int        amountExpiryDays;
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
     * Getter method for property amountType.
     *
     * @return property value of amountType
     */
    public String getAmountType() {
        return amountType;
    }

    /**
     * Setter method for property amountType.
     *
     * @param amountType value to be assigned to property amountType
     */
    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    /**
     * Getter method for property quantity.
     *
     * @return property value of quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter method for property quantity.
     *
     * @param quantity value to be assigned to property quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
     * Getter method for property minTrxAmount.
     *
     * @return property value of minTrxAmount
     */
    public BigInteger getMinTrxAmount() {
        return minTrxAmount;
    }

    /**
     * Setter method for property minTrxAmount.
     *
     * @param minTrxAmount value to be assigned to property minTrxAmount
     */
    public void setMinTrxAmount(BigInteger minTrxAmount) {
        this.minTrxAmount = minTrxAmount;
    }

    /**
     * Getter method for property amountExpiryDays.
     *
     * @return property value of amountExpiryDays
     */
    public int getAmountExpiryDays() {
        return amountExpiryDays;
    }

    /**
     * Setter method for property amountExpiryDays.
     *
     * @param amountExpiryDays value to be assigned to property amountExpiryDays
     */
    public void setAmountExpiryDays(int amountExpiryDays) {
        this.amountExpiryDays = amountExpiryDays;
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
