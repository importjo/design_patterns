package org.exemples.abstractfactory;

import org.exemples.abstractfactoryproduct.AbstractProductA;
import org.exemples.abstractfactoryproduct.AbstractProductB;
import org.exemples.abstractfactoryproduct.Banana;
import org.exemples.abstractfactoryproduct.ProductB;
import org.exemples.abstractfactoryproduct.Tomato;
import org.exemples.util.properties.PropertiesReader;

public class AbstractFactoryConcrete implements AbstractFactory {

	private final String DEFAULT_PRODUCT_A = PropertiesReader.getInstanceOf().getStringProperty("product.a.type");

	@Override
	public AbstractProductA createProductA() {
		if (DEFAULT_PRODUCT_A.equals("Tomato")) {
			return new Tomato();
		}
		return new Banana();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB();
	}

}
