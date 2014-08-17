package com.template.template.client.gui;

import com.template.template.Handler.ConfigurationHandler;
import com.template.template.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Created by dlwilson on 8/14/2014.
 */
public class ModGuiConfig extends GuiConfig
{

    public ModGuiConfig(GuiScreen parent) {
        super(parent,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID, "Test Mod", false, false, GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}