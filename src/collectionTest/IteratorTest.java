package collectionTest;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		
		//Iterator -> 반복자
		//컬렉션에 들어 있는 데이터(객체)들을 하나씩 꺼내서 확인할 수 있게 해주는 도구
		
		ArrayList<String> names = new ArrayList<String>();
		
		//홍길동, 이순신, 김유신, 강감찬
		names.add("홍길동");
		names.add("이순신");
		names.add("김유신");
		names.add("강감찬");
		
		Iterator<String> iterator = names.iterator(); //iterator 생성
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			//iterator의 위치에서 다음 요소를 가져오고
			//다음 위치로 이동함
			System.out.println(name);
		}
		
		for(String name :names) {
			
			System.out.println(name);
		}
	}

}
