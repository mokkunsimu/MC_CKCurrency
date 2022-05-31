package com.mokkunsimu.CKCurrency;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCKBill extends Item {

    public ItemCKBill() {
        super();
        //レジストリに保存する名称を登録する。大文字禁止。
        this.setRegistryName("ckcurrency", "ckbill");
        //クリエイティブタブを設定する。
        this.setCreativeTab(CreativeTabs.MATERIALS);
        //翻訳名を登録する。大文字非推奨。
        this.setUnlocalizedName("ck_bill");
    }
}