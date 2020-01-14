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
 * 新创建的对象是没有hashcode的
 * 只有调用计算hashcode，对象头中才有hashcode
 *
 * @author Bdong
 * @version 1.0 2020-01-13 20:28
 */
public class JOLExample2 {
    static A a = new A();

    public static void main(String[] args) {
        System.out.println("befor hash==========");
        System.out.println(ClassLayout.parseInstance(a).toPrintable());
        System.out.println("jvm 计算hashcode ==> 0x"+Integer.toHexString(a.hashCode()));
        /** 小端存储 **/
        System.out.println("after hash==========");
        System.out.println(ClassLayout.parseInstance(a).toPrintable());

    }

}
