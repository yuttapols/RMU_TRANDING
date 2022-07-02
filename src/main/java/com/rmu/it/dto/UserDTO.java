package com.rmu.it.dto;

import java.sql.Blob;

import lombok.Data;

@Data
public class UserDTO {
	
	private Long id;
	private String username;
	private String fristName;
	private String lastName;
	private String cName;
	private Blob cDocument;
	private String address;
	private String zibId;
	private String tambu;
	private String district;
	private String provice;
	private String phone;
	private String email;
	private Blob userImg;
	private String recordStatus;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Blob getcDocument() {
		return cDocument;
	}
	public void setcDocument(Blob cDocument) {
		this.cDocument = cDocument;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZibId() {
		return zibId;
	}
	public void setZibId(String zibId) {
		this.zibId = zibId;
	}
	public String getTambu() {
		return tambu;
	}
	public void setTambu(String tambu) {
		this.tambu = tambu;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getProvice() {
		return provice;
	}
	public void setProvice(String provice) {
		this.provice = provice;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Blob getUserImg() {
		return userImg;
	}
	public void setUserImg(Blob userImg) {
		this.userImg = userImg;
	}
	public String getRecordStatus() {
		return recordStatus;
	}
	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}
	
	
}
