/**
 * 
 */
package org.dimigo.inheritance;

/**
 *<pre>
 * org.dimigo.inheritance
 * 	 |_PersonTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 8. 
 * </pre>
 * 
 * @author : 이준구
 * @version : 1.0
 */
public class PersonTest2{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Person[] Name = { 
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍")
		};
		
		for(Person p : Name){
			greeting(p);
		}

	}
private static void greeting(Person p){
			System.out.println(p.toString());
			p.sayHello();
			p.sayBye();
			System.out.println();
			}
}