package com.testing;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class ConfigManager {
    private PropertiesConfiguration config;

    public ConfigManager(String configFilePath) {
        try {
            config = new PropertiesConfiguration(configFilePath);
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
    }

    public String getDirectoryPath() {
        return config.getString("directoryPath");
    }

    public String getOutputPath() {
        return config.getString("outputPath");
    }
}

