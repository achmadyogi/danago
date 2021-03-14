/**
 * Dana.id
 * Copyright (c) 2017‐2021 All Rights Reserved.
 */
package com.manda.go.service.impl;

import com.manda.go.facade.HelloWorldGo;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: HelloWorldGoImpl.java, v 0.1 2021‐02‐25 14.08 Achmad Yogi Prakoso Exp $$
 */
public class HelloWorldGoImpl implements HelloWorldGo {
    @Override
    public String hello() {
        return "Yes, go ahead!";
    }
}
