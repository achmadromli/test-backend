package com.test.backend.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.test.backend.other.Gender;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Date birthDate;
	private Long positionId;
	private Long idNumber;
	private Gender gender;
	private boolean isDelete = false;
	
	public Employee() {
		super();
	}

	public Employee(String name, 
			Date birthDate, 
			Long positionId, Long idNumber, Gender gender, boolean isDelete) {
		this.name = name;
		this.birthDate = birthDate;
		this.positionId = positionId;
		this.idNumber = idNumber;
		this.gender = gender;
		this.isDelete = isDelete;
	}

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

	public Date getBirthDate() { return birthDate; }
	
	public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }
	

	public Long getPositionId() {
		return positionId;
	}

	public void setPositionId(Long positionId) {
		this.positionId = positionId;
	}

	public Long getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(Long idNumber) {
		this.idNumber = idNumber;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public boolean isDelete() {
		return isDelete;
	}

	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}
	
}