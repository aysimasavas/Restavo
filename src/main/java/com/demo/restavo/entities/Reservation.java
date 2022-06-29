package com.demo.restavo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {

	@Id
	@Column(name = "reservation_id")
	private int id;
	@Column(name = "user_id")
	private int userId;
	@Column(name = "user_name")
	private String name;
	@Column(name = "user_mail")
	private String mail;
	@Column(name = "restaurant_name")
	private String restaurantName;
	@Column(name = "reservation_date")
	private String reservationDate;
	@Column(name = "table_num")
	private int tableNum;

	public Reservation() {

	}

	public Reservation(int id, int userId, String name, String mail, String restaurantName, String reservationDate,
			int tableNum) {
		super();
		this.id = id;
		this.userId = userId;
		this.name = name;
		this.mail = mail;
		this.restaurantName = restaurantName;
		this.reservationDate = reservationDate;
		this.tableNum = tableNum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}

	public int getTableNum() {
		return tableNum;
	}

	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}

}
