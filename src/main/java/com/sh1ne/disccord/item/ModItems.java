package com.sh1ne.disccord.item;

import com.sh1ne.disccord.Disccord;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CUSTOM_RECORD;
    static {
        CUSTOM_RECORD = registerItem("custom_record", new Item(new Item.Settings()
                        .registryKey(
                                RegistryKey.of(
                                        RegistryKeys.ITEM,
                                        Identifier.of(Disccord.MOD_ID, "custom_record")
                                )
                        )
                )
        );
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Disccord.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Disccord.LOGGER.info("Registering Mod Items For " + Disccord.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(CUSTOM_RECORD);
        });
    }
}
