package com.mokkunsimu.CKCurrency;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = "ckcurrency", version = "1.0", name = "CKCurrency")
public class CKCurrency {
    public static final Item CKBILL = new ItemCKBill();
    public static final Item CKCOIN = new ItemCKCoin();
    public static final Item KATAISHI = new ItemKataIshi();

    @Mod.EventHandler
    //この関数でMODファイル自体をイベントの発火先にする。
    public void construct(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    //アイテムを登録するイベント。旧preinitのタイミングで発火する。
    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(CKBILL);
        event.getRegistry().register(CKCOIN);
        event.getRegistry().register(KATAISHI);
    }

    //モデルを登録するイベント。SideOnlyによってクライアント側のみ呼ばれる。旧preinitのタイミングで発火する。
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(CKBILL, 0, new ModelResourceLocation(new ResourceLocation("ckcurrency", "ckbill"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CKCOIN, 0, new ModelResourceLocation(new ResourceLocation("ckcurrency", "ckcoin"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(KATAISHI, 0, new ModelResourceLocation(new ResourceLocation("ckcurrency", "kataishi"), "inventory"));
    }
}