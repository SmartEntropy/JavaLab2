package ua.lviv.iot.builderShop.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.builderShop.model.BuilderGoods;
import ua.lviv.iot.builderShop.model.TypeOfGoods;

import ua.lviv.iot.builderShop.model.*;

public class BuilderShopManager {

	private List<BuilderGoods> builderGoods = new ArrayList<>();

	public BuilderShopManager() {

	}

	public BuilderShopManager(List<BuilderGoods> builderGoods) {
		this.builderGoods = builderGoods;
	}

	public List<BuilderGoods> searchGoodsByType(List<BuilderGoods> builderGoods, TypeOfGoods typeOfGoods) {
		List<BuilderGoods> selectedGoods =builderGoods.stream().filter(o1 -> o1.getTypeOfGoods().equals(typeOfGoods))
				.collect(Collectors.toList());
		return selectedGoods;
	}

	public List<BuilderGoods> sortByPriceFromCheapToExpansive(List<BuilderGoods> builderGoods) {
		builderGoods.sort((o1, o2) -> (int) o1.getPrice() - (int) o2.getPrice());
		return builderGoods;
	}

	public List<BuilderGoods> sortByPriceFromExpansiveToCheap(List<BuilderGoods> builderGoods) {
		builderGoods.sort((o1, o2) -> (int) o2.getPrice() - (int) o1.getPrice());
		return builderGoods;
	}

	public List<BuilderGoods> sortByWidthThinToWide(List<BuilderGoods> builderGoods) {
		builderGoods.sort((o1, o2) -> (int) o1.getWidth() - (int) o2.getWidth());
		return builderGoods;
	}

	public List<BuilderGoods> sortByWidthWideToThin(List<BuilderGoods> goods) {
		goods.sort((o1, o2) -> (int) o2.getWidth() - (int) o1.getWidth());
		return goods;
	}
}
