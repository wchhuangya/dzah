package com.ch.wchhuangya.dzah.entity.sys;
// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

import com.ch.wchhuangya.dzah.entity.AbstractEntity;


/**
 * SysUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="sys_user")
public class SysUser extends AbstractEntity {

	private static final long serialVersionUID = 1110824345749542673L;

    // Fields    

	private String userId;
    private String userName;

    // Constructors

    /** default constructor */
    public SysUser() {
    }
    
    /** full constructor */
    public SysUser(String userName) {
        this.userName = userName;
    }
   
    // Property accessors
    @GenericGenerator(name="generator", strategy="uuid.hex")@Id @GeneratedValue(generator="generator")
    
    @Column(name="user_id", unique=true, nullable=false, length=32)

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    @Column(name="user_name", nullable=false, length=64)

    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
}