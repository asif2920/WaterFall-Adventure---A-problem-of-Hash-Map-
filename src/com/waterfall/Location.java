package com.waterfall;
/**
 * 
 * @author asif
 * This is class that contains three attributes
 * @param name: String Place name
 * @param location: String Location of the place
 * @param distanceL: double distance of the location
 *
 */
public class Location {
	private String name;
	private String location;
	private double distance;
	
/**
 * Constructor of the class
 * @param n1
 * @param l1
 * @param d1
 */
	public Location(String n1, String l1, double d1) {
		this.name = n1;
		this.location = l1;
		this.distance = d1;
	}
	public void setName(String n) {
		name=n;
	}
	public String getName() {
		return name;
	}
	public void setLocation(String l) {
		location=l;
	}
	public String getLocation() {
		return location;
	}
	public void setDistance(double d) {
		distance = d;
	}
	public double getDistance() {
		return distance;
	}
	

}
