package com.tns.springioc;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Airtel implements Sim {
	
	private String name;
	private List<String> phones;
	private Set<String> Address;
	private Map<String,String> plans;
 
	public void calling() {
		System.out.println("calling via Airtel sim....!");

	}

	public void data() {
		System.out.println("Browsing via Airtel sim....!");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddress() {
		return Address;
	}

	public void setAddress(Set<String> address) {
		Address = address;
	}

	public Map<String, String> getPlans() {
		return plans;
	}

	public void setPlans(Map<String, String> plans) {
		this.plans = plans;
	}

	@Override
	public String toString() {
		return "Airtel [name=" + name + ", phones=" + phones + ", Address=" + Address + ", plans=" + plans + "]";
	}
	
	

}
