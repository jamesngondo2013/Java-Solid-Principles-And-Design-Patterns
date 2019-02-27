package com.james.builder.pattern;


public class User {

	private String username; //required
	private String email;    // required
	
	private String firstname;// optional
	private String lastname; // optional
	private String phone;    // optional
	private String address;  // optional
	
	private User(Builder builder) {
		this.username = builder.username;
		this.email = builder.email;
		this.firstname = builder.firstname;
		this.lastname = builder.lastname;
		this.phone= builder.phone;
		this.address = builder.address;
	
	}
	
	public String getUsername(){
		return username;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getFirstName(){
		return firstname;
	}
	public String getLastname(){
		return lastname;
	}
	public String getPhone(){
		return phone;
	}
	public String getAddress(){
		return address;
	}
	
	@Override
	public String toString() {
		return "User [username=" + getUsername() + ", email=" + getEmail() + ", firstname=" + getFirstName() + ", lastname=" + getLastname()
				+ ", phone=" + getPhone() + ", address=" + getAddress() +  "]";
	}



	public static class Builder {

		private String username; //required
		private String email;    // required
		
		private String firstname;// optional
		private String lastname; // optional
		private String phone;    // optional
		private String address;  // optional
		
		public Builder(String username, String email) {
			this.username = username;
			this.email = email;
		}
		
		public Builder firstName(String fname){
			this.firstname = fname;
			return this;
			
		}
		
		public Builder lastName(String lname){
			this.lastname = lname;
			return this;	
		}
		
		public Builder phone(String phone){
			this.phone = phone;
			return this;
			
		}
		
		public Builder address(String add){
			this.address = add;
			return this;
			
		}
		
		//this does the creation of the 'User' object - which can not be changed.
		//returns an instance of this 'User'
		//creates an immutable object
		// this has no GETTERS and SETTERS in the 'User' class
		public User build(){
			return new User(this);
			
		}

	}
}
