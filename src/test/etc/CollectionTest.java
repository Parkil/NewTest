package test.etc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//java collection stream 관련 예제
public class CollectionTest {
    public static void main(String[] args) {
        //테스트 데이터 생성
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();

        Map<String,Object> map1 = new HashMap<String,Object>();
        map1.put("key","key1");
        map1.put("val","val1");

        Map<String,Object> map2 = new HashMap<String,Object>();
        map2.put("key","key2");
        map2.put("val","val2");

        list.add(map1);
        list.add(map2);

        //리스트 내부의 값을 리스트로 반환
        List<Object> keyList = list.stream().map(e -> e.get("key")).collect(Collectors.toList());
        for(Object aaa : keyList) {
            System.out.println(aaa);
        }

        //리스트중 조건을 충족하는 값만 리스트로 분할처리
        Map<Boolean, List<Map<String, Object>>> group = list.stream().collect(Collectors.partitioningBy(e -> e.get("key").equals("key2")));
        System.out.println(group.get(true)); //값이 true면 조건을 충족하는값, false면 조건을 충족하지 않는값
    }
}
