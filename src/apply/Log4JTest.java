package apply;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log4JTest {

    static Logger logger = Logger.getLogger(Log4JTest.class);//基于类名称获取日志对象

    public static void main(String[] args) throws InterruptedException {
        //testOne();
        //testTwo();
        testThree();
    }

    public static void testThree(){
        PropertyConfigurator.configure("D:\\ideaWorkSpace\\how2JTest\\src\\log4j.xml");
        logger.trace("跟踪信息");
        logger.debug("调试信息");
        logger.info("输出信息");
        logger.warn("警告信息");
        logger.error("错误信息");
        logger.fatal("致命信息");
    }

    public static void testTwo(){
        PropertyConfigurator.configure("D:\\ideaWorkSpace\\how2JTest\\src\\log4j.properties");
        logger.trace("跟踪信息");
        logger.debug("调试信息");
        logger.info("输出信息");
        logger.warn("警告信息");
        logger.error("错误信息");
        logger.fatal("致命信息");
    }

    public static void testOne() throws InterruptedException {
        BasicConfigurator.configure();//默认配置
        logger.setLevel(Level.ERROR);//设置输入级别，会输出配置项及以上级别的信息
        logger.trace("跟踪信息");
        logger.debug("调试信息");
        logger.info("输出信息");
        Thread.sleep(1000);
        logger.warn("警告信息");
        logger.error("错误信息");
        logger.fatal("致命信息");
    }
}
