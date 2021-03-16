/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.core.service.constant;

import com.alipay.sofa.common.utils.StringUtil;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: GamePlayEnum.java, v 0.1 2021‐03‐16 10.39 Achmad Yogi Prakoso Exp $$
 */
public enum LevelEnum {
    IRON("IRON", "iron"),
    BRONZE("BRONZE", "bronze"),
    SILVER("SILVER", "silver"),
    GOLD("GOLD", "gold"),

    ;

    private String code;
    private String description;

    LevelEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public static LevelEnum getByCode(String code) {
        for (LevelEnum type : values()) {
            if (StringUtil.equals(type.getCode(), code)) {
                return type;
            }
        }
        return null;
    }

    /**
     * Getter method for property code.
     *
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Getter method for property description.
     *
     * @return property value of description
     */
    public String getDescription() {
        return description;
    }
}
