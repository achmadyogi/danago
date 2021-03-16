/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.core.service.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;

import com.manda.go.common.dal.dai.MissionManageDAO;
import com.manda.go.common.dal.dao.MissionDO;
import com.manda.go.core.model.entity.Mission;
import com.manda.go.core.service.MissionService;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: MissionServiceImpl.java, v 0.1 2021‐03‐16 13.44 Achmad Yogi Prakoso Exp $$
 */
@MapperScan("com.manda.go.common.dal.dai")
public class MissionServiceImpl implements MissionService {

    @Autowired
    MissionManageDAO missionManageDAO;

    @Override
    public List<Mission> loadUserMissions(String userId, String level) {
        // Get mission list
        List<BigInteger> missionIds = missionManageDAO.findMissionIdByUserId(userId, level);

        // Get mission list
        List<MissionDO> missionDOS = missionManageDAO.findByLevel(level);

        // construct missions
        List<Mission> missions = new ArrayList<Mission>();
        for (MissionDO missionDO : missionDOS) {
            Mission mission = new Mission();
            mission.setCategory(missionDO.getCategory());
            mission.setLevel(missionDO.getLevel());
            mission.setServiceUrl(missionDO.getServiceUrl());
            mission.setPoints(missionDO.getPoints());
            mission.setDescription(missionDO.getDescription());
            mission.setTitle(missionDO.getTitle());
            mission.setId(missionDO.getId());

            // Check whether mission is success
            mission.setSuccess(missionIds.contains(missionDO.getId()));

            missions.add(mission);
        }

        // Sort
        Collections.sort(missions, new Comparator<Mission>() {
            @Override
            public int compare(Mission mission1, Mission mission2) {
                return (mission1.isSuccess() != mission2.isSuccess())
                    ? (!mission1.isSuccess()) ? -1 : 1
                    : 0;
            }
        });

        return missions;
    }
}
