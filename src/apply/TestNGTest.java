package apply;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTest {

    static Logger logger = Logger.getLogger(TestNGTest.class);
    String path = "D:\\ideaWorkSpace\\how2JTest\\src\\log4j.xml";

    @Test
    public void testOneMethod(){
        PropertyConfigurator.configure(path);
        logger.info("path====" + path);

        int index = path.indexOf(".");
        String tail = path.substring(index+1);

        logger.info("tail====" + tail);
        Assert.assertEquals(tail,"xml");
    }

    @Test
    public void testOneMethod2(){
        PropertyConfigurator.configure(path);
        logger.info("path====" + path);

        int index = path.indexOf(".");
        String tail = path.substring(index+1);

        logger.info("tail====" + tail);
        Assert.assertEquals(tail,"properties");
    }

}
