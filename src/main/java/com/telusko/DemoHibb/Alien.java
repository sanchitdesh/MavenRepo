package com.telusko.DemoHibb;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import jakarta.persistence.Table;
//import jakarta.persistence.Transient;
//@Entity(name="alien_table")- we can  change the name of table using like this.
//@Table(name="alien_table")//- we can  change in another way the name of table using like this.
@Entity
@Table(name="alien_table")
public class Alien {
	
	@Id
	private int aid;
	//@Transient
	private String aname;
	//@Column(name="alien_color")
	private String color;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}

	

}
