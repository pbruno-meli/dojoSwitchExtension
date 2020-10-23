package com.company.paises;

import com.company.ConfigurationFactory;
import com.company.configurationResolver.ConfigurationResolver;

public class Brasil implements Pais{
    @Override
    public void hagoCosasDePais() {
        System.out.println("Como soy Brasil peleo capoeira");
    }

    @Override
    public ConfigurationResolver createConfiguration(ConfigurationFactory configurationFactory) {
        return configurationFactory.buildForBrasil();
    }
}
