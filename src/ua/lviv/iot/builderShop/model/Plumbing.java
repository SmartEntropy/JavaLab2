package ua.lviv.iot.builderShop.model;

public class Plumbing extends BuilderGoods {
	
	
	public Plumbing(String name, double weight, String material, int height, TypeOfGoods typeOfGoods, int price,
			String producer, int width, double volume) {
		super();
		this.volume = volume;
	}
	private static final boolean usesWater = true;
	private double volume;
	
	
	
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	@Override
	public String toString() {
		return "volume = " + volume;
	}
	
	
}
