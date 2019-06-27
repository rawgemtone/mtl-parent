package com.pc.bean;

public class User
{
	private Integer userId;
	private String userName;
	private String password;
	private String passwordSalt;
	private String userPhone;
	private String userEmail;
	private Integer imageId;
	private String userType;
	private String userAlias;
	private String bak1;
	public Integer getUserId()
	{
		return userId;
	}
	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getPasswordSalt()
	{
		return passwordSalt;
	}
	public void setPasswordSalt(String passwordSalt)
	{
		this.passwordSalt = passwordSalt;
	}
	public String getUserPhone()
	{
		return userPhone;
	}
	public void setUserPhone(String userPhone)
	{
		this.userPhone = userPhone;
	}
	public String getUserEmail()
	{
		return userEmail;
	}
	public void setUserEmail(String userEmail)
	{
		this.userEmail = userEmail;
	}
	public Integer getImageId()
	{
		return imageId;
	}
	public void setImageId(Integer imageId)
	{
		this.imageId = imageId;
	}
	public String getUserType()
	{
		return userType;
	}
	public void setUserType(String userType)
	{
		this.userType = userType;
	}
	public String getUserAlias()
	{
		return userAlias;
	}
	public void setUserAlias(String userAlias)
	{
		this.userAlias = userAlias;
	}
	public String getBak1()
	{
		return bak1;
	}
	public void setBak1(String bak1)
	{
		this.bak1 = bak1;
	}
	public User(Integer userId, String userName, String password,
			String passwordSalt, String userPhone, String userEmail,
			Integer imageId, String userType, String userAlias, String bak1)
	{
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.passwordSalt = passwordSalt;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.imageId = imageId;
		this.userType = userType;
		this.userAlias = userAlias;
		this.bak1 = bak1;
	}
	public User()
	{
		super();
	}
	@Override
	public String toString()
	{
		return "User [userId=" + userId + ", userName=" + userName
				+ ", password=" + password + ", passwordSalt=" + passwordSalt
				+ ", userPhone=" + userPhone + ", userEmail=" + userEmail
				+ ", imageId=" + imageId + ", userType=" + userType
				+ ", userAlias=" + userAlias + ", bak1=" + bak1 + "]";
	}
	
}
