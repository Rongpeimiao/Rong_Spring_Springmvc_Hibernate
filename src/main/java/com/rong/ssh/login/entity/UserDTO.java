package com.rong.ssh.login.entity;
public class UserDTO {

	 private Integer id;
	    private String userName;
	    private String password;
	    public UserDTO() {  
	    } 
	    public UserDTO(Integer id, String username, String password) {  
	        this.id = id;  
	        this.userName = username;  
	        this.password = password;  
	    }
	    public Integer getId() {
	        return id;
	    }
	    public void setId(Integer id) {
	        this.id = id;
	    }
	    public String getUserName() {
	        return userName;
	    }
	    public void setUserName(String userName) {
	        this.userName = userName;
	    }
	    public String getPassword() {
	        return password;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }

	    @Override
	    public String toString() {
	        return "UserDTO [id=" + id + ", userName=" + userName + ", password="
	                + password + "]";
	    }
}
