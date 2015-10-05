package com.ss.init;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

public class ModRecipes {
	public static void init() {

		Collection<Item> removeSet = new HashSet();
		Collections.addAll(removeSet, new Item[] {}); // Add items to get recipe removed
		Iterator<IRecipe> iterator = CraftingManager.getInstance().getRecipeList().iterator();

		while (iterator.hasNext()) {
			IRecipe recipe = iterator.next();
			if (recipe == null)
				continue;
			ItemStack output = recipe.getRecipeOutput();
			if (output != null && output.getItem() != null && removeSet.contains(output.getItem()))
				iterator.remove();
		}
	}
}
