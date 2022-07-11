package ClassAndObject;

public class AccountHolderObjects {

	public static void main(String[] args) {
		
		accountHolder tom = new accountHolder();
		accountHolder henry = new accountHolder();
		accountHolder sara = new accountHolder();
		
		tom.firstName="TOM";
		tom.lastName="Smith";
		tom.age=21;
		tom.accountBalance=1000;
		tom.testEligibilityForCreditCard();
		System.out.println("Is Tom Eligible for cc : "+tom.eligibleForCreditCard);
		

		henry.firstName="Henry";
		henry.lastName="Smith";
		henry.age=31;
		henry.accountBalance=20001;
		henry.testEligibilityForCreditCard();
		System.out.println("Is Henry Eligible for cc : "+henry.eligibleForCreditCard);
		
		
	}
	
	
	
	
}
