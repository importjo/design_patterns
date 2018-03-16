package org.exemples.abstractfactory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import org.exemples.abstractfactoryproduct.AbstractProductA;
import org.exemples.abstractfactoryproduct.AbstractProductB;
import org.exemples.abstractfactoryproduct.ProductB;
import org.exemples.abstractfactoryproduct.ProductBehavior;
import org.exemples.abstractfactoryproduct.Tomato;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ClientTest {

	@Test
	@DisplayName("Create new Client")
	void createNewClient() {
		Client dummyClient = new Client();

		assertNotNull(dummyClient, "Client is null");
	}

	@Test
	@DisplayName("Client get ProductA from AbstractFactory")
	void clientGetProductAFromAbstractFactory() throws Exception {
		Client dummyClient = new Client();
		ProductBehavior dummyBehavior = new ProductBehavior();

		AbstractProductA resultProduct = dummyClient.getProductA();
		String contentFound = dummyBehavior.getContentOfProduct(resultProduct);
		String contentExpected = dummyBehavior.getContentOfProduct(new Tomato());

		assertThat(contentFound, is(contentExpected));
	}
	
	@Test
	@DisplayName("Client get ProductB from AbstractFactory")
	void clientGetProductBFromAbstractFactory() throws Exception {
		Client dummyClient = new Client();
		ProductBehavior dummyBehavior = new ProductBehavior();

		AbstractProductB resultProduct = dummyClient.getProductB();
		String contentFound = dummyBehavior.getContentOfProduct(resultProduct);
		String contentExpected = dummyBehavior.getContentOfProduct(new ProductB());

		assertThat(contentFound, is(contentExpected));
	}

}
