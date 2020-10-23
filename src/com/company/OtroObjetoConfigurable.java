package com.company;

import com.company.configurationResolver.ConfigurationResolver;

public class OtroObjetoConfigurable implements ConfigurableObject{

    @Override
    public ConfigurationResolver createConfiguration(ConfigurationFactory configurationFactory) {
        return configurationFactory.builForOtherConfigurableObject();
    }
}
