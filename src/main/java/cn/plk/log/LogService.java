package cn.plk.log;

import org.apache.log4j.Logger;

/**
 * //TODO 添加类/接口功能描述
 * 
 * @author {康培亮/AB052634}
 */
public class LogService {

    private static Logger log = Logger.getLogger(LogService.class);

    public static Logger getLogger(Class<?> clazz) {
        if (clazz == null) {
            return Logger.getLogger(LogService.class);
        }
        return Logger.getLogger(clazz);
    }

    public static void info(String msg, String logType) {
        log.info(getMsg(msg, logType));
    }

    public static void debug(String msg, String logType) {
        log.debug(getMsg(msg, logType));
    }

    public static void error(String msg, String logType) {
        log.error(getMsg(msg, logType));
    }

    private static String getMsg(String msg, String logType) {
        return new StringBuffer().append("[").append(logType).append("]").append(msg).toString();
    }
}
