package init;

import reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import item.ItemLookingGlass;
import item.ItemModTill;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	
	public static final ItemModTill lookingGlass = new ItemLookingGlass();
	
	public static void init(){
		GameRegistry.registerItem(lookingGlass, "LookingGlass");
	}
}
