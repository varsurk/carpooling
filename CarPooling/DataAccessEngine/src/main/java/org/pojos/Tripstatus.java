package org.pojos;
// default package
// Generated Nov 1, 2015 12:44:13 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Tripstatus generated by hbm2java
 */
public class Tripstatus implements java.io.Serializable {

	private Integer tripstatusid;
	private String tripstatusstringvalue;
	private Set trips = new HashSet(0);

	public Tripstatus() {
	}

	public Tripstatus(String tripstatusstringvalue) {
		this.tripstatusstringvalue = tripstatusstringvalue;
	}

	public Tripstatus(String tripstatusstringvalue, Set trips) {
		this.tripstatusstringvalue = tripstatusstringvalue;
		this.trips = trips;
	}

	public Integer getTripstatusid() {
		return this.tripstatusid;
	}

	public void setTripstatusid(Integer tripstatusid) {
		this.tripstatusid = tripstatusid;
	}

	public String getTripstatusstringvalue() {
		return this.tripstatusstringvalue;
	}

	public void setTripstatusstringvalue(String tripstatusstringvalue) {
		this.tripstatusstringvalue = tripstatusstringvalue;
	}

	public Set getTrips() {
		return this.trips;
	}

	public void setTrips(Set trips) {
		this.trips = trips;
	}

}
