package com.company.paises;

import com.company.ConfigurationFactory;
import com.company.configurationResolver.ConfigurationResolver;

public class Argentina implements Pais{

    @Override
    public ConfigurationResolver createConfiguration(ConfigurationFactory configurationFactory) {
        return configurationFactory.buildForArgentina();
    }

    @Override
    public void hagoCosasDePais() {
        System.out.println("Como soy Argentina hago lio");
    }
}
