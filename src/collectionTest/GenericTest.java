package collectionTest;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
//		ArrayList<String> strs = new ArrayList<>();->뒤에 <> 생략가능
		
		Box box = new Box();
		box.setItemName("사과박스"); //setter 사용하여 초기화
		System.out.println(box.getItemName()); //getter 사용하여 초기화->사과박스 출력
		
		//itemName -> String -> 문자열만 저장 가능하고 정수나 실수는 저장 불가능
		//itemName에 정수를 저장하고 싶다면? -> 클래스 하나 더 만들어야 하나?
		//itemName 실수를 저장하고 싶다면? -> 클래스 하나 더 만들어야 하나?
		//문자열, 정수, 실수를 각각 저장할 수 있는 박스 객체를 3개 만들어야 됨
		//제네릭을 사용하면 클래스하나로 해결됨
		
		box.setItemName(100);
		System.out.println(box.getItemName());
		box.setItemName(100.55);
		System.out.println(box.getItemName());
	}

}
