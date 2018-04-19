import java.util.*;
import java.io.*;


import java.util.List;

public class Bank_System {
	
	/**
	 * 
	 */
	private String BankName;
	/**
	 * 
	 */
	private List<paymentMethod> paymentMethod;
	/**
	 * Getter of BankName
	 */
	public String getBankName() {
	 	 return BankName; 
	}
	/**
	 * Setter of BankName
	 */
	public void setBankName(String BankName) { 
		 this.BankName = BankName; 
	}
	/**
	 * Getter of paymentMethod
	 */
	public List<paymentMethod> getpaymentMethod() {
	 	 return paymentMethod; 
	}
	/**
	 * Setter of paymentMethod
	 */
	public void setpaymentMethod(List<paymentMethod> paymentMethod) { 
		 this.paymentMethod = paymentMethod; 
	}
	/**
	 * 
	 */
	public Integer ValidateTransaction() throws java.io.IOException { 
		// TODO Auto-generated method
		Integer n=0;
		paymentMethod tmp = new paymentMethod();
		BonVoyage fly = new BonVoyage();
		for(int i=0; i<fly.Bank_Accounts.size();i++){
			tmp = (paymentMethod)fly.Bank_Accounts.elementAt(i);
			System.out.println("Card Number is " +tmp.getCard_Number());
			if(tmp.getCard_Number().equals(paymentMethod.get(0).getCard_Number())) {
				
				System.out.println("Card Number is " +tmp.getCard_Number());
				if(tmp.getAmount() > paymentMethod.get(0).getAmount()) {
					System.out.println("Enough Amount found in the Card Account");
					return 1;
				}
				else {
					System.out.println("Not Enough Amount in the Card Account to Process the Transaction");
					return 2;
				} 
			}
			else {
				n = n+1;
			}
		}	
		if (n == fly.Bank_Accounts.size()) {
			System.out.println("Not a Valid Credit card");
			return 2;
		}
		return 0;
	 } 
	
	public Bank_System () {

	}

	public Bank_System (String bank_name) {
	
		this.BankName = bank_name;	
	}

}
