package vectorwing.farmersdelight.loot.modifiers;

import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import vectorwing.farmersdelight.init.ModItems;

import javax.annotation.Nonnull;
import java.util.List;

public class KnifeStrawDrops {
    public static class KnifeStrawSerializer extends GlobalLootModifierSerializer<KnifeStrawDrops.KnifeStrawModifier> {

        @Override
        public KnifeStrawDrops.KnifeStrawModifier read(ResourceLocation location, JsonObject object, ILootCondition[] ailootcondition) {
            return new KnifeStrawDrops.KnifeStrawModifier(ailootcondition);
        }
    }

    public static class KnifeStrawModifier extends LootModifier {

        protected KnifeStrawModifier(ILootCondition[] conditionsIn) {
            super(conditionsIn);
        }

        @Nonnull
        @Override
        protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
            generatedLoot.add(new ItemStack(ModItems.STRAW.get()));
            return generatedLoot;
        }
    }
}