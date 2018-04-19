import java.util.*;
import java.io.*;


import java.util.List;


  // we reduced serviceItem to a flight example for simplicity purpose !

public class ServiceItem {

	/**
	 *
	 */
	private List<Search> search;
	/**
	 *
	 */
	private String ServiceItemNo;
	/**
	 *
	 */
	private String Source;
	/**
	 *
	 */
	private String Destination;
	/**
	 *
	 */
	private Date Date_ServiceItem;
	/**
	 *
	 */
	private Boolean IsNational;
	/**
	 *
	 */
	private Integer Capacity;
	/**
	 *
	 */
	private Admin admin;
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
	 * Getter of ServiceItemNo
	 */
	public String getServiceItemNo() {
	 	 return ServiceItemNo;
	}
	/**
	 * Setter of ServiceItemNo
	 */
	public void setServiceItemNo(String ServiceItemNo) {
		 this.ServiceItemNo = ServiceItemNo;
	}
	/**
	 * Getter of Source
	 */
	public String getSource() {
	 	 return Source;
	}
	/**
	 * Setter of Source
	 */
	public void setSource(String Source) {
		 this.Source = Source;
	}
	/**
	 * Getter of Destination
	 */
	public String getDestination() {
	 	 return Destination;
	}
	/**
	 * Setter of Destination
	 */
	public void setDestination(String Destination) {
		 this.Destination = Destination;
	}
	/**
	 * Getter of Date
	 */
	public Date getDate_ServiceItem() {
	 	 return Date_ServiceItem;
	}
	/**
	 * Setter of Date
	 */
	public void setDate(Date Date_ServiceItem) {
		 this.Date_ServiceItem = Date_ServiceItem;
	}
	/**
	 * Getter of IsNational
	 */
	public Boolean getIsNational() {
	 	 return IsNational;
	}
	/**
	 * Setter of IsNational
	 */
	public void setIsNational(Boolean IsNational) {
		 this.IsNational = IsNational;
	}
	/**
	 * Getter of Capacity
	 */
	public Integer getCapacity() {
	 	 return Capacity;
	}
	/**
	 * Setter of Capacity
	 */
	public void setCapacity(Integer Capacity) {
		 this.Capacity = Capacity;
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


	public ServiceItem() {

	}

	public ServiceItem(String fl_no, String src, String dst, Date dte,Boolean isdom, Integer cap) {

		this.ServiceItemNo = fl_no;
		this.Source = src;
		this.Destination = dst;
		this.Date_ServiceItem = dte;
		this.IsNational = isdom;
		this.Capacity = cap;
	}

}
