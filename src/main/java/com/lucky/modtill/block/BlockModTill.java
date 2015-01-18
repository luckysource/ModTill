package block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import creativetab.CreativeTabModTill;

public class BlockModTill extends Block{
	
	public BlockModTill(Material material){
		super(material);
		this.setCreativeTab(CreativeTabModTill.MT_TAB);
	}
	
	public BlockModTill(){
		this(Material.rock);
	}
	
	
	
	@Override
	public String getUnlocalizedName(){
		return String.format("tile.%s%s",Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName( super.getUnlocalizedName()));
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		blockIcon = iconRegister. registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName){
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}
}
