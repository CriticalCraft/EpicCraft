package com.craftmend.epiccraft.detection.checks;

import com.craftmend.epiccraft.detection.interfaces.RequirementTest;
import com.craftmend.epiccraft.utils.LogicUtil;
import lombok.NoArgsConstructor;
import org.bukkit.block.Biome;
import org.bukkit.entity.Player;

@NoArgsConstructor
public class PlainBiomeCheck implements RequirementTest {

    public static Biome[] PLAIN_BIOMES = new Biome[]{
            Biome.PLAINS,
            Biome.FOREST,
            Biome.RIVER,
            Biome.WOODED_MOUNTAINS,
            Biome.WOODED_BADLANDS_PLATEAU,
            Biome.MODIFIED_WOODED_BADLANDS_PLATEAU,
    };

    @Override
    public boolean isAbsolutelyNecessary() {
        return true;
    }

    @Override
    public boolean isApplicable(Player player) {
        return LogicUtil.contains(player.getLocation().getBlock().getBiome(), PLAIN_BIOMES);
    }
}
