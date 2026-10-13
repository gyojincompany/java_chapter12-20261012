package exer;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
		HashSet<String> langSet = new HashSet<String>();
		
//		Set<String> set = new HashSet<String>(); ->업 캐스팅
		
		langSet.add("Java");
		langSet.add("Spring");
		langSet.add("Java");
		langSet.add("React");
		langSet.add("Spring");
		
		//Set -> 중복 제거
		
		System.out.println(langSet.size());
		
		for(String lang:langSet) {
			System.out.println(lang);
		}
		
		//Set 컬렉션은 인덱스가 없으므로 아래 방법은 불가능!
		for(int i=0;i<langSet.size();i++) {
//			langSet.get(i); //Set->get 메서드가 존재하지 않음
		}
		

	}

}
