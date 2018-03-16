package org.exemples.abstractfactory;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.exemples.abstractfactoryproduct.AbstractProductA;
import org.hamcrest.core.IsInstanceOf;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AbstractFactoryConcreteTest {

	@Test
	@DisplayName("Create new ProductA")
	void createProductA() {
		AbstractFactory dummyFactory = new AbstractFactoryConcrete();

		AbstractProductA productACreated = dummyFactory.createProductA();

		assertThat(productACreated, new IsInstanceOf(AbstractProductA.class));
	}

}
