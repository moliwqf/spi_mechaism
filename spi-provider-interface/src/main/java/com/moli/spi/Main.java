package com.moli.spi;

/**
 * @author moli
 * @time 2024-03-21 21:14:54
 * @description 测试类
 */
public class Main {

    public static void main(String[] args) {

        LoggerService loggerService = LoggerService.getLoggerService();
        String msg = "测试logger 实现服务";

        loggerService.info(msg);
        loggerService.debug(msg);
    }
}
