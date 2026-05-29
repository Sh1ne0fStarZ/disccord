package com.sh1ne.disccord.compat;

import com.sh1ne.disccord.item.ModItems;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.entry.EntryRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.item.ItemStack;

public class DisccordReiClient implements REIClientPlugin {

    @Override
    public void registerEntries(EntryRegistry registry) {
        registry.addEntry(EntryStacks.of(new ItemStack(ModItems.CUSTOM_RECORD)));
    }
}