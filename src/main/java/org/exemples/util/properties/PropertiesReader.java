package org.exemples.util.properties;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {
	private static PropertiesReader instanceOf;
	private Properties defaultProps;

	private PropertiesReader() {
		this.defaultProps = new Properties();
		loadPropertiesFile();
	}

	private void loadPropertiesFile() {
		try {
			InputStream in = getClass().getResourceAsStream("defaultProperties");
			defaultProps.load(in);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static PropertiesReader getInstanceOf() {
		if (instanceOf == null) {
			instanceOf = new PropertiesReader();
		}
		return instanceOf;
	}

	public String getStringProperty(String name) {
		return this.defaultProps.getProperty(name);
	}
}
