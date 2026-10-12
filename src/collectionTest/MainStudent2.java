package collectionTest;

import java.util.ArrayList;
import java.util.List;

public class MainStudent2 {

	public static void main(String[] args) {
		
//		List<Student> studentList = new -> List 인터페이스 이므로 인스턴스화 불가능
		ArrayList<Student> studentList = new ArrayList<Student>();
		//ArrayList인 studentList에는 Student 클래스로 만든 객체만 넣겠다!!
		
		List<Student> list = new ArrayList<Student>();
		list = studentList; //업 캐스팅
		//업 캐스팅->ArrayList 를 List 인터페이스를 구현하고 있음
		
		Student stu1 = new Student();
		stu1.name = "홍길동";
		studentList.add(stu1); //인덱스 0
		studentList.add(stu1); //인덱스 1
		studentList.add(stu1); //인덱스 2
		
		studentList.get(1);
		
		for(int i=0;i<studentList.size();i++) {
			System.out.println(studentList.get(i).name);
		}
		
		//향상된 for문
		for(Student student :studentList) {
			System.out.println(student.name);
		}
		
		ArrayList<Integer> ints = new ArrayList<Integer>();
		//ArrayList인 ints에는 integer->정수만 넣겠다!!
		ints.add(10);//0
		ints.add(20);//1
		ints.add(30);//2
		
		for(Integer integer :ints) {
			System.out.println(integer);
		}
		
		ArrayList<String> strs = new ArrayList<String>();
		//ArrayList인 strs에는 String->문자열만 넣겠다!!
		strs.add("Korea1");//0
		strs.add("Korea2");//1
		strs.add("Korea3");//2
		strs.add("Korea3");//3
		strs.add("Korea3");//4
		
		for(String string :strs) {
			System.out.println(string);
		}
		
		System.out.println(strs.get(2)); //문자열 인덱스까지만
		System.out.println(ints.get(2)); //wrapper클래스도 인덱스까지만
		
		//ArrayList 메서드 5개 ==> add(추가할 객체)->추가, remove(인덱스)->삭제, 
		//set(인덱스)-> 수정, get(인덱스)->가져오기, size()->크기
		
		System.out.println(strs.contains("Korea2")); 
		//해당 ArrayList에 특정 값이 포함되어 있는지의 여부, 있으면 true, 없으면 false 
		System.out.println(ints.contains(120));
		
		System.out.println(ints);
		System.out.println(strs);
		
	}

}
