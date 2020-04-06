package test.etc;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.time.LocalDate;
import java.util.Date;

public class SignatureTest {
    public static void main(String[] args) throws Exception{
        System.out.println("arrival_arrival_code".replaceAll("^arrival_",""));
        /*
        String space = " ";  // 공백
        String newLine = "\n";  // 줄바꿈
        String method = "POST";  // HTTP 메서드
        String url = "/api/v1/mails";  // 도메인을 제외한 "/" 아래 전체 url (쿼리스트링 포함)
        String timestamp = String.valueOf(new Date().getTime());  // 현재 타임스탬프 (epoch, millisecond)
        String accessKey = "ObgjHcAWjWYJgp9MInwx";  // access key id (from portal or Sub Account)
        String secretKey = "QnGjaiFr6HDkDlQ9bkq2enb2Ayy49zUrLNqTvm8M";  // secret key (from portal or Sub Account)

        String message = new StringBuilder()
                .append(method)
                .append(space)
                .append(url)
                .append(newLine)
                .append(timestamp)
                .append(newLine)
                .append(accessKey)
                .toString();

        SecretKeySpec signingKey = new SecretKeySpec(secretKey.getBytes("UTF-8"), "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(signingKey);

        byte[] rawHmac = mac.doFinal(message.getBytes("UTF-8"));
        String encodeBase64String = Base64.encodeBase64String(rawHmac);

        System.out.println("sig : "+encodeBase64String);
        System.out.println("timestamp : "+timestamp);
        */
    }
}
