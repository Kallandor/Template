package com.template.template.init;

import com.template.template.item.ItemMapleLeaf;
import com.template.template.item.ItemsMCM;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by dlwilson on 8/14/2014.
 */
public class Moditems
{
    public static final ItemsMCM mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
