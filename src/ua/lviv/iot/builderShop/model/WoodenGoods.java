package ua.lviv.iot.builderShop.model;

public class WoodenGoods extends BuilderGoods {
	

	public WoodenGoods(String name, double weight, String material, int height, TypeOfGoods typeOfGoods, int price,
			String producer, int width, resist waterResist, int length) {
		super();
		this.waterResist = waterResist;
		this.length = length;
	}

	private resist waterResist;
	private int length;


	

	public resist getWaterResist() {
		return waterResist;
	}

	public void setWaterResist(resist waterResist) {
		this.waterResist = waterResist;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "waterResist = " + waterResist + ", length = " + length;
	}

}
