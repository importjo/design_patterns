package org.exemples.abstractfactoryproduct;

import static org.junit.jupiter.api.Assertions.*;
import org.exemples.abstractfactoryproduct.AbstractProductA;
import org.exemples.abstractfactoryproduct.Banana;
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
