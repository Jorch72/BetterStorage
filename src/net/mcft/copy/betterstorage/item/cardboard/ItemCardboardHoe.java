package net.mcft.copy.betterstorage.item.cardboard;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.mcft.copy.betterstorage.BetterStorage;
import net.mcft.copy.betterstorage.misc.Constants;
import net.mcft.copy.betterstorage.utils.StackUtils;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ItemCardboardHoe extends ItemHoe implements ICardboardItem {
	
	public ItemCardboardHoe(int id) {
		super(id - 256, ItemCardboardSheet.toolMaterial);
		setCreativeTab(BetterStorage.creativeTab);
		setUnlocalizedName(Constants.modId + ".cardboardHoe");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(Constants.modId + ":cardboardHoe");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack stack, int renderPass) {
		return StackUtils.get(stack, 0x705030, "display", "color");
	}
	
}