package com.java8.javabypatel;

public class Address {
	private Long zipcode;
	
	public Address(Long zipcode) {
        this.zipcode = zipcode;
    }

    public Long getZipcode() {
        return zipcode;
    }

    public void setZipcode(Long zipcode) {
        this.zipcode = zipcode;
    }
}
