package com.moli.spi;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * @author moli
 * @time 2024-03-21 21:08:29
 * @description 日志发现服务
 */
public class LoggerService {

    private static final LoggerService LOGGERSERVICE = new LoggerService();

    private final Logger logger;

    private final List<Logger> loggerList;

    private LoggerService() {
        // 1. 创建服务发现加载对象 并将所有的服务实现加入
        ServiceLoader<Logger> loader = ServiceLoader.load(Logger.class);
        this.loggerList = new ArrayList<>();
        for (Logger log : loader) {
            loggerList.add(log);
        }

        // 2. 使用第一个logger
        if (loggerList.isEmpty()) {
            logger = null;
        } else {
            logger = loggerList.get(0);
        }
    }

    public static LoggerService getLoggerService() {
        return LOGGERSERVICE;
    }

    public void info(String msg) {
        if (logger == null) {
            System.out.println("info 中没有发现 Logger服务提供者");
        } else {
            logger.info(msg);
        }
    }

    public void debug(String msg) {
        if (loggerList.isEmpty()) {
            System.out.println("debug 没有发现 Logger服务提供者");
        }
        loggerList.forEach(log -> log.debug(msg));
    }
}
