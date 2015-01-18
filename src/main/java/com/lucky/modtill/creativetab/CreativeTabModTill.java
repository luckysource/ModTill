package creativetab;

import init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import reference.Reference;

public class CreativeTabModTill {
	
	public static final CreativeTabs MT_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()){
		@Override
		public Item getTabIconItem(){
			return ModItems.lookingGlass;
		}
	};
}
