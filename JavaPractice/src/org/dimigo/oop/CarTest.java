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
 * 
 * @author : 이준구
 * @version : 1.0
 */
public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 : " + car.getcompany());
		System.out.println("모델명 : " + car.getmodel());
		System.out.println("색상 : " + car.getcolor());
		System.out.println("최대속도 : " + car.getmaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d",car.getprice()) + "원");
		System.out.println();

		Car car2 = new Car();
				
		car2.setcompany("기아자동차");
		car2.setmodel("K7");
		car2.setcolor("흰색");
		car2.setmaxSpeed(246);
		car2.setprice(40000000);
		
		System.out.println("제조사명 : " + car2.getcompany());
		System.out.println("모델명 : " + car2.getmodel());
		System.out.println("색상 : " + car2.getcolor());
		System.out.println("최대속도 : " + car2.getmaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d",car2.getprice()) + "원");
		System.out.println();
		
		Car car3 = new Car();
		
		car3.setcompany("삼성자동차");
		car3.setmodel("SM7");
		car3.setcolor("회색");
		car3.setmaxSpeed(200);
		car3.setprice(38000000);
		
		System.out.println("제조사명 : " + car3.getcompany());
		System.out.println("모델명 : " + car3.getmodel());
		System.out.println("색상 : " + car3.getcolor());
		System.out.println("최대속도 : " + car3.getmaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d",car3.getprice()) + "원");
		
		
		
	
	}
}