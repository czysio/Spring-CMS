package pl.krzysiek.olejnik.cms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import pl.krzysiek.olejnik.cms.validator.AuthorName;

@Entity
@Table(name = "author")
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@AuthorName
    private String firstName;
	@AuthorName
    private String lastName;
	
    public Author() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return String.format("%s, %s", lastName, firstName);
	}
	
}
