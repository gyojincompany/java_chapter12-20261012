package exer;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		//List<Integer> list = new ArrayList<>(); -> 업캐스팅
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		numberList.add(50);
		
		//wrapper 클래스->Integer, Double...
		
		for(int number: numberList) {
			System.out.println(number);
		}
		
		System.out.println(numberList.get(2));
		System.out.println(numberList.size()); //배열->length, 컬렉션->size()
		numberList.remove(1); //인덱스로 삭제

	}

}
