/**
 * 
 */
package com.sears.corps;

/**
 * @author athora0
 *
 */
public class Address {
	private String state;
	private String country;
	private String continent;

	public Address(String state, String country, String continent) {
		this.state = state;
		this.country = country;
		this.continent = continent;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

}
