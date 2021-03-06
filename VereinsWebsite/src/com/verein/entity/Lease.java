package com.verein.entity;
// Generated 02.05.2022 19:10:50 by Hibernate Tools 5.2.11.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Leases generated by hbm2java
 */
@Entity
@Table(name = "leases", catalog = "vereinsdb")
public class Lease implements java.io.Serializable {

	private Integer leaseId;
	private Adress adresses;
	private String description;
	private double area;
	private Set<Lessee> lesseeses = new HashSet<Lessee>(0);

	public Lease() {
	}

	public Lease(Adress adresses, double area) {
		this.adresses = adresses;
		this.area = area;
	}

	public Lease(Adress adresses, String description, double area, Set<Lessee> lesseeses) {
		this.adresses = adresses;
		this.description = description;
		this.area = area;
		this.lesseeses = lesseeses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "lease_ID", unique = true, nullable = false)
	public Integer getLeaseId() {
		return this.leaseId;
	}

	public void setLeaseId(Integer leaseId) {
		this.leaseId = leaseId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "adress_ID", nullable = false)
	public Adress getAdresses() {
		return this.adresses;
	}

	public void setAdresses(Adress adresses) {
		this.adresses = adresses;
	}

	@Column(name = "description", length = 45)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "area", nullable = false, precision = 22, scale = 0)
	public double getArea() {
		return this.area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "leases")
	public Set<Lessee> getLesseeses() {
		return this.lesseeses;
	}

	public void setLesseeses(Set<Lessee> lesseeses) {
		this.lesseeses = lesseeses;
	}

}
