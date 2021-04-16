package com.wler.addrbook.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>用户实体信息</b>
 * @author Monster
 * @version 5.0.0
 */
public class User implements Serializable {
	private static final long serialVersionUID = -473188015875328741L;
	private Long id;                    // 主键
	private String name;                // 姓名
	private String cellphone;           // 手机号码
	private String password;            // 登陆密码
	private String email;               // 电子邮件
	private String address;             // 联系地址
	private String avatar;					// 用户头像
	private Date createTime;				// 创建时间
	private Date updateTime;				// 修改时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
