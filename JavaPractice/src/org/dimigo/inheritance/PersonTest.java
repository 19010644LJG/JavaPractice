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
public class PersonTest{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Person p = new Person("Tom");
		Korean k = new Korean("홍길동");
		Japanese J  = new Japanese("다나카");		
		Chinese C = new Chinese("왕밍");
		
		System.out.println(p.toString());
		System.out.println(k.toString());
		System.out.println(J.toString());	
		System.out.println(C.toString());
		System.out.println();
		
		p.sayHello();	
		k.SayHello();	
		J.SayHello();			
		C.SayHello();	
		System.out.println();
		
		p.sayBye();	
		k.SayBye();	
		J.SayBye();			
		C.SayBye();	
		
		
	}

}
