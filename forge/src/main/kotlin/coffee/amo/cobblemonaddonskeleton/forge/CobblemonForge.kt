package coffee.amo.cobblemonaddonskeleton.forge

import coffee.amo.cobblemonaddonskeleton.CobblemonAddonSkeleton
import dev.architectury.platform.forge.EventBuses
import java.util.*
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent

@Mod(CobblemonAddonSkeleton.MODID)
class CobblemonAddonSkeleton {
    init {
        with(thedarkcolour.kotlinforforge.forge.MOD_BUS) {
            EventBuses.registerModEventBus(CobblemonAddonSkeleton.MODID, this)
            addListener(this@CobblemonAddonSkeleton::initialize)
            addListener(this@CobblemonAddonSkeleton::serverInit)
        }
    }

    fun serverInit(event: FMLDedicatedServerSetupEvent) {
    }

    fun initialize(event: FMLCommonSetupEvent) {
        CobblemonAddonSkeleton.initialize()
        System.out.println("Cobblemon Forge Init.")
    }

}