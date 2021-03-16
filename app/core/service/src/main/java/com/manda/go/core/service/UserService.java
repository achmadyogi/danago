/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.core.service;

import com.manda.go.core.model.entity.Avatar;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: UserService.java, v 0.1 2021‐03‐16 09.59 Achmad Yogi Prakoso Exp $$
 */
public interface UserService {
    Avatar loadAvatar(String userId);
}
