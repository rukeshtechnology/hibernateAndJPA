
package hibernate.associations.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * This class shows one to one relationship between Customer and Passport objects.
 * To have one to one relationship, join column should be unique.
 * @author rukesh
 */

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@OneToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "passport_id", unique = true) // unique=true is what makes one to one relationship.
	private Passport passport;

	public Customer() {
	}

	public Customer(String name, Passport passport) {
		this.name = name;
		this.passport = passport;
	}

	public Passport getPassport() {
		return passport;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

}