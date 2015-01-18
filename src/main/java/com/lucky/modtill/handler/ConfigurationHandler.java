package handler;

import java.io.File;

import reference.Reference;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler {
	
	public static Configuration configuration;
	public static boolean configValue = false;
	
	
	public static void init(File configFile){
		// Create the configuration object from the given configuration file

		if (configuration == null){
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}
	

	
	private static void loadConfiguration(){
		configValue = configuration.getBoolean("Test configuration value", Configuration.CATEGORY_GENERAL, false, "This is an example config value");		
			if(configuration.hasChanged()){
				configuration.save();
			}
	}
	
	
	
	@SubscribeEvent
	public void onConfigurationChangedEvent (ConfigChangedEvent.OnConfigChangedEvent event){
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID)){
			// Resync configs
			loadConfiguration();
		}
	}
	
}
