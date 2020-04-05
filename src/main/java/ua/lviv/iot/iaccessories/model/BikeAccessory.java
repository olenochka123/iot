package ua.lviv.iot.iaccessories.model;

import ua.lviv.iot.accessories.BikeType;

public class BikeAccessory extends Accessory{
	private BikeType bikeType;
	
	public BikeType getBikeType()
	{
		return bikeType;
	}
	
	public BikeAccessory(int id, String name, float price, float weight, String producer, String color, BikeType bikeType) {
		super(id, name, price, weight, producer, color);
		this.bikeType = bikeType;
	}
	
	public String getHeaders() {
		return super.getHeaders() + ',' + "bikeType";
	}
	
	public String toCSV() {
		return super.toCSV() + ',' + bikeType.toString();
	}
}
