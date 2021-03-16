/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.core.model.entity;

import java.math.BigInteger;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: UserDetail.java, v 0.1 2021‐03‐16 09.34 Achmad Yogi Prakoso Exp $$
 */
public class Avatar {
    private String     userId;
    private String     level;
    private BigInteger points;
    private boolean    allowGamePlay;
    private GamePlay   gamePlay;

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
     * Getter method for property allowGamePlay.
     *
     * @return property value of allowGamePlay
     */
    public boolean isAllowGamePlay() {
        return allowGamePlay;
    }

    /**
     * Setter method for property allowGamePlay.
     *
     * @param allowGamePlay value to be assigned to property allowGamePlay
     */
    public void setAllowGamePlay(boolean allowGamePlay) {
        this.allowGamePlay = allowGamePlay;
    }

    /**
     * Getter method for property gamePlay.
     *
     * @return property value of gamePlay
     */
    public GamePlay getGamePlay() {
        return gamePlay;
    }

    /**
     * Setter method for property gamePlay.
     *
     * @param gamePlay value to be assigned to property gamePlay
     */
    public void setGamePlay(GamePlay gamePlay) {
        this.gamePlay = gamePlay;
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
}
