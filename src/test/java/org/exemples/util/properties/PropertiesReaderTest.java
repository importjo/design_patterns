package org.exemples.util.properties;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.hamcrest.CoreMatchers.is;

class PropertiesReaderTest {

	@Test
	@DisplayName("Create properties not null")
	void checkSingletonNotNull() {
		PropertiesReader dummy = PropertiesReader.getInstanceOf();
		assertNotNull(dummy, "PropertiesReader is null.");
	}
	
	@Test
	@DisplayName("getStringProperty result exist")
	void getStringPropertyExist() {
		PropertiesReader dummy = PropertiesReader.getInstanceOf();
		String dummyProperties = dummy.getStringProperty("product.a.type");
		assertThat(dummyProperties, is("Tomato"));
	}
	
	@Test
	@DisplayName("getStringProperty result not exist")
	void getStringPropertyWithoutInstance() {
		PropertiesReader dummy = PropertiesReader.getInstanceOf();
		String dummyProperties = dummy.getStringProperty("product");
		assertNull(dummyProperties);
	}
	

}
