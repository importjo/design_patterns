package org.exemples.abstractfactory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
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
		Product dummyBehavior = new Product();

		AbstractProductA resultProduct = dummyClient.getProductA();
		String contentFound = dummyBehavior.getContentOfProduct(resultProduct);
		String contentExpected = dummyBehavior.getContentOfProduct(new Tomato());

		assertThat(contentFound, is(contentExpected));
	}
	
	@Test
	@DisplayName("Client get ProductB from AbstractFactory")
	void clientGetProductBFromAbstractFactory() throws Exception {
		Client dummyClient = new Client();
		Product dummyBehavior = new Product();

		AbstractProductB resultProduct = dummyClient.getProductB();
		String contentFound = dummyBehavior.getContentOfProduct(resultProduct);
		String contentExpected = dummyBehavior.getContentOfProduct(new ProductB());

		assertThat(contentFound, is(contentExpected));
	}

}
