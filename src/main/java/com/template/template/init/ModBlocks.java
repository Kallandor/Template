package com.template.template.init;

import com.template.template.block.blockTemplate.BlockFlag;
import com.template.template.block.blockTemplate.BlockTemplate;
import com.template.template.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by dlwilson on 8/16/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class ModBlocks
{
    public static final BlockTemplate Flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(Flag, "Flag");
    }

}
