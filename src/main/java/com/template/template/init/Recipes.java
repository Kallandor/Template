package com.template.template.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by dlwilson on 8/17/2014.
 */
public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Moditems.mapleLeaf), " s ", "sss", " s ", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.Flag), new ItemStack(Moditems.mapleLeaf), new ItemStack(Moditems.mapleLeaf)));
    }
}
