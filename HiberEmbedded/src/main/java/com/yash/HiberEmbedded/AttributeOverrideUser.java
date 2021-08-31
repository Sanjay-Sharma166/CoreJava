package com.yash.HiberEmbedded;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="USER_TABLE")public class AttributeOverrideUser
{
    @Id
    @Column(name="USER_ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int    userId;
   
    @Column(name="USER_NAME")
    private String userName;
   
    @Column(name="DOB")
    private Date dob;
   
    @Column(name="ADDRESS")
    @Embedded
    @AttributeOverrides({
    @AttributeOverride(name="street", column=@Column(name="HOME_STREET_NAME")),
    @AttributeOverride(name="city", column=@Column(name="HOME_CITY_NAME")),
    @AttributeOverride(name="state", column=@Column(name="HOME_STATE_NAME")),
    @AttributeOverride(name="pincode", column=@Column(name="HOME_PIN_CODE"))})
    private Address homeAddress;
   
    @Embedded
    private Address permanentAddress;
   
    @Column(name="Phone")
      private String phone;
   
    public int getUserId() {
        return userId;
    }
    public Address getHomeAddress() {
        return homeAddress;
    }
    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob= dob;
    }
    public Address getPermanentAddress() {
        return permanentAddress;
    }
    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone= phone;
    }
   
    public String toString()
    {
        return "[User Name: "+userName+"n Permanent Address: "+permanentAddress+"n Home Address: "+homeAddress+"n Date of Birth: "+dob+"n Phone: "+phone+"]";
    }
}