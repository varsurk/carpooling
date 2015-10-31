package org.pojos;

// default package
// Generated Nov 1, 2015 12:44:13 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pool generated by hbm2java
 */
public class Pool implements java.io.Serializable {

	private Integer poolid;
	private Pooltype pooltype;
	private Cluster cluster;
	private String source;
	private String destination;
	private Date creationtime;
	private Date lastmodifiedtime;
	private Date poolcost;
	private Set trips = new HashSet(0);
	private Set users = new HashSet(0);

	public Pool() {
	}

	public Pool(Pooltype pooltype, Cluster cluster, String source,
			String destination, Date creationtime, Date lastmodifiedtime,
			Date poolcost) {
		this.pooltype = pooltype;
		this.cluster = cluster;
		this.source = source;
		this.destination = destination;
		this.creationtime = creationtime;
		this.lastmodifiedtime = lastmodifiedtime;
		this.poolcost = poolcost;
	}

	public Pool(Pooltype pooltype, Cluster cluster, String source,
			String destination, Date creationtime, Date lastmodifiedtime,
			Date poolcost, Set trips, Set users) {
		this.pooltype = pooltype;
		this.cluster = cluster;
		this.source = source;
		this.destination = destination;
		this.creationtime = creationtime;
		this.lastmodifiedtime = lastmodifiedtime;
		this.poolcost = poolcost;
		this.trips = trips;
		this.users = users;
	}

	public Integer getPoolid() {
		return this.poolid;
	}

	public void setPoolid(Integer poolid) {
		this.poolid = poolid;
	}

	public Pooltype getPooltype() {
		return this.pooltype;
	}

	public void setPooltype(Pooltype pooltype) {
		this.pooltype = pooltype;
	}

	public Cluster getCluster() {
		return this.cluster;
	}

	public void setCluster(Cluster cluster) {
		this.cluster = cluster;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getCreationtime() {
		return this.creationtime;
	}

	public void setCreationtime(Date creationtime) {
		this.creationtime = creationtime;
	}

	public Date getLastmodifiedtime() {
		return this.lastmodifiedtime;
	}

	public void setLastmodifiedtime(Date lastmodifiedtime) {
		this.lastmodifiedtime = lastmodifiedtime;
	}

	public Date getPoolcost() {
		return this.poolcost;
	}

	public void setPoolcost(Date poolcost) {
		this.poolcost = poolcost;
	}

	public Set getTrips() {
		return this.trips;
	}

	public void setTrips(Set trips) {
		this.trips = trips;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}
