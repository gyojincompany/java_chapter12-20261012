package collectionTest;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

	public static void main(String[] args) {
		
		HashSet<Student> studentSet = new HashSet<Student>();
		HashSet<Integer> integerSet = new HashSet<Integer>();
		HashSet<String> stringSet = new HashSet<String>();
		
		Set<Student> set = new HashSet<Student>(); //업캐스팅 가능
		
		Student stu1 = new Student();
		stu1.name = "홍길동";
		Student stu2 = new Student();
		stu2.name = "이순신";
		Student stu3 = new Student();
		stu3.name = "김유신";
		Student stu4 = new Student();
		stu4.name = "강감찬";
		
		studentSet.add(stu1);
		studentSet.add(stu2);
		studentSet.add(stu3);
		studentSet.add(stu4);
		
		stringSet.add("대한민국");
		stringSet.add("일본");
		stringSet.add("미국");
		stringSet.add("중국");
		stringSet.add("중국");
		stringSet.add("중국");
		
		System.out.println(stringSet); //set->순서가 없음, 중복 허용하지 않는다!
		
//		stringSet.get(); //인덱스 즉, 순서가 없으므로 get 사용 불가->for(int i=0...) 사용 불가
		for(String str:stringSet) {
			System.out.println(str);			
		}
		
	}

}
