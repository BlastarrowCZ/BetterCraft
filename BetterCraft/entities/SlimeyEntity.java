package com.blastarrowcz.BetterCraft.entities;

import com.blastarrowcz.BetterCraft.init.ModEntityTypes;
import net.minecraft.block.BlockState;
import net.minecraft.entity.AgeableEntity;;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import javax.annotation.Nullable;

public class SlimeyEntity extends AnimalEntity {

    public static final Ingredient TEMPTATION_ITEMS = Ingredient.fromItems(Items.SLIME_BALL);

    public SlimeyEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 2)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.4);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new OpenDoorGoal(this,false));
        this.goalSelector.addGoal(2, new PanicGoal(this, 2.0f));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1, TEMPTATION_ITEMS, false));
        this.goalSelector.addGoal(4, new RandomWalkingGoal(this,1));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 1));
        this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 6.0f));
        this.goalSelector.addGoal(7, new LookRandomlyGoal(this));
    }

    @Override
    protected int getExperiencePoints(PlayerEntity player) {
        return 0; }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() { return SoundEvents.BLOCK_SLIME_BLOCK_PLACE; }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() { return SoundEvents.ENTITY_SLIME_DEATH_SMALL; }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) { return SoundEvents.ENTITY_SLIME_HURT_SMALL; }

    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.ENTITY_SLIME_SQUISH_SMALL, 0.15f, 1.0f);
    }

    @Nullable
    @Override
    public AgeableEntity func_241840_a(ServerWorld p_241840_1_, AgeableEntity p_241840_2_) {
        return ModEntityTypes.SLIMEY.get().create(this.world);
    }
}
