
package cz.pisekpiskovec.piseksenderite.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import cz.pisekpiskovec.piseksenderite.itemgroup.CreativeTabItemGroup;
import cz.pisekpiskovec.piseksenderite.PiseksEnderiteModElements;

@PiseksEnderiteModElements.ModElement.Tag
public class EnderiteShardItem extends PiseksEnderiteModElements.ModElement {
	@ObjectHolder("piseks_enderite:enderite_shard")
	public static final Item block = null;

	public EnderiteShardItem(PiseksEnderiteModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CreativeTabItemGroup.tab).maxStackSize(64).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("enderite_shard");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
