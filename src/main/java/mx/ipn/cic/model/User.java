package mx.ipn.cic.model;

import java.io.Serializable;


public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1052664367585391284L;
	
	private long id;
	
	private String name;
	
	private String lastName;
	
	private int age;

	public User(){
		
	}
	
	public User(String name, String lastName, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	
}
