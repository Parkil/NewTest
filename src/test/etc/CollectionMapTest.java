package test.etc;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionMapTest {
    public static void main(String[] args) throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();

        map.put("type_val1","");
        map.put("type_val2","");
        map.put("type_val3","");
        map.put("type_val4","");
        map.put("type_val5","");

        map.put("type2_val1","val1");
        map.put("type2_val2","val2");
        map.put("type2_val3","val3");
        map.put("type2_val4","val4");
        map.put("type2_val5","val5");

        Map<String,Object> t1 = map.entrySet().stream().filter(e -> e.getKey().startsWith("type_") && "".equals(e.getValue()) == false).collect(Collectors.toMap(x -> x.getKey().replace("type_",""), x -> x.getValue()));
        System.out.println(t1);
    }
}
