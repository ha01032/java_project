package ch02_1017;

public class Variable1 {

	public static void main(String[] args) {

		int level;              //정수형 변수 level을 선언
		
		level = 10;		//level 변수에 10을 대입
		//초기화: 최초의 변수에 값을 할당하는 것을 말함.
		byte b1 = 12; // 변수를 선언과 동시에 값을 할당.
		
		//기본 데이터 타입 primitive type,
		//기본 타입을 제외한 나머지를 참조형 타입, (주로 참조형을 많이 사용합니다.)
		//참조형 타입 : 클래스 타입,   >객체 지향 언어기 때문에 자주 보게 될것!
		//class Person
		//참조형 타입으로 선언하게 되면,
		//Person p1; 선언만.
		//p1 = new Person; 기본 생성자 호출
		//생성자의 역할은 값을 초기화 하는 역할.
		
		System.out.println(level); 
	}

}
