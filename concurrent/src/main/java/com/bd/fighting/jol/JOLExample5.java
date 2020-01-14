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
 * This class of JOLExample is used for ...
 * 偏向锁和轻量级锁的相率问题
 *
 * 偏向锁效率远高于轻量级锁
 *
 * @author Bdong
 * @version 1.0 2020-01-13 20:28
 */
public class JOLExample5 {

    public static void main(String[] args) {
        System.out.println(String.format("start"));
        B b = new B();
        long start = System.currentTimeMillis();
        for (int i=0;i<1000000000L;i++){
            b.substract();
        }
        long end = System.currentTimeMillis();
        System.out.println(String.format("%sms",end-start));
    }

}
