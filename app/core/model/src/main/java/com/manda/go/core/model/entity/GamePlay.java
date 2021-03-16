/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.core.model.entity;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: GamePlay.java, v 0.1 2021‐03‐16 09.37 Achmad Yogi Prakoso Exp $$
 */
public class GamePlay {
    private int life;

    public GamePlay(int life) {
        this.life = life;
    }

    /**
     * Getter method for property life.
     *
     * @return property value of life
     */
    public int getLife() {
        return life;
    }

    /**
     * Setter method for property life.
     *
     * @param life value to be assigned to property life
     */
    public void setLife(int life) {
        this.life = life;
    }
}
