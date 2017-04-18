/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 * org.dimigo.oop
 * 	 |_PiggyBankTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 18. 
 * </pre>
 * 
 * @author : 이준구
 * @version : 1.0
 */
	public class PiggyBankTest {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
		FamilyMember Dad = 	new FamilyMember("아빠");
		FamilyMember Mom = new FamilyMember("엄마");
		FamilyMember Me =	new FamilyMember("나");
		FamilyMember Bro =	new FamilyMember("남동생");
		FamilyMember.printMembercnt();
			PiggyBank bank = new PiggyBank();
			bank.putMoney(Dad, 10000);
			bank.putMoney(Mom, 5000);
			bank.putMoney(Me, 2000);
			bank.putMoney(Bro, 1000);
			
		PiggyBank.printBalance();
		
		bank.putMoney(Me, 1000);
		PiggyBank.printBalance();
			
		

		}

	}
		
		
		
	

