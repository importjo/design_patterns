package org.exemples.abstractfactory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TomatoTest {

	@Test
	@DisplayName("Create new Tomato")
	void createNewTomato() {
		AbstractProductA dummyProductA = new Tomato();

		assertNotNull(dummyProductA, "Client is null");
	}

}
