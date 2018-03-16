package org.exemples.abstractfactoryproduct;

import static org.junit.jupiter.api.Assertions.*;

import org.exemples.abstractfactoryproduct.ProductBehavior;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	@DisplayName("Create new Product")
	void createNewProduct() {
		ProductBehavior dummyProduct = new ProductBehavior();

		assertNotNull(dummyProduct, "Client is null");
	}

	@Test
	@DisplayName("Throw exception if content not found")
	void throwExceptionIfNotFound() {
		ProductBehavior dummyProduct = new ProductBehavior();
		assertThrows(Exception.class, () -> {
			dummyProduct.getContentOfProduct(null);
		});
	}

}
