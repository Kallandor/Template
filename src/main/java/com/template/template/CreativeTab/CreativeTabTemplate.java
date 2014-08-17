package com.template.template.CreativeTab;

import com.template.template.init.Moditems;
import com.template.template.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by dlwilson on 8/16/2014.
 */
public class CreativeTabTemplate
{
    public static final CreativeTabs TEMPLATE_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return Moditems.mapleLeaf;
        }
    };
}
