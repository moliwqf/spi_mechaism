import com.moli.spi.LoggerService;

/**
 * @author moli
 * @time 2024-03-21 21:34:26
 * @description 测试信息
 */
public class Main {

    public static void main(String[] args) {
        LoggerService loggerService = LoggerService.getLoggerService();
        loggerService.info("你好");
        loggerService.debug("测试Java SPI 机制");
    }

}
