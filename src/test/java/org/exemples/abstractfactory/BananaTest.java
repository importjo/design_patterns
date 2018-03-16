package org.exemples.abstractfactory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BananaTest {

	@Test
	@DisplayName("Create new Banana")
	void createNewBanana() {
		AbstractProductA dummyProductA = new Banana();

		assertNotNull(dummyProductA, "Client is null");
	}

}
