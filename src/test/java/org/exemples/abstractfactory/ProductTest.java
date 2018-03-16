package org.exemples.abstractfactory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	@DisplayName("Create new Product")
	void createNewProduct() {
		Product dummyProduct = new Product();

		assertNotNull(dummyProduct, "Client is null");
	}

	@Test
	@DisplayName("Throw exception if content not found")
	void throwExceptionIfNotFound() {
		Product dummyProduct = new Product();
		assertThrows(Exception.class, () -> {
			dummyProduct.getContentOfProduct(null);
		});
	}

}
