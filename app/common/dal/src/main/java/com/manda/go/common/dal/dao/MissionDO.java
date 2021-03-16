/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.common.dal.dao;

import java.math.BigInteger;
import java.util.Date;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: MissionDO.java, v 0.1 2021‐03‐14 14.57 Achmad Yogi Prakoso Exp $$
 */
public class MissionDO {
    private BigInteger id;
    private String     productCode;
    private String     title;
    private String     description;
    private String     category;
    private String     serviceUrl;
    private BigInteger points;
    private int        transactionQuantity;
    private BigInteger transactionMinAmount;
    private String     level;
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
     * Getter method for property productCode.
     *
     * @return property value of productCode
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Setter method for property productCode.
     *
     * @param productCode value to be assigned to property productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
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
     * Getter method for property transactionQuantity.
     *
     * @return property value of transactionQuantity
     */
    public int getTransactionQuantity() {
        return transactionQuantity;
    }

    /**
     * Setter method for property transactionQuantity.
     *
     * @param transactionQuantity value to be assigned to property transactionQuantity
     */
    public void setTransactionQuantity(int transactionQuantity) {
        this.transactionQuantity = transactionQuantity;
    }

    /**
     * Getter method for property transactionMinAmount.
     *
     * @return property value of transactionMinAmount
     */
    public BigInteger getTransactionMinAmount() {
        return transactionMinAmount;
    }

    /**
     * Setter method for property transactionMinAmount.
     *
     * @param transactionMinAmount value to be assigned to property transactionMinAmount
     */
    public void setTransactionMinAmount(BigInteger transactionMinAmount) {
        this.transactionMinAmount = transactionMinAmount;
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
