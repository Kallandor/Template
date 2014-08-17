package com.template.template.Handler;

import java.io.File;

import com.template.template.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

/**
 * Created by dlwilson on 8/14/2014.
 */
public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile) {
        // Create the configuration object from the given configuration file
    }
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            // Resync configs
            loadConfiguration();
        }
    }

    public void loadConfiguration()
    {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example config value");

        if (configuration.hasChanged())
        {
            configuration.save();
        }

    }
}
