import java.util.List;

public class Search {

	/**
	 *
	 */
	private ServiceItem ServiceItem;
	/**
	 *
	 */
	private User User;
	/**
	 *
	 */
	private Integer No_of_Passengers;
	/**
	 *
	 */
	private Boolean IsOneWay;
	/**
	 *
	 */
	/**
	 * Getter of ServiceItem
	 */
	public ServiceItem getServiceItem() {
	 	 return ServiceItem;
	}
	/**
	 * Setter of ServiceItem
	 */
	public void setServiceItem(ServiceItem ServiceItem) {
		 this.ServiceItem = ServiceItem;
	}
	/**
	 * Getter of user
	 */
	public User getUser() {
	 	 return user;
	}
	/**
	 * Setter of user
	 */
	public void setUser(User user) {
		 this.user = user;
	}
	/**
	 * Getter of No_of_Passengers
	 */
	public Integer getNo_of_Passengers() {
	 	 return No_of_Passengers;
	}
	/**
	 * Setter of No_of_Passengers
	 */
	public void setNo_of_Passengers(Integer No_of_Passengers) {
		 this.No_of_Passengers = No_of_Passengers;
	}
	/**
	 * Getter of IsOneWay
	 */
	public Boolean getIsOneWay() {
	 	 return IsOneWay;
	}
	/**
	 * Setter of IsOneWay
	 */
	public void setIsOneWay(Boolean IsOneWay) {
		 this.IsOneWay = IsOneWay;
	}

	public Search() {

	}

	public Search(Integer np, Boolean isone) {

		this.No_of_Passengers = np;
		this.IsOneWay = isone;
	}
}
