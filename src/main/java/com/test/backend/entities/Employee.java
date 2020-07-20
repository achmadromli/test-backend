package com.test.backend.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.test.backend.other.Gender;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length=50)
	private String name;
	
	private Date birthDate;
	
	@ManyToOne
    @JoinColumn(name="id", referencedColumnName = "id", insertable = false, updatable = false)
    private Position position;
	
	private Long idNumber;
	
	@Enumerated(EnumType.STRING)
    private Gender gender;
	
	private boolean isDelete = false;
	
	public Employee() {
		super();
	}

	public Employee(String name, Date birthDate, Position position, Long idNumber, Gender gender, boolean isDelete) {
		this.name = name;
		this.birthDate = birthDate;
		this.position = position;
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

	public Date getBirthDate() { 
		return birthDate; 
	}
	
	public void setBirthDate(Date birthDate) { 
		this.birthDate = birthDate; 
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
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