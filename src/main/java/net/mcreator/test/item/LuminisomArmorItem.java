
package net.mcreator.test.item;

import net.minecraft.sounds.SoundEvent;

public abstract class LuminisomArmorItem extends ArmorItem {

	public LuminisomArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 17;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 6, 5, 5}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 20;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TestModItems.LUMINISOM_INGOT.get()), new ItemStack(TestModBlocks.LUMINISOM_BLOCK.get()));
			}

			@Override
			public String getName() {
				return "luminisom_armor";
			}

			@Override
			public float getToughness() {
				return 1.05f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.51f;
			}
		}, slot, properties);
	}

	public static class Helmet extends LuminisomArmorItem {

		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "test:textures/models/armor/luminisom_layer_1.png";
		}

	}

	public static class Chestplate extends LuminisomArmorItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "test:textures/models/armor/luminisom_layer_1.png";
		}

	}

	public static class Leggings extends LuminisomArmorItem {

		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "test:textures/models/armor/luminisom_layer_2.png";
		}

	}

	public static class Boots extends LuminisomArmorItem {

		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "test:textures/models/armor/luminisom_layer_1.png";
		}

	}

}
