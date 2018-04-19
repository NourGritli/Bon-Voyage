import java.util.*;
import java.io.*;


public class AuthenticatedUser extends User {

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
		BonVoyage fly = new BonVoyage();
		AuthenticatedUser tmp = new AuthenticatedUser();
		int input, n=0;
		for(int i=0;i<fly.usr_list.size();i++)
                {
			tmp = (AuthenticatedUser)fly.usr_list.elementAt(i);
			if(tmp.Username.equals(Username) && tmp.Password.equals(Password)) {
                                System.out.println("\n");
                                System.out.println("Login Successful");
                                System.out.println("\n");
				System.out.println("welcome " + tmp.getName());

				do
				{
					System.out.println("-----------------------\n");
					System.out.println("BonVoyage- AuthenticatedUser Menu");
					System.out.println("-----------------------\n");
					System.out.println("1.View Account");
					System.out.println("2.Modify Account");
					System.out.println("3.Logout");
					input = read.GetInt();
					switch(input)
					{
					case 1:
						System.out.println("account id " + tmp.account.getAccountID());
						tmp.account.View();
						break;
					case 2:
						tmp.account.Modify();
						break;
					case 3:
						Logout();
						break;
					default:
					        System.out.println("Wrong Menu options Entered\n");


					}
				} while(input!=3);
			}
			else{
				n=n+1;
			}
		 }

		 if (n == fly.usr_list.size()) {
			System.out.println("\n       ************************************************   ");
			System.out.println("            Username or Password invalid 		        ");
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

	public AuthenticatedUser() {

	}

	public AuthenticatedUser(String uname, String pass,String Name, int Age, String Email, String Location, int phonenumber, char gender) {

                this.Username = uname;
                this.Password = pass;
		this.setName(Name);
		this.setAge(Age);
		this.setEmail(Email);
		this.setLocation(Location);
		this.setPhoneNumber(phonenumber);
		this.setGender(gender);

        }


}
