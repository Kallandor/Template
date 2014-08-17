package com.template.template.init;

import com.template.template.item.ItemMapleLeaf;
import com.template.template.item.ItemsTemplate;
import com.template.template.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by dlwilson on 8/14/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class Moditems
{
    public static final ItemsTemplate mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
