package com.verein.entity;
// Generated 02.05.2022 19:10:50 by Hibernate Tools 5.2.11.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Accountants generated by hbm2java
 */
@Entity
@Table(name = "accountants", catalog = "vereinsdb")
public class Accountant implements java.io.Serializable {

	private Integer accountantId;
	private User users;

	public Accountant() {
	}

	public Accountant(User users) {
		this.users = users;
	}

	@GenericGenerator(name = "com.verein.entity.AccountantsIdGenerator", strategy = "foreign", parameters = @Parameter(name = "property", value = "users"))
	@Id
	@GeneratedValue(generator = "com.verein.entity.AccountantsIdGenerator")

	@Column(name = "accountant_ID", unique = true, nullable = false)
	public Integer getAccountantId() {
		return this.accountantId;
	}

	public void setAccountantId(Integer accountantId) {
		this.accountantId = accountantId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public User getUsers() {
		return this.users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

}
