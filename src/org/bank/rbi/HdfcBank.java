package org.bank.rbi;

public class HdfcBank extends RbiBank{

public void savings() {
	// TODO Auto-generated method stub
System.out.println("Savings 100%");

}
public static void main(String[] args) {
	HdfcBank z = new HdfcBank();
			z.savings();
			z.deposit();
			
	
}
}
