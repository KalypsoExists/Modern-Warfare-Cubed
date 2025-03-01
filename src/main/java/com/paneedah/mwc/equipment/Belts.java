package com.paneedah.mwc.equipment;

import com.paneedah.mwc.items.equipment.carryable.ItemBackpack;
import com.paneedah.weaponlib.ItemMagazine;
import com.paneedah.weaponlib.animation.Transform;
import net.minecraft.item.Item;

public class Belts {

    public static Item magazineBelt;

    public static void init() {

        magazineBelt = new ItemBackpack.Builder()
                .withName("magazine_belt")
                .withSize(8)
                .withValidItemPredicate(ItemMagazine.class::isInstance)
                .withModel("equipment.belts.MagazineBelt")
                .withTexture("equipment/carryable/belts")
                .withEntityPositioning(() -> new Transform()
                        .withPosition(-0.5F, -1.95F, 0.5F)
                        .withScale(1, 1, 1)
                        .doGLDirect())
                .withInventoryPositioning(() -> new Transform()
                        .withPosition(-0.15, -5.1, 0.35)
                        .withRotation(18, -50, 0)
                        .withScale(3.1, 3.1, 3.1)
                        .doGLDirect())
                .build();
    }
}
