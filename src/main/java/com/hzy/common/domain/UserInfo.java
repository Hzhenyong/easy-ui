package com.hzy.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户所有的基本信息基类
 * <br>用户,数据库表为： sys_user<br/>
 * @author hzy
 *
 */
public class UserInfo implements Serializable{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//主键id，数据库字段为：sys_user.id
    private Long id;

    //登录名，数据库字段为：sys_user.login_name
    private String loginName;

    //用户名，数据库字段为：sys_user.name
    private String name;

    //密码，数据库字段为：sys_user.password
    private String password;

    //性别，数据库字段为：sys_user.sex
    private Integer sex;

    //年龄，数据库字段为：sys_user.age
    private Integer age;

    //手机号，数据库字段为：sys_user.phone
    private String phone;

    //用户类别，数据库字段为：sys_user.user_type
    private Integer userType;

    //用户状态，数据库字段为：sys_user.status
    private Integer status;

    //删除标记，数据库字段为：sys_user.del_flag
    private Integer delFlag;

    //更新时间，数据库字段为：sys_user.update_time
    private Date updateTime;

    //创建时间，数据库字段为：sys_user.create_time
    private Date createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", loginName=" + loginName + ", name=" + name + ", password=" + password
				+ ", sex=" + sex + ", age=" + age + ", phone=" + phone + ", userType=" + userType + ", status=" + status
				+ ", delFlag=" + delFlag + ", updateTime=" + updateTime + ", createTime=" + createTime + "]";
	}

	
    
}
