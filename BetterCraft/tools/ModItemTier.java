package com.blastarrowcz.BetterCraft.tools;

import com.blastarrowcz.BetterCraft.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    STEEL(2, 750, 7.0f, 2.0f, 10, () -> {
        return Ingredient.fromItems(RegistryHandler.STEEL_INGOT.get());}),

    COPPER(1, 200, 5.0f, 1.0f, 15, () -> {
        return Ingredient.fromItems(RegistryHandler.COPPER_INGOT.get());}),

    TIN(1, 175, 5.25f, 1.0f, 15, () -> {
        return Ingredient.fromItems(RegistryHandler.TIN_INGOT.get());});

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

            ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
                this.harvestLevel = harvestLevel;
                this.maxUses = maxUses;
                this.efficiency = efficiency;
                this.attackDamage = attackDamage;
                this.enchantability = enchantability;
                this.repairMaterial = repairMaterial;
            }
    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
