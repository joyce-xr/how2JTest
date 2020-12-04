package apply;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.mail.MailAccount;
import cn.hutool.extra.mail.MailUtil;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HuToolMailTest {
    private MailAccount account;

    @BeforeTest
    public void init(){
        account = new MailAccount();
        account.setHost("smtp.163.com");
        account.setPort(25);
        account.setAuth(true);
        account.setFrom("joyfully_xr@163.com");
        account.setUser("joyfully_xr@163.com");
        account.setPass("xinran0949@wy163");

    }

    @Test
    public void testText(){//发送普通文本邮件
        //参数说明：邮箱账户，接收邮箱，主题，邮件内容，是否html
        MailUtil.send(account,"joyfully_xr@163.com", "hutool 测试邮件" + DateUtil.now(), "测试内容", false);
    }

    @Test
    public void testHtml(){//发送带html格式的邮件
        //参数说明：邮箱账户，接收邮箱，主题，邮件内容，是否html
        MailUtil.send(account,"joyfully_xr@163.com","hutool 测试邮件" +DateUtil.now(),"<b>测试内容（带格式）</b>",true);
    }

    @Test
    public void testAttachment(){
        //参数说明：邮箱账户，接收邮箱，主题，邮件内容，是否html，附件路径
        MailUtil.send(account,"joyfully_xr@163.com","hutool 测试邮件" +DateUtil.now(),"<b>测试内容（带格式）</b>",true, FileUtil.file("D:\\ideaWorkSpace\\fileTest\\AutoJava.java"));
    }
}
