package com.demo.restavo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant")
public class Restaurant {

	@Id
	@Column(name = "restaurant_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "address")
	private String address;

	@Column(name = "tel")
	private String tel;

	@Column(name = "table_count")
	private int table_count;

	@Column(name = "restaurant_picture")
	private String restaurantPicture;

	@Column(name = "menu_picture")
	private String menuPicture;

	@Column(name = "average_price")
	private int averagePrice;

	@Column(name = "search")
	private String search;

	@Column(name = "rate")
	private double rate;

	@ManyToOne()
	@JoinColumn(name = "category_id")
	private Category category;


	public Restaurant(long id, String name, String description, String address, String tel, int table_count,
			String restaurantPicture, String menuPicture, int averagePrice, String search, double rate,
			Category category) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.address = address;
		this.tel = tel;
		this.table_count = table_count;
		this.restaurantPicture = restaurantPicture;
		this.menuPicture = menuPicture;
		this.averagePrice = averagePrice;
		this.search = search;
		this.rate = rate;
		this.category = category;
	}

	public Restaurant() {

	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String productName) {
		this.name = productName;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getTable_count() {
		return table_count;
	}

	public void setTable_count(int table_count) {
		this.table_count = table_count;
	}

	public String getRestaurantPicture() {
		return restaurantPicture;
	}

	public void setRestaurantPicture(String restaurantPicture) {
		this.restaurantPicture = restaurantPicture;
	}

	public String getMenuPicture() {
		return menuPicture;
	}

	public void setMenuPicture(String menuPicture) {
		this.menuPicture = menuPicture;
	}

	public int getAveragePrice() {
		return averagePrice;
	}

	public void setAveragePrice(int averagePrice) {
		this.averagePrice = averagePrice;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

}
