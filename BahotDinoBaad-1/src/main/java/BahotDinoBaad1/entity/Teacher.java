package BahotDinoBaad1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tId;
	
	private String tName;

	
	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	
	public Teacher(int tId, String tName) {
		super();
		this.tId = tId;
		this.tName = tName;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Teacher [tId=" + tId + ", tName=" + tName + "]";
	}

		
}
