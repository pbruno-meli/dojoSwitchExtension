package com.company.devices;

import com.company.ConfigurationFactory;
import com.company.configurationResolver.ConfigurationResolver;

public class DesktopDevice implements Device {

   @Override
   public ConfigurationResolver createConfiguration(ConfigurationFactory configurationFactory) {
      return configurationFactory.buildForDesktop();
   }

   @Override
   public void hagoCosasDeDevice() {
      System.out.println("Como soy un Desktop Device tampoco se que hacer");
   }
}
