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
 * Helpers generated by hbm2java
 */
@Entity
@Table(name = "helpers", catalog = "vereinsdb")
public class Helper implements java.io.Serializable {

	private Integer helperId;
	private User users;

	public Helper() {
	}

	public Helper(User users) {
		this.users = users;
	}

	@GenericGenerator(name = "com.verein.entity.HelpersIdGenerator", strategy = "foreign", parameters = @Parameter(name = "property", value = "users"))
	@Id
	@GeneratedValue(generator = "com.verein.entity.HelpersIdGenerator")

	@Column(name = "helper_ID", unique = true, nullable = false)
	public Integer getHelperId() {
		return this.helperId;
	}

	public void setHelperId(Integer helperId) {
		this.helperId = helperId;
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
