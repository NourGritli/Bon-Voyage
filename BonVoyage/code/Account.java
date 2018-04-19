import java.util.*;
import java.io.*;


public class Account {

	/**
	 * 
	 */
	private Integer AccountID;
	/**
	 * 
	 */
	private AuthenticatedUser AuthenticatedUser;
	/**
	 * 
	 */
	private Admin admin;
	/**
	 * Getter of AccountID
	 */
	public Integer getAccountID() {
	 	 return AccountID; 
	}
	/**
	 * Setter of AccountID
	 */
	public void setAccountID(Integer AccountID) { 
		 this.AccountID = AccountID; 
	}
	/**
	 * Getter of AuthenticatedUser
	 */
	public AuthenticatedUser getAuthenticatedUser() {
	 	 return AuthenticatedUser; 
	}
	/**
	 * Setter of AuthenticatedUser
	 */
	public void setAuthenticatedUser(AuthenticatedUser AuthenticatedUser) { 
		 this.AuthenticatedUser = AuthenticatedUser; 
	}
	/**
	 * Getter of admin
	 */
	public Admin getAdmin() {
	 	 return admin; 
	}
	/**
	 * Setter of admin
	 */
	public void setAdmin(Admin admin) { 
		 this.admin = admin; 
	}
	/**
	 * 
	 */
	public void View() throws java.io.IOException { 
		// TODO Auto-generated method
		//System.out.println("Account ID : " + AccountID);
		System.out.println("Account ID : " + AccountID + " Username : " + AuthenticatedUser.getUsername()+"\n");
		System.out.println("FullName : " + AuthenticatedUser.getName());
		System.out.println("Gender : " + AuthenticatedUser.getGender());
		System.out.println("Age : " + AuthenticatedUser.getAge());
		System.out.println("Location : " + AuthenticatedUser.getLocation());
		System.out.println("Email : " + AuthenticatedUser.getEmail());
		System.out.println("PhoneNumber : " + AuthenticatedUser.getPhoneNumber());
		System.out.println("Bookings : \n" );
	 }
	/**
	 * 
	 */
	public void Delete() { 
		// TODO Auto-generated method
		BonVoyage fly_d = new BonVoyage();
                AuthenticatedUser tmp = new AuthenticatedUser();
		int n=0;
                for(int i=0;i<fly_d.usr_list.size();i++)
                {
			tmp = (AuthenticatedUser)fly_d.usr_list.elementAt(i);
			if(tmp.getUsername().equals(AuthenticatedUser.getUsername())){
				fly_d.usr_list.removeElement(tmp);			
				System.out.println("The User Account : " + tmp.getUsername()+ " deleted");
			}
			else{
				n=n+1;
			}
		}		
		if(n == fly_d.usr_list.size()){
			System.out.println("No valid Username " + AuthenticatedUser.getUsername() + " exists");				
		}

	 }
	/**
	 * 
	 */
	public void Modify() throws java.io.IOException { 
		// TODO Auto-generated method
		String input,s_op;
		Integer i_op;
		char c_op;
                System.out.println("Account ID : " + AccountID + " Username : " + AuthenticatedUser.getUsername()+"\n");
                System.out.println("FullName : " + AuthenticatedUser.getName());
                System.out.println("Gender : " + AuthenticatedUser.getGender());
                System.out.println("Age : " + AuthenticatedUser.getAge());
                System.out.println("Location : " + AuthenticatedUser.getLocation());
                System.out.println("Email : " + AuthenticatedUser.getEmail());
                System.out.println("PhoneNumber : " + AuthenticatedUser.getPhoneNumber());
                System.out.println("Bookings : \n" );
               	System.out.println("---------------------------------------------------------------------------------" );
		System.out.println("Enter the section Name you want to modify : (example enter \'Age\' to change age)");
		System.out.println("---------------------------------------------------------------------------------\n");
                System.out.println("Enter Section Name Now");
		do
                {
			input = read.GetString();
			switch(input)
			{
			case "FullName":
					System.out.println("Enter new Full Name ");
					s_op = read.GetString();
					AuthenticatedUser.setName(s_op);
					System.out.println("Full Name saved Successfully");
                			System.out.println("Enter \'quit\' to exit modify OR Enter another Section Name to modify\n" );
					break;
                        case "Gender":
                                        System.out.println("Enter new Gender: M for Male and F for Female");
                                        c_op = read.GetChar();
                                        AuthenticatedUser.setGender(c_op);
                                        System.out.println("Gender saved Successfully");
                			System.out.println("Enter \'quit\' to exit modify OR Enter another Section Name to modify\n" );
                                        break;
                        case "Age":
                                        System.out.println("Enter new Age ");
                                        i_op = read.GetInt();
                                        AuthenticatedUser.setAge(i_op);
                                        System.out.println("Age saved Successfully");
                			System.out.println("Enter \'quit\' to exit modify OR Enter another Section Name to modify\n" );
                                        break;
                        case "Location":
                                        System.out.println("Enter new Location ");
                                        s_op = read.GetString();
                                        AuthenticatedUser.setLocation(s_op);
                                        System.out.println("Location saved Successfully");
                			System.out.println("Enter \'quit\' to exit modify OR Enter another Section Name to modify\n" );
                                        break;
                        case "Email":
                                        System.out.println("Enter new Email address ");
                                        s_op = read.GetString();
                                        AuthenticatedUser.setEmail(s_op);
                                        System.out.println("Email address saved Successfully");
                			System.out.println("Enter \'quit\' to exit modify OR Enter another Section Name to modify\n" );
                                        break;
                        case "PhoneNumber":
                                        System.out.println("Enter new Phone Number ");
                                        i_op = read.GetInt();
                                        AuthenticatedUser.setPhoneNumber(i_op);
                                        System.out.println("Phone number saved Successfully");
                			System.out.println("Enter \'quit\' to exit modify OR Enter another Section Name to modify\n" );
                                        break;
                        case "quit":
                                        System.out.println("Modify Account section exited");
                                        break;


			default:
				System.out.println("Wrong Menu options Entered\n");
                		System.out.println("Enter \'quit\' to exit modify OR Enter another Section Name to modify\n" );
				break;
			
			}
		} while(!input.equals("quit"));		

	 }
	/**
	 * 
	 */
	public void Signup() throws java.io.IOException { 
		// TODO Auto-generated method
                BonVoyage fly = new BonVoyage();
                fly.usr_list.addElement(AuthenticatedUser);
	 } 

	public Account() {

	}

	public Account(int accid) {
	
		this.AccountID = accid;
	}


}
