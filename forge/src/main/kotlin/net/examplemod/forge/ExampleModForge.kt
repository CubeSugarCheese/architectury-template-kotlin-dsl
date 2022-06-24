package net.examplemod.forge

import dev.architectury.platform.forge.EventBuses
import net.examplemod.ExampleMod
import net.examplemod.ExampleMod.init
import net.examplemod.forge.datagen.ChineseProvider
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent

@Mod(ExampleMod.MOD_ID)
class ExampleModForge {
    init {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ExampleMod.MOD_ID, FMLJavaModLoadingContext.get().modEventBus)
        FMLJavaModLoadingContext.get().modEventBus.addListener(this::onGatherData)
        init()
    }

    @Deprecated("", ReplaceWith("onGatherDataEvent()"))
    private fun onGatherData(event: GatherDataEvent) {
        val gen = event.generator
        gen.addProvider(true, ChineseProvider(gen))
    }
}