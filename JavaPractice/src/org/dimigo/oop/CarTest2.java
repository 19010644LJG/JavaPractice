/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 * org.dimigo.oop
 * 	 |_CarTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 23. 
 * </pre>
 * Car.java
 * @author : 이준구
 * @version : 1.0
 */
public class CarTest2 {

	public static void main(String[] args) {
		Car2 car = new Car2();
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 : " + car.getcompany());
		System.out.println("모델명 : " + car.getmodel());
		System.out.println("색상 : " + car.getcolor());
		System.out.println("최대속도 : " + car.getmaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d",car.getprice()) + "원");
		System.out.println();

		Car2 car2 = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
		
		System.out.println("제조사명 : " + car2.getcompany());
		System.out.println("모델명 : " + car2.getmodel());
		System.out.println("색상 : " + car2.getcolor());
		System.out.println("최대속도 : " + car2.getmaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d",car2.getprice()) + "원");
		System.out.println();
		
		Car2 car3 = new Car2("삼성자동차", "SM7","회색",200,38000000);
		
		
		System.out.println("제조사명 : " + car3.getcompany());
		System.out.println("모델명 : " + car3.getmodel());
		System.out.println("색상 : " + car3.getcolor());
		System.out.println("최대속도 : " + car3.getmaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d",car3.getprice()) + "원");
		
		
		
	
	}
}