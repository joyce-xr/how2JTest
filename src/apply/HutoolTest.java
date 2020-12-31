package apply;

import cn.hutool.core.codec.Base32;
import cn.hutool.core.codec.Base64;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Validator;
import cn.hutool.core.text.UnicodeUtil;
import cn.hutool.crypto.digest.MD5;
import cn.hutool.extra.ftp.Ftp;
import cn.hutool.extra.qrcode.QrCodeUtil;
import org.apache.commons.net.ftp.FTP;
import org.testng.annotations.Test;

public class HutoolTest {

    @Test
    public void testBase3264(){
        String charset = "utf-8";

        String content = "welcome to china";
        System.out.println("原字符串："+ content);

        String code32= Base32.encode(content, charset);
        System.out.println("base32加密后："+code32);

        String code64 = Base64.encode(content,charset);
        System.out.println("base64加密后："+code64);
    }

    @Test
    public void testUnicode(){
        String content = "welcome to china";
        System.out.println("原字符串："+ content);

        String unicode = UnicodeUtil.toUnicode(content,false);
        System.out.println("获取Unicode："+ unicode);

    }

    @Test
    public void testQR(){
        String qrCode = "https://how2j.cn/k/hutool/hutool-qrcode/1983.html#nowhere";
        String picPath = "D:\\ideaWorkSpace\\fileTest\\QRpic.jpg";

        //字符串转二维码
        QrCodeUtil.generate(qrCode,300,300, FileUtil.file(picPath));

        //二维码图片转字符串
        qrCode = QrCodeUtil.decode(FileUtil.file(picPath));
        System.out.println(qrCode);
    }

    @Test
    public void testFTP(){
        String localFile = "D:\\ideaWorkSpace\\fileTest\\QRpic.jpg";
        String localFile4Download = "D:\\ideaWorkSpace\\fileTest\\jsb_20191021_1.sql";
        String remoteFolder = "/projects/jiaoshoujia/DL_1.9/sql";
        String remoteFile4Download = "jsb_20191021_1.sql";
        String ftpServer = "172.23.2.1";
        String ftpUser = "ftpuser";
        String ftpPsw = "";

        Ftp ftp = new Ftp(ftpServer,21,ftpUser,ftpPsw);

        //上传(远程路径，本地文件)
        boolean success = ftp.upload(remoteFolder,FileUtil.file(localFile));
        System.out.println("上传成功？" + success);

        //下载
        ftp.download(remoteFolder,remoteFile4Download,FileUtil.file(localFile4Download));
    }

    @Test
    public void validatorTest(){
        System.out.println(Validator.isMobile("14111111111"));
        System.out.println(Validator.isPlateNumber("鄂Z11111"));
    }
}
