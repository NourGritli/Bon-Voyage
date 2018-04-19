import java.util.*;
import java.io.*;


public class Credit_Debitcard_Interac extends Payment {

	/**
	 * 
	 */
	private Integer Card_Number;
	/**
	 * 
	 */
	private String Name_on_Card;
	/**
	 * 
	 */
	private Integer Expiry_Date;
	/**
	 * 
	 */
	private Integer CVV;
	/**
	 * 
	 */
	private String TransactionID;
	/**
	 * 
	 */
	private Bank_System bank_system;
	/**
	 * Getter of Card_Number
	 */
	public Integer getCard_Number() {
	 	 return Card_Number; 
	}
	/**
	 * Setter of Card_Number
	 */
	public void setCard_Number(Integer Card_Number) { 
		 this.Card_Number = Card_Number; 
	}
	/**
	 * Getter of Name_on_Card
	 */
	public String getName_on_Card() {
	 	 return Name_on_Card; 
	}
	/**
	 * Setter of Name_on_Card
	 */
	public void setName_on_Card(String Name_on_Card) { 
		 this.Name_on_Card = Name_on_Card; 
	}
	/**
	 * Getter of Expiry_Date
	 */
	public Integer getExpiry_Date() {
	 	 return Expiry_Date; 
	}
	/**
	 * Setter of Expiry_Date
	 */
	public void setExpiry_Date(Integer Expiry_Date) { 
		 this.Expiry_Date = Expiry_Date; 
	}
	/**
	 * Getter of CVV
	 */
	public Integer getCVV() {
	 	 return CVV; 
	}
	/**
	 * Setter of CVV
	 */
	public void setCVV(Integer CVV) { 
		 this.CVV = CVV; 
	}
	/**
	 * Getter of TransactionID
	 */
	public String getTransactionID() {
	 	 return TransactionID; 
	}
	/**
	 * Setter of TransactionID
	 */
	public void setTransactionID(String TransactionID) { 
		 this.TransactionID = TransactionID; 
	}
	/**
	 * Getter of bank_system
	 */
	public Bank_System getBank_system() {
	 	 return bank_system; 
	}
	/**
	 * Setter of bank_system
	 */
	public void setBank_system(Bank_System bank_system) { 
		 this.bank_system = bank_system; 
	}
	/**
	 * 
	 */
	public void CreateTransaction() throws java.io.IOException { 
		// TODO Auto-generated method
	        System.out.println("Enter the Card Number:");
        	this.Card_Number = read.GetInt();		
	        System.out.println("Enter the Name on the Card:");
        	this.Name_on_Card = read.GetString();
	        System.out.println("Enter the Expiry date of the card: In this format mmyy");
        	this.Expiry_Date = read.GetInt();
        	System.out.println("Enter the CVV number: see it on back of the card");
        	this.CVV = read.GetInt();
		this.TransactionID = this.Name_on_Card;
	 } 

	public Credit_Debitcard_Interac() {

	
	}
	
	public Credit_Debitcard_Interac (Integer cardnum, String cardname, Integer expy, Integer cvv, Integer amt) {

		this.Card_Number = cardnum;
		this.Name_on_Card = cardname;
		this.Expiry_Date = expy;
		this.CVV = cvv;
		this.setAmount(amt);
	
	}

}
