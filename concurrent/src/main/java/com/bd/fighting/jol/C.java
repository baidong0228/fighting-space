package com.bd.fighting.jol;/*
 * Copyright (c) 2016-2026 Founder Bdong. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * Founder. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the agreements
 * you entered into with Founder.
 *
 */

/**
 * This class of B is used for ...
 *
 * @author Bdong
 * @version 1.0 2020-01-14 15:04
 */
public class C {
    int i = 0 ;

    public synchronized void substract(){
        i++;
        JOLExample6.countDownLatch.countDown();
    }
}
