package init;

import reference.Reference;
import block.BlockModTill;
import block.BlockLaserFence;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
	
	public static final BlockModTill laserFence = new BlockLaserFence();
	
	public static void init(){
		GameRegistry.registerBlock(laserFence, "LaserFence");
	}
}
