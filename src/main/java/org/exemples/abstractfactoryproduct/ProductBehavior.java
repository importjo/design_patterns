package org.exemples.abstractfactoryproduct;

public class ProductBehavior {
	
	public String getContentOfProduct(Object product) throws Exception {
		if (product instanceof AbstractProductA) {
			ProductA pA = (ProductA) product;
			return pA.content;
		} else if (product instanceof AbstractProductB) {
			ProductB pB = (ProductB) product;
			return pB.content;
		}
		throw new Exception("No Such Product.");
	}
}
