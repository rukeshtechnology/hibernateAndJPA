package rukesh.hibernate.examples;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author rukesh
 *
 */

@Entity
@Table(name="himalusers")
public class ApplicationUsers {
	
	@Id
	@Column(name="userId")
	private String userId;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="street")
	private String street;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="zip")
	private String zip;
	
	public ApplicationUsers() {
	}	
	public String getUserId() {
		return userId;
	}	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
}