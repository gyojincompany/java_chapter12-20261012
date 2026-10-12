package collectionTest;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest2 {

	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		//<Student>->제네릭->이 자료형에 맞지 않는 데이터는 받지 않겠다!
		
		ArrayList sList = new ArrayList(); //<?> 타입을 지정하지 않고 사용하는 경우 백엔드 x
		//제네릭 쓰지 않고 선언하기
		sList.add("홍길동");
		sList.add(200);
		
		sList.get(0); //홍길동
		sList.get(1); //200
		
		for(Object obj:sList) {
			System.out.println(obj); 
		}
		
		
		
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		Student stu4 = new Student();
		
		stu1.name = "홍길동";
		stu2.name = "이순신";
		stu3.name = "김유신";
		stu4.name = "강감찬";
		
		studentList.add(stu1);
		studentList.add(stu2);
		studentList.add(stu3);
		studentList.add(stu4);
		
		Iterator<Student> iterator = studentList.iterator();
		
		while(iterator.hasNext()) {
			Student student = iterator.next(); //다음 객체요소를 가져온 후 iteraotr가 다음으로 이동
			System.out.println(student.name);
		}

	}

}
