package test.etc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    정규식 테스트 예제
 */
public class RegExTest {
    public static void main(String[] args) {
        String inputStr = "ICN LAX   - OPERATIONAL LEG KE 0011";
        Pattern p = Pattern.compile(".*OPERATIONAL\\h+LEG\\h+\\w+\\h+(\\w+).*");
        Matcher m = p.matcher(inputStr);

        if(m.matches()) {
            System.out.println(m.group());
            System.out.println(m.group(1));
        }
    }
}
