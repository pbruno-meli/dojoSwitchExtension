package com.company;


import com.company.devices.DesktopDevice;
import com.company.devices.Device;
import com.company.devices.OtherDevice;
import com.company.paises.Argentina;
import com.company.paises.Brasil;
import com.company.paises.Pais;

public class Main {

    public static void main(String[] args) {

        //creo una factory para los resolvers. Se evito el configurationManager para simplificar el demo
        ConfigurationResolverFactory configurationResolverFactory = new ConfigurationResolverFactory();

        //Paises configurables
        Pais argentina = new Argentina();
        argentina.hagoCosasDePais();

        configurationResolverFactory.create(argentina).queConfigurationResolverSoy();

        Pais brasil = new Brasil();
        brasil.hagoCosasDePais();
        configurationResolverFactory.create(brasil).queConfigurationResolverSoy();

        //Devices configurable
        Device desktop = new DesktopDevice();
        desktop.hagoCosasDeDevice();
        configurationResolverFactory.create(desktop).queConfigurationResolverSoy();

        Device otherDevice = new OtherDevice();
        otherDevice.hagoCosasDeDevice();
        configurationResolverFactory.create(otherDevice).queConfigurationResolverSoy();

        //Otro Objeto Configurable que implementa ConfigurableObject
        ConfigurableObject otroObjetoConfigurable = new OtroObjetoConfigurable();
        configurationResolverFactory.create(otroObjetoConfigurable).queConfigurationResolverSoy();


    }


}

