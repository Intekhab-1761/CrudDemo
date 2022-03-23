package com.tns.Springaw;

public class Heart {
	private String nameOfAnimal;
	private int noOfHearts;

	public String getNameOfAnimal() {
		return nameOfAnimal;
	}

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	public int getNoOfHearts() {
		return noOfHearts;
	}

	public void setNoOfHearts(int noOfHearts) {
		this.noOfHearts = noOfHearts;
	}

	void pump()
	{
		System.out.println(getNameOfAnimal()+" "+"Heart is pumping");
		System.out.println("With "+getNoOfHearts()+" heart(s)");
		System.out.println("So is alive");
	}

}