package org.plugin.luckygrass;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

public final class LuckyGrass extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        //Plugin startup logic
        System.out.println("LuckyGrass is initialising...");
        getServer().getPluginManager().registerEvents(this, this);
        //Sometimes I wonder why I do this
    }
    @EventHandler
    public void onGrassBreak(BlockBreakEvent bbe){
        //Modifies grass block drops
        Random RandomChance = new Random();
        if(RandomChance.nextInt(1, 10) == 5) {
            if (bbe.getBlock().getType() == Material.GRASS_BLOCK) {
                Random RandomNumber = new Random();
                int BlockPicker = RandomNumber.nextInt(1, 10);
                if (BlockPicker == 1) {
                    bbe.getBlock().getWorld().dropItem(bbe.getBlock().getLocation(), new ItemStack(Material.ANVIL));
                } else if (BlockPicker == 2) {
                    bbe.getBlock().getWorld().dropItem(bbe.getBlock().getLocation(), new ItemStack(Material.GOLDEN_APPLE));
                } else if (BlockPicker == 3) {
                    bbe.getBlock().getWorld().dropItem(bbe.getBlock().getLocation(), new ItemStack(Material.BAKED_POTATO));
                } else if (BlockPicker == 4) {
                    bbe.getBlock().getWorld().dropItem(bbe.getBlock().getLocation(), new ItemStack(Material.BELL));
                } else if (BlockPicker == 5) {
                    bbe.getBlock().getWorld().dropItem(bbe.getBlock().getLocation(), new ItemStack(Material.BREAD));
                } else if (BlockPicker == 6) {
                    bbe.getBlock().getWorld().dropItem(bbe.getBlock().getLocation(), new ItemStack(Material.NETHERITE_INGOT));
                } else if (BlockPicker == 7) {
                    bbe.getBlock().getWorld().dropItem(bbe.getBlock().getLocation(), new ItemStack(Material.DIAMOND));
                } else if (BlockPicker == 8) {
                    bbe.getBlock().getWorld().dropItem(bbe.getBlock().getLocation(), new ItemStack(Material.COAL));
                } else if (BlockPicker == 9) {
                    bbe.getBlock().getWorld().dropItem(bbe.getBlock().getLocation(), new ItemStack(Material.CHAIN));
                } else if (BlockPicker == 10) {
                    bbe.getBlock().getWorld().dropItem(bbe.getBlock().getLocation(), new ItemStack(Material.CYAN_BED));
                }
            }
        }
    }
}
