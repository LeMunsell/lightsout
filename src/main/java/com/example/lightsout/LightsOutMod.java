package com.example.lightsout;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.LightLayer;

@Mod(LightsOutMod.MODID)
public class LightsOutMod {
    public static final String MODID = "lightsout";

    public LightsOutMod() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (!event.player.level().isClientSide) {
            ServerPlayer player = (ServerPlayer) event.player;
            int skyLight = player.level().getBrightness(LightLayer.SKY, player.blockPosition());
            if (skyLight == 0) {
                // Apply a brief darkness effect when underground
                player.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 40, 0, true, false));
            }
        }
    }
}
