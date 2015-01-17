package handler;

import java.io.File;

import reference.Reference;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler {
	
	public static Configuration configuration;
	public static boolean testValue = false;
	
	
	public static void init(File configFile){
		// Create the configuration object from the given configuration file

		if (configuration == null){
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}
	

	
	public static void loadConfiguration(){
		testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example config value");
		
		boolean configValue;
		try {
			// Load the configuration file
			configuration.load();
			// Read in properties from configuration file
			configValue = configuration.get(Configuration.CATEGORY_GENERAL,"configValue",true,"This is an example config value").getBoolean(true);
		}
		catch (Exception e){
			// Log the exception
		}
		finally{
			// Save the configuration file 
			
			if(configuration.hasChanged()){
				configuration.save();
			}
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
