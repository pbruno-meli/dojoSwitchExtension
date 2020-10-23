package com.company;

import com.company.configurationResolver.*;

public class ConfigurationResolverFactory implements ConfigurationFactory {
    //No se agrego el configuration manager

    //Recibe un objeto configurable y llama a que este devuelva su configuracion
    public ConfigurationResolver create(ConfigurableObject objectoConfigurable) {
        return objectoConfigurable.createConfiguration(this);
    }

    public ConfigurationResolver buildForDesktop() {
        return new ConfigurationResolverDesktopImp();
    }

    public ConfigurationResolver buildForOther() {
        return new ConfigurationResolverImp();
    }

    public  ConfigurationResolver buildForArgentina(){
        return new ConfigurationResolverArgentinaImp();
    }

    public  ConfigurationResolver buildForBrasil(){
        return new ConfigurationResolverBrasilImp();
    }
}
