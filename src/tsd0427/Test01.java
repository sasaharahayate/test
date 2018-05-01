package tsd0427;

import java.util.LinkedHashMap;
import java.util.Map;


public class Test01 {

	public static void main(String[] args) {


		Map<String, String> map = new LinkedHashMap<>();
        map.put("1", "1111");
        map.put("3", "333");
        map.put("2", "22222");

//        //キーの表示
//        for (String key : map.keySet()) {
//			System.out.println("key :" + key);
//		}
//
//        //値の表示
//        for (String val : map.values()) {
//			System.out.println("val :" + val);
//		}

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }



	}



}
