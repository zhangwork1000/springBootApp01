package com.evan.wj.pojo;

//@Entity
//@Table(name = "tbUser")
//@JsonIgnoreProperties({ "handler", "hibernateLazyInitializer" })

public class User {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
	int id;

	String username;
	String password;

	public User(int id, String userName) {
		setId(id);
		setUsername(userName);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}