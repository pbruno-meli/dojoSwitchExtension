package com.company.devices;

import com.company.ConfigurationFactory;
import com.company.configurationResolver.ConfigurationResolver;

public class OtherDevice implements Device{
    @Override
    public ConfigurationResolver createConfiguration(ConfigurationFactory configurationFactory) {
        return configurationFactory.buildForOther();
    }

    @Override
    public void hagoCosasDeDevice() {
        System.out.println("Como soy Otro Device no se que hacer");
    }
}
