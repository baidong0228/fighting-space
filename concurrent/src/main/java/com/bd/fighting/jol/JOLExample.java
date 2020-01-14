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
import org.openjdk.jol.vm.VM;

/**
 * This class of JOLExample is used for ...
 * 打印对象头
 *
 * @author Bdong
 * @version 1.0 2020-01-13 20:28
 */
public class JOLExample {
    static A a = new A();

    public static void main(String[] args) {
        System.out.println(VM.current().details());
        System.out.println(ClassLayout.parseInstance(a).toPrintable());
    }

}
