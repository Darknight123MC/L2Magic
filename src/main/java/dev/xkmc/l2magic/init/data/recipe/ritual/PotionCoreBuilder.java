package dev.xkmc.l2magic.init.data.recipe.ritual;

import dev.xkmc.l2magic.content.magic.ritual.PotionCoreRecipe;
import dev.xkmc.l2magic.init.registrate.LLRecipes;

public class PotionCoreBuilder extends AbstractRitualBuilder<PotionCoreBuilder, PotionCoreRecipe> {

	public PotionCoreBuilder() {
		super(LLRecipes.RSP_CORE.get());
	}

}
