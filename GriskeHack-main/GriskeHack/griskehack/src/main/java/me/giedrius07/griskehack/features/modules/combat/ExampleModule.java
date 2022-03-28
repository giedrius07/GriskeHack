package me.giedrius07.griskehack.modules;

import me.giedrius07.griskehack.api.Module;
import net.minecraft.util.text.TextComponentString;

public class ExampleModule extends Module { // Extend Module
    public ExampleModule() {
        super("TestModule", "Just a example"); // super("name", "description");
    }

    @Override
    public void onEnable() { // Everything in here will happen when the module enables, same with onDisable
        mc.player.sendMessage(new TextComponentString("hi"));
    }

    @Override
    public void onDisable() {
        mc.player.sendMessage(new TextComponentString("bye"));
    }
}
