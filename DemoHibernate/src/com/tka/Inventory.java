package com.tka;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Inventory {
	
	@Id
	private int productId;
	private int warehouseId;
	private int quantityInStock;
	
	//No-Argument Constructor
	public Inventory() {
		
	}
	
	//Argument Constructor
	public Inventory(int productId, int warehouseId, int quantityInStock) {
		super();
		this.productId = productId;
		this.warehouseId = warehouseId;
		this.quantityInStock = quantityInStock;
	}

	//Public Getter & Setter
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	//toString
	@Override
	public String toString() {
		return "Inventory [productId=" + productId + ", warehouseId=" + warehouseId + ", quantityInStock="
				+ quantityInStock + "]";
	}
	
	
	
	
}
