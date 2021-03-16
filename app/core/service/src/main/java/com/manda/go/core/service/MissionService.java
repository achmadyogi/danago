/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.core.service;

import com.manda.go.core.model.entity.Mission;

import java.util.List;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: MissionService.java, v 0.1 2021‐03‐16 13.43 Achmad Yogi Prakoso Exp $$
 */
public interface MissionService {
    List<Mission> loadUserMissions(String userId, String level);
}
