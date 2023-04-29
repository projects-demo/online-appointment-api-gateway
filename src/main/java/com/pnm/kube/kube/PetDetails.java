package com.pnm.kube.kube;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;



public class PetDetails {

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public PetType getType() {
		return type;
	}

	public void setType(PetType type) {
		this.type = type;
	}

	public List<VisitDetails> getVisits() {
		return visits;
	}

	private int id;

    private String name;

    private String birthDate;

    private PetType type;

    private final List<VisitDetails> visits = new ArrayList<>();

}
