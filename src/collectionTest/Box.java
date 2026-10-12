package collectionTest;

public class Box<T> { //제네릭을 사용한 클래스
	//<T> -> 자료형을 나중에 지정하겠다라는 의미 ->T는 가변형 자료구조
	
	private T itemName; //itemName 멤버 변수의 자료형이 나중에 지정이됨

	public T getItemName() {
		return itemName;
	}

	public void setItemName(T itemName) {
		this.itemName = itemName;
	}

	public void printItem(T name) {
		System.out.println(name);
	}
	
}
