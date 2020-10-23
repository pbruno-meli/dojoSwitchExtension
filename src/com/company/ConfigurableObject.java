package com.company;

import com.company.configurationResolver.ConfigurationResolver;

/**
 * Interfaz para generar objetos que puedan devolver su configuracion.
 */
public interface ConfigurableObject {
    ConfigurationResolver createConfiguration(ConfigurationFactory configurationFactory);
}
