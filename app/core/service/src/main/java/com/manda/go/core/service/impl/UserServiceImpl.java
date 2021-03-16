/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.core.service.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;

import com.manda.go.common.dal.dai.AvatarManageDAO;
import com.manda.go.common.dal.dai.GamePlayManageDAO;
import com.manda.go.common.dal.dao.AvatarDO;
import com.manda.go.core.model.entity.Avatar;
import com.manda.go.core.model.entity.GamePlay;
import com.manda.go.core.service.UserService;
import com.manda.go.core.service.constant.LevelEnum;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: UserServiceImpl.java, v 0.1 2021‐03‐16 10.00 Achmad Yogi Prakoso Exp $$
 */
@MapperScan("com.manda.go.common.dal.dai")
public class UserServiceImpl implements UserService {

    /** max daily game */
    private final int MAX_DAILY_GAME = 3;

    @Autowired
    AvatarManageDAO   avatarManageDAO;

    @Autowired
    GamePlayManageDAO gamePlayManageDAO;

    @Override
    public Avatar loadAvatar(String userId) {
        // Initiate Avatar
        Avatar avatar = new Avatar();

        // Get avatar
        AvatarDO avatarDO = avatarManageDAO.findById(userId);

        // Get game play
        int currentGameAmount = gamePlayManageDAO.dailyGameCount(userId);
        int availableGameCount = Math.max(MAX_DAILY_GAME - currentGameAmount, 0);

        // Compose avatar
        if (avatarDO == null) {
            avatar.setLevel(LevelEnum.IRON.getCode());
            return avatar;
        }

        // Allow to play
        LevelEnum currentLevel = LevelEnum.getByCode(avatarDO.getLevel());
        if (currentLevel == LevelEnum.IRON || currentLevel == LevelEnum.BRONZE) {
            avatar.setAllowGamePlay(false);
        } else {
            // Not allowed when game count is zero
            avatar.setAllowGamePlay(availableGameCount != 0);
            avatar.setGamePlay(new GamePlay(availableGameCount));
        }
        avatar.setUserId(avatarDO.getUserId());
        avatar.setPoints(avatarDO.getPoints());
        avatar.setLevel(avatarDO.getLevel());

        return avatar;
    }
}
