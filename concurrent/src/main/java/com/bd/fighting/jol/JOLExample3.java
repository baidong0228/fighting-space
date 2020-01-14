package com.bd.fighting.jol;/*
 * Copyright (c) 2016-2026 Founder Bdong. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * Founder. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the agreements
 * you entered into with Founder.
 *
 */
import org.openjdk.jol.info.ClassLayout;

/**
 * This class of JOLExample is used for ...
 * 偏向锁
 *
 * @author Bdong
 * @version 1.0 2020-01-13 20:28
 */
public class JOLExample3 {
    static A a = new A();

    public static void main(String[] args) throws InterruptedException {
//        Thread.sleep(999);
        Thread.sleep(3000);
        System.out.println("befor hash==========");
        System.out.println(ClassLayout.parseInstance(a).toPrintable());
        synchronized (a){
            System.out.println("synchronized===========");
            System.out.println(ClassLayout.parseInstance(a).toPrintable());
        }
        System.out.println("after hash==========");
        System.out.println(ClassLayout.parseInstance(a).toPrintable());

    }

}
