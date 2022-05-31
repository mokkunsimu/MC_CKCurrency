package com.mokkunsimu.CKCurrency;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCKCoin extends Item {

    public ItemCKCoin() {
        super();
        //レジストリに保存する名称を登録する。大文字禁止。
        this.setRegistryName("ckcurrency", "ckcoin");
        //クリエイティブタブを設定する。
        this.setCreativeTab(CreativeTabs.MATERIALS);
        //翻訳名を登録する。大文字非推奨。
        this.setUnlocalizedName("ck_coin");
    }
}