import ua.lviv.iot.builderShop.manager.BuilderShopManager;
import ua.lviv.iot.builderShop.model.BuilderGoods;
import ua.lviv.iot.builderShop.model.Lighting;
import ua.lviv.iot.builderShop.model.Plumbing;
import ua.lviv.iot.builderShop.model.quality;
import ua.lviv.iot.builderShop.model.resist;
import ua.lviv.iot.builderShop.model.TypeOfGoods;
import ua.lviv.iot.builderShop.model.WoodenGoods;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		BuilderShopManager manager1 = new BuilderShopManager();
		
		WoodenGoods chair = new WoodenGoods("Chair", 2.4, "Wood", 80, TypeOfGoods.WOODEN_GOODS, 50,	"IKEA", 40, resist.WEAK_RESIST, 50);
		
		WoodenGoods table = new WoodenGoods("Table", 10, "Wood", 90, TypeOfGoods.WOODEN_GOODS, 100, "IKEA", 120, resist.STRONG_RESIST, 100);
		
		Plumbing toilet = new Plumbing("Toilet", 100, "ceramic", 100, TypeOfGoods.PLUMBING, 200, "Valve", 80, 60);
		
		Plumbing bath = new Plumbing("Bath", 300, "ceramic", 40, TypeOfGoods.PLUMBING, 499, "MSI", 200, 120);
		
		Lighting lamp = new Lighting("Lamp", 0.1, "Glass", 10, TypeOfGoods.LIGHTNING, 15, "HyperX", 5, 23, quality.MEDIUM_TERM, true);
		
		Lighting lantern = new Lighting("Lantern", 2, "Glass", 25, TypeOfGoods.LIGHTNING, 50, "Razer", 15, 10, quality.LONG_TERM, false);
		
		
		List<BuilderGoods> newGoodsList = new ArrayList<>();
        newGoodsList.add(chair);
        newGoodsList.add(table);
        newGoodsList.add(toilet);
        newGoodsList.add(bath);
        newGoodsList.add(lamp);
        newGoodsList.add(lantern);
        
        System.out.println(manager1.searchGoodsByType(newGoodsList, TypeOfGoods.PLUMBING).toString());
        System.out.println(manager1.searchGoodsByType(newGoodsList, TypeOfGoods.WOODEN_GOODS).toString());
        System.out.println();
        System.out.println(manager1.sortByPriceFromCheapToExpansive(newGoodsList).toString());
        System.out.println(manager1.sortByPriceFromExpansiveToCheap(newGoodsList).toString());
        System.out.println();
        System.out.println(manager1.sortByWidthThinToWide(newGoodsList).toString());
        System.out.println(manager1.sortByWidthWideToThin(newGoodsList).toString());
        System.out.println();
	}
	

}
