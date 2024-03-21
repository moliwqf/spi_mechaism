package com.moli.service;

import com.moli.spi.Logger;

/**
 * @author moli
 * @time 2024-03-21 21:17:43
 * @description 真正的服务提供者
 */
public class Logback implements Logger {
    @Override
    public void info(String msg) {
        System.out.println("Logback 打印 info 级别的信息: " + msg);
    }

    @Override
    public void debug(String msg) {
        System.out.println("Logback 打印 debug 级别的信息: " + msg);
    }
}
