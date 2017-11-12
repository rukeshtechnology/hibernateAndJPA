package hibernate.associations.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Guide {

	public Guide() {
	}

	@Id
	@Column(name = "guide_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long guideId;
	
	@Column(name = "staff_id", nullable = false)
	private String staffId;
	
	private String name;
	private Integer salary;
	
	@OneToMany(mappedBy="guide", cascade={CascadeType.PERSIST})
	private Set<Student> students = new HashSet<Student>();
	
	public Guide(String staffId, String name, Integer salary) {
		this.staffId = staffId;
		this.name = name;
		this.salary = salary;
	}

	public Long getGuideId() {
		return guideId;
	}

	public void setGuideId(Long guideId) {
		this.guideId = guideId;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	/**
	 * Note this helper method is used to set guide to the student. This make sure even if you save the inverse relationship,
	 * in this case a Guide, foreign key relationship with student is maintained.
	 * @param student
	 */
	public void addStudent(Student student) {
		this.students.add(student);
		student.setGuide(this);
	}
	
}