package me.seetch.emptyworld;

import me.seetch.emptyworld.generator.EmptyWorldGenerator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public final class EmptyWorldPlugin extends JavaPlugin {

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new EmptyWorldGenerator();
    }
}
