package com.moli.service;

import com.moli.spi.Logger;

/**
 * @author moli
 * @time 2024-03-22 10:59:18
 * @description Log4j日志服务
 */
public class Log4j implements Logger {

    @Override
    public void info(String msg) {
        System.out.println("Log4j 实现 info 级别日志打印:" + msg);
    }

    @Override
    public void debug(String msg) {
        System.out.println("Log4j 实现 debug 级别日志打印:" + msg);
    }
}
