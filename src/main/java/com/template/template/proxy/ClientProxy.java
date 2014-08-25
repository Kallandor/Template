package com.template.template.proxy;

import com.template.template.client.gui.settings.Keybindings;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

/**
 * Created by dlwilson on 8/14/2014.
 */
public class ClientProxy extends CommonProxy
{

    @Override
    public void registerKeyBindings()
    {
        ClientRegistry.registerKeyBinding(Keybindings.charge);
        ClientRegistry.registerKeyBinding(Keybindings.release);
    }
}
