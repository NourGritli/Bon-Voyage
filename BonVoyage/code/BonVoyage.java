import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;


public class BonVoyage {

static ArrayList<User> usr_list = new ArrayList<User>();
static ArrayList<ServiceItem> service_list = new ArrayList<ServiceItem>();
static ArrayList<Bookings> booking_list = new ArrayList<Bookings>();
static List<Search> sch_list = new ArrayList<Search>();

public static void main(String args[]) throws java.io.IOException
 {


   int Userinput;
 Bookings bookings = new Bookings();

 int authenticationId=0;
 fakeData(authenticationId);
 authenticationId = 3;
 System.out.println("\n");
 System.out.println("#############################");
 System.out.println("  BON VOYAGE	");
 System.out.println("#############################\n");


 /*System.out.println("#############################");
 System.out.println("  We will consider our service as a reserving a flight to simplify the demonstration, as the purpose of this project is not having an implementation but showing that we can generate a working solution from our class diagram	");
 System.out.println("#############################\n");*/



 do
 {
 System.out.println("************************\n");
 System.out.println("BonVoyage main page");
 System.out.println("************************\n");
 System.out.println("1.Search Services");
 System.out.println("2.Signup");
 System.out.println("3.Login");
 System.out.println("4.Booking details");
 System.out.println("5.Booking cancel");
 System.out.println("6.EXIT");
 Userinput = read.GetInt();
 switch(Userinput) {
 case 1:
	Integer t=0,np=2 ,searchInput=0;
	String src = "Montreal",dst="Rabat",dte_str="29/03/2018";
	Boolean isone=true,isdom=true;


  System.out.println("    ---------------------------------------------------------------  ");
        System.out.println("    --------------------- Search Services MENU ------  ");
        System.out.println("    ---------------------------------------------------------------  ");
	System.out.println("Please select the Type of service you want to reserve");
	System.out.println("1.Flights");
	System.out.println("2.Accommodation");
	System.out.println("3.Activity");
	System.out.println("4.Exit");




do{

     Integer n=0 ;
          if (searchInput == 1) {


	System.out.println("    ---------------------------------------------------------------  ");
        System.out.println("    --------------------- Search for flights MENU ------  ");
        System.out.println("    ---------------------------------------------------------------  ");
	System.out.println("Please select the operation you wanna make");
	System.out.println("1.Departure");
	System.out.println("2.Destination");
	System.out.println("3.Date");
	System.out.println("4.Number of Passengers");
	System.out.println("5.IsRoundTrip ::: Enter \'true\' for round OR \'false\' for oneway");
	System.out.println("6.exit");
	do
	{
		if(n!=0)
		{
		System.out.println("Next operation:");
		}
		t = read.GetInt();
		if (t == 1) {
		        System.out.println("Enter the Departure name:");
	        	src = read.GetString();
			n++;
		}
		else if (t == 2) {
	        	System.out.println("Enter the Destination name:");
		        dst = read.GetString();
			n++;
		}
		else if (t == 3) {
	        	System.out.println("Enter the Date : ");
		        dte_str = read.GetString();
			n++;
		}
		else if (t == 4) {
	        	System.out.println("Enter Number of Passengers :"); //
		        np = read.GetInt();
			n++;
		}
		else if (t == 5) {
	        	System.out.println("Enter if flight round trip  :");
			String isone_str = read.GetString();
			Scanner scan = new Scanner(isone_str);
			isone = scan.nextBoolean();
			n++;
		}
		else if (t == 6) {
	        	System.out.println("Exit :");
		}
		else {
			System.out.println("Wrong Option Entered Try again");
		}
	}while(t!=6);
	if (n >= 5) {
	Search sch = new Search(np,isone);
	ServiceItem flt = new ServiceItem();
	flt.setSource(src);
	flt.setDestination(dst);
	SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	Date d_te = new Date();
        try {
	        d_te = df.parse(dte_str);
        }catch (ParseException e) {
        e.printStackTrace();
        }
	flt.setDate(d_te);
	flt.setIsDomestic(isdom);
	sch.setServiceItem(flt);
	sch_list.add(sch);
	 tvr = new User();
	tvr.setSearch(sch_list);
        tvr.SearchServiceItems();
	}

	if(n<5) {
	System.out.println("Not all the Required search options are entered--- Exiting search menu back to main menu");
	}
}


else if (searchInput == 2) {

        Integer n1 =0 ;
  System.out.println("    ---------------------------------------------------------------  ");
        System.out.println("    --------------------- Search Accommodations MENU ------  ");
        System.out.println("    ---------------------------------------------------------------  ");
	System.out.println("Please select the operation you wanna make");
	System.out.println("1.Type of accomodation");
	System.out.println("2.Place");
	System.out.println("3.Date");
	System.out.println("4.Number of rooms");
	System.out.println("5.exit");




}


} while (searchInput!=4) ;




	break;





 case 2:
	System.out.println("Choose your username:");
        String uname = read.GetString();
        System.out.println("Choose your password");
        String pword = read.GetString();
        System.out.println("Enter your Name:");
        String mname = read.GetString();
        System.out.println("Enter your Age:");
        int age = read.GetInt();
        System.out.println("Enter your Email Address:");
        String Email = read.GetString();
        System.out.println("Enter your PhoneNumber:");
        int PhoneNumber = read.GetInt();
        System.out.println("Enter your Location:");
        String Loc = read.GetString();
        System.out.println("Enter your Gender:M for Male & F for Female");
        char Gender = read.GetChar();
 	Member mbr = new Member(uname,pword,mname,age,Email,Loc,PhoneNumber,Gender);
	authenticationId = authenticationId+1;
	Account acc = new Account(authenticationId);
	mbr.setAccount(acc);
	acc.setMember(mbr);
	acc.Signup();
	Member m1 = new Member();
	m1 = (Member)usr_list.elementAt(2);
	break;
 case 3:
	System.out.println("    ---------------------------------------------------------------  ");
	System.out.println("    ---------------------  BonVoyage - LOGIN MENU ---------------  ");
	System.out.println("    ---------------------------------------------------------------  ");
	System.out.println("Enter your username:");
        String uname_log = read.GetString();
        System.out.println("Enter your password");
        String pword_log = read.GetString();
	if (uname_log.equals("admin")){
	Admin A1 = new Admin();
	Account acc_a = new Account(0);
	A1.setAccount(acc_a);
	A1.setUsername(uname_log);
	A1.setPassword(pword_log);
	A1.Login();
	}
	else{
	Member m2 = new Member();
        m2.setUsername(uname_log);
        m2.setPassword(pword_log);
        m2.Login();
	}
	break;
 case 4:
        bookings.ViewBooking();
	break;
 case 5:
        bookings.CancelBooking();
	break;
 case 6:
 	System.out.println("\n ---------Thank you-----\n");
        break;
 default:
	System.out.println("Wrong options \n");

        }
 } while(Userinput!=6);
 }


public static void fakeData(int account) throws java.io.IOException {

	String unames[] = {"omar","omar","omar"};
	String pwords[] = {"omar","omar","omar"};
	String fnames[] = {"omar","omar","omar"};
	String emails[] = {"omar@gmail.com","omar@gmail.com","omar@gmail.com"};

	Integer cardnum[] = {11111111,22222222};
	String cardname[] = {"omar","omar"};
	Integer Expry[] = {0416,0516};
	Integer cvv[] = {111,222};
	Integer amt[] = {500,200};

	Integer bk_id[] = {0,1,2};
	Integer price[] = {300,300,300};
	String seatno[] = {"3A,3B,3C","4A 4B 4C","5A 5B 5C"};
	Integer bag[] = {15,15,15};

	String fl_no[] = {"GO123","GO456","GO789","RET123","RET456","RET789"};
	String src[] = {"Montreal","Montreal","Montreal","Toronto","Ottawa","NewYork"};
	String dst[] = {"Toronto","Ottawa","NewYork","Montreal","Montreal","Montreal"};
	Boolean isdom[] = {true,true,false,true,true,false};
	String dte_str[] = {"10-04-2018","10-04-2018","10-04-2018","10-04-2018","10-04-2018","10-04-2018"};
	SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	Date dte = new Date();

	for (int i=0; i<3; i++) {
	account = account+1;
 	Member m_set = new Member(unames[i],pwords[i],fnames[i],25,emails[i],"Montreal",123456,'M');
	Account acc_set = new Account(account);
	m_set.setAccount(acc_set);
	acc_set.setMember(m_set);
	acc_set.Signup();
	}

	for(int i=0;i<3;i++) {
	Bookings bk = new Bookings(bk_id[i],price[i],seatno[i],bag[i]);
	User tv = new User();
        try {
        dte = df.parse(dte_str[i]);
        }catch (ParseException e) {
        e.printStackTrace();
        }

        ServiceItem fl = new ServiceItem(fl_no[i],src[i],dst[i],dte,isdom[i],20);
	Search sch = new Search();
	sch.setServiceItem(fl);
	sch_list.add(sch);
	tv.setSearch(sch_list);
	bk.setUser(tv);
	booking_list.addElement(bk);
	}


	for(int i=0; i<2; i++) {
	Bank_System bank_acc = new Bank_System();
	bank_acc.setBankName("DESJARDINS");
	cards.setBank_system(bank_acc);
	Bank_Accounts.addElement(cards);
	}

	for(int i=0;i<6;i++) {
	try {
	dte = df.parse(dte_str[i]);
	}catch (ParseException e) {
	e.printStackTrace();
	}

	ServiceItem fl = new ServiceItem(fl_no[i],src[i],dst[i],dte,isdom[i],20);
	ServiceItem_list.addElement(fl);
	}

}
}
