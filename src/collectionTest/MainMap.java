package collectionTest;

import java.util.HashMap;
import java.util.Map;

public class MainMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		Map<String, String> map2 = new HashMap<String, String>(); //업 캐스팅
		
		map1.put("나이", 27); //{"나이":27}
		map1.put("학년", 4); //{"학년":4}
		map1.put("재산", 1000000); //{"재산":1000000}
//		map1.put("나이", 30);
		
		System.out.println(map1);
		
		System.out.println(map1.get("나이"));

		map1.put("학년", 3); //3학년으로 수정
		
		System.out.println(map1.get("학년"));
		
		map1.remove("재산");
		
		System.out.println(map1);
		
		map2.put("이름", "홍길동");
	}

}
