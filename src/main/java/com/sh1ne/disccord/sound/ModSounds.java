package com.sh1ne.disccord.sound;

import com.sh1ne.disccord.Disccord;
import net.minecraft.block.jukebox.JukeboxSong;
import net. minecraft.registry.Registries;
import net. minecraft.registry.Registry;
import net. minecraft.registry.RegistryKey;
import net. minecraft.registry.RegistryKeys;
import net. minecraft.sound.BlockSoundGroup;
import net. minecraft.sound.SoundEvent;
import net. minecraft.util.Identifier;

public class ModSounds {



    private static SoundEvent registerSoundEvent(String name){
        Identifier id = Identifier.of(Disccord.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds(){
        Disccord.LOGGER.info("Register Mod Sounds for " + Disccord.MOD_ID);
    }

}
