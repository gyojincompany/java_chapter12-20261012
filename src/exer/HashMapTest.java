package exer;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		//Map -> key:value
		
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		//map add x -> put o
		scoreMap.put("홍길동", 90);
		scoreMap.put("김철수", 80);
		scoreMap.put("이영희", 95);
		
		System.out.println(scoreMap.get("홍길동")); //key로 찾는다.
		//김철수의 점수를 88로 수정
		scoreMap.put("김철수", 88);
	}

}
