import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;


import java.util.List;

public class User {

	/**
	 *
	 */
	private List<Payment> payment;
	/**
	 *
	 */
        private List<Search> search;
        /**
         *
         */
	private String Name;
	/**
	 *
	 */
	private Integer Age;
	/**
	 *
	 */
	private char Gender;
	/**
	 *
	 */
	private String Location;
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
	private List<Bookings> bookings;
	/**
	 * Getter of payment
	 */
	public List<Payment> getPayment() {
	 	 return payment;
	}
	/**
	 * Setter of payment
	 */
	public void setPayment(List<Payment> payment) {
		 this.payment = payment;
	}
        /**
         * Getter of search
         */
        public List<Search> getSearch() {
                 return search;
        }
        /**
         * Setter of search
         */
        public void setSearch(List<Search> search) {
                 this.search = search;
        }
	/**
	 * Getter of Name
	 */
	public String getName() {
	 	 return Name;
	}
	/**
	 * Setter of Name
	 */
	public void setName(String Name) {
		 this.Name = Name;
	}
	/**
	 * Getter of Age
	 */
	public Integer getAge() {
	 	 return Age;
	}
	/**
	 * Setter of Age
	 */
	public void setAge(Integer Age) {
		 this.Age = Age;
	}
	/**
	 * Getter of Gender
	 */
	public char getGender() {
	 	 return Gender;
	}
	/**
	 * Setter of Gender
	 */
	public void setGender(char Gender) {
		 this.Gender = Gender;
	}
	/**
	 * Getter of Location
	 */
	public String getLocation() {
	 	 return Location;
	}
	/**
	 * Setter of Location
	 */
	public void setLocation(String Location) {
		 this.Location = Location;
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
	 * Getter of bookings
	 */
	public List<Bookings> getBookings() {
	 	 return bookings;
	}
	/**
	 * Setter of bookings
	 */
	public void setBookings(List<Bookings> bookings) {
		 this.bookings = bookings;
	}
        /**
         *
         */
	public ServiceItem getServiceItem(Integer i) {
		return search.get(i).getServiceItem();

	}
        /**
         *
         */
	public void setServiceItem(ServiceItem ServiceItem,Integer i) {
		search.get(i).setServiceItem(ServiceItem);
	}
	/**
	 *
	 */
	public void SearchServiceItems() throws java.io.IOException {
		// TODO Auto-generated method
		System.out.println("TARA ! Is this what you're looking for ? \n ");
		int n =0, bk=0,b=3;
		BonVoyage fly = new BonVoyage();
		ServiceItem flt = new ServiceItem();
		ServiceItem flt_sch = search.get(b).getServiceItem();
		for(int i=0; i<fly.ServiceItem_list.size(); i++)
		{
			flt = (ServiceItem)fly.ServiceItem_list.elementAt(i);

			if(flt.getSource().equals(flt_sch.getSource()) && flt.getDestination().equals(flt_sch.getDestination())) {
				if(flt.getDate_ServiceItem().equals(flt_sch.getDate_ServiceItem()) && flt.getIsNational().equals(flt_sch.getIsNational())) {
					System.out.println("---Id ********* Date ************* Dep ************* Dest ---");
					System.out.println("");
					bk = bk+1;
					SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
					System.out.println("*********"+flt.getServiceItemNo()+"*********"+df.format(flt.getDate_ServiceItem())+"*********"+flt.getCapacity()+"*********"+flt.getSource()+"*********"+flt.getDestination());
				}

			}
			else{

				n=n+1;
			}
		}
		if ( n == fly.ServiceItem_list.size()) {
			System.out.println("Oups, sounds like we didn't find what service you're looking for");							}

		if (search.get(b).getIsOneWay().equals(false)) {
			n =0;
	                for(int i=0; i<fly.ServiceItem_list.size(); i++)
        	        {
                	        flt = (ServiceItem)fly.ServiceItem_list.elementAt(i);

                        	if(flt.getSource().equals(flt_sch.getDestination()) && flt.getDestination().equals(flt_sch.getSource())) {
                                	if(flt.getDate_ServiceItem().equals(flt_sch.getDate_ServiceItem()) && flt.getIsNational().equals(flt_sch.getIsNational())) {
                        			System.out.println("\n Details");
	                        		System.out.println("---Id ********* Date ************* Dep ************* Dest ---");
			                        System.out.println("");
						bk = bk+1;
                	                        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                        	                System.out.println("---"+flt.getServiceItemNo()+"--------"+df.format(flt.getDate_ServiceItem())+"----"+flt.getCapacity()+"----"+flt.getSource()+"----"+flt.getDestination());
                                	}

                        	}
                        	else{

                                	n=n+1;
                        	}
                	}
                	if ( n == fly.ServiceItem_list.size()) {
                        	System.out.println("Oups, sounds like we didn't find what service you're looking for");

			}
		}
		if (bk != 0) {
                        System.out.println("\n" + bk + " ServiceItems Found");
                        System.out.println("Now that you found the service do you wanna continue and reserve this item: (Type \'YES\' to book or \'no\')");
			String bk_str = read.GetString();
			if (bk_str.equals("yes")) {
				BookServiceItems(b);
			}

		}
		b=b+1;
	 }
	/**
	 *
	 */
	public void BookServiceItems(Integer b) throws java.io.IOException {
		// TODO Auto-generated method
		BonVoyage fly = new BonVoyage();
		ServiceItem flt = new ServiceItem();
		Integer n =0;
		List<Integer> bk_list = new ArrayList<Integer>();
		System.out.println("please type in the ID of the Service you want to reserve");
		Integer n_fl = read.GetInt();
		do {
		for(int i=0;i<n_fl;i++) {
			System.out.println("service Id: " +(i+1));
			String fl_no = read.GetString();
			for(int j=0; j<fly.ServiceItem_list.size();j++) {
				flt = (ServiceItem)fly.ServiceItem_list.elementAt(j);
				if(flt.getServiceItemNo().equals(fl_no)) {
					flt.setCapacity(flt.getCapacity() - search.get(b).getNo_of_Passengers());
					setServiceItem(flt,b);
					bk_list.add(j);
				}
				else {
					n=n+1;
				}
			}

		}
		if(n==((n_fl) * fly.ServiceItem_list.size()))
		{
			System.out.println("ID not found: Please type in the correct ID and the number of services you wanna book" +bk_list.size() );
		}

		}while(n_fl != bk_list.size());
		AuthenticatedUser m = new AuthenticatedUser();
		Integer x=0;
		for(int k=0; k<fly.usr_list.size(); k++)
		{
			m=(AuthenticatedUser)fly.usr_list.elementAt(k);
			if(m.getName().equals(Name) && m.getAge().equals(Age))
			{

				System.out.println("AuthenticatedUser !");
			}
			else {
				x=x+1;
			}

		}
		if(x == fly.usr_list.size()) {
			System.out.println("Unkown User !");
			paymentMethod cdi = new paymentMethod();
			List<paymentMethod> cdi_list = new ArrayList<paymentMethod>();
			String s = "Bank";
			cdi.setAmount(300);
			cdi.setModeofpayment(s);
			Integer y = cdi.MakePayment();
			if (y == 2) {
				System.out.println("Payment canceled");
				return;
			}
			else if(y==1) {
				cdi.CreateTransaction();
				if(cdi.getTransactionID() != null) {
					Bank_System bank = new Bank_System("DESJARDINS");
					cdi.setBank_system(bank);
					cdi_list.add(cdi);
					bank.setpaymentMethod(cdi_list);
					Integer ret = bank.ValidateTransaction();
					if(ret==1) {

						System.out.println("Bank info valid");
						Bookings book = new Bookings((b),300,"1A 1B 1C",15);
						book.setuser(this);
						List<Bookings> book_list = new ArrayList<Bookings>();
						book_list.add(book);
						setBookings(book_list);
						fly.booking_list.addElement(book);
						System.out.println("Reservation is done !  ID of your purchase :" +book.getBookingID());

					}
					else if(ret==2) {
						System.out.println("Bank info not valid");
						return;
					}
				}
			}
		}



	 }

	public User() {

	}

}
