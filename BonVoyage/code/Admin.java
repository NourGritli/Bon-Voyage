import java.util.*;
import java.io.*;


public class Admin {

	/**
	 *
	 */
	private String Username;
	/**
	 *
	 */
	private String Password;
	/**
	 *
	 */
	private String Email;
	/**
	 *
	 */
	private Integer PhoneNumber;
	/**
	 *
	 */
	private Account account;
	/**
	 * Getter of Username
	 */
	public String getUsername() {
	 	 return Username;
	}
	/**
	 * Setter of Username
	 */
	public void setUsername(String Username) {
		 this.Username = Username;
	}
	/**
	 * Getter of Password
	 */
	public String getPassword() {
	 	 return Password;
	}
	/**
	 * Setter of Password
	 */
	public void setPassword(String Password) {
		 this.Password = Password;
	}
	/**
	 * Getter of Email
	 */
	public String getEmail() {
	 	 return Email;
	}
	/**
	 * Setter of Email
	 */
	public void setEmail(String Email) {
		 this.Email = Email;
	}
	/**
	 * Getter of PhoneNumber
	 */
	public Integer getPhoneNumber() {
	 	 return PhoneNumber;
	}
	/**
	 * Setter of PhoneNumber
	 */
	public void setPhoneNumber(Integer PhoneNumber) {
		 this.PhoneNumber = PhoneNumber;
	}
	/**
	 * Getter of account
	 */
	public Account getAccount() {
	 	 return account;
	}
	/**
	 * Setter of account
	 */
	public void setAccount(Account account) {
		 this.account = account;
	}
	/**
	 *
	 */
	public void Login() throws java.io.IOException {
		// TODO Auto-generated method
		int input;
		if(Username.equals("admin") && Password.equals("admin")) {
                                        System.out.println("\n");
                                        System.out.println("Admin Login Successful");
                                        System.out.println("\n");

                                do
                                {
                                        System.out.println("-----------------------\n");
                                        System.out.println("BonVoyage - Admin Menu");
                                        System.out.println("-----------------------\n");
                                        System.out.println("1.Update services");
                                        System.out.println("2.Delete services");
                                        System.out.println("3.Delete Account");
                                        System.out.println("4.Logout");
                                        input = read.GetInt();
                                        switch(input)
                                        {
                                        case 1:
                                                UpdateServiceItems();
                                                break;
                                        case 2:
                                                DeleteServiceItems();
                                                break;
                                        case 3:
                                        	System.out.println("Enter the Username of the Account you wish to delete");
						String uname = read.GetString();
						Member m = new Member();
						Account a = new Account();
						m.setUsername(uname);
						a.setMember(m);
                                                a.Delete();
                                                break;
                                        case 4:
                                                Logout();
                                                break;
                                        default:
                                                System.out.println("Wrong Menu options Entered\n");


                                        }
                                } while(input!=4);
		}
		else
		{
                        System.out.println("\n       ************************************************   ");
                        System.out.println("            Username or Password invalid                    ");
                        System.out.println("            Retry with correct username and password        ");
                        System.out.println("         ************************************************   ");

		}

	 }
	/**
	 *
	 */
	public void Logout() {
		// TODO Auto-generated method
	 }
	/**
	 *
	 */
	public void UpdateServiceItems() {
		// TODO Auto-generated method
	 }
	/**
	 *
	 */
	public void DeleteServiceItems() {
		// TODO Auto-generated method
	 }

}
