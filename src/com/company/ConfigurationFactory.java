package com.company;

import com.company.configurationResolver.ConfigurationResolver;

/**
 * Interfaz para para crear distintos ConfigurationResolver
 */
public interface ConfigurationFactory {

    ConfigurationResolver buildForDesktop();

    ConfigurationResolver buildForOther();

    ConfigurationResolver buildForArgentina();

    ConfigurationResolver buildForBrasil();

    ConfigurationResolver builForOtherConfigurableObject();
}
