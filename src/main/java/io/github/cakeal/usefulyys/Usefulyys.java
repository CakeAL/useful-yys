package io.github.cakeal.usefulyys;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Usefulyys implements ModInitializer {

	public static final Item Yys = new YysItem(new Item.Settings().group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder().meat().hunger(4).saturationModifier(0.3F).build()));
	public static final Item RsluUgigqi = new RsluUgigqiItem(new Item.Settings().group(ItemGroup.TOOLS).maxCount(1));
	public static final Item GszotdUgigqi = new GszotdUgigqiItem(new Item.Settings().group(ItemGroup.TOOLS).maxCount(1));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("usefulyys", "yys"), Yys) ;
		Registry.register(Registry.ITEM, new Identifier("usefulyys","rsluugigqi"), RsluUgigqi);
		Registry.register(Registry.ITEM, new Identifier("usefulyys","gszotdugigqi"), GszotdUgigqi);
		/*System.out.println("我想在这里输出一句没有用的话。");*/
	}
}
