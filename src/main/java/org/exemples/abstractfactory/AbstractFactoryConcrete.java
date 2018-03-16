package org.exemples.abstractfactory;

public class AbstractFactoryConcrete implements AbstractFactory {

	private final String DEFAULT_PRODUCT_A = "Tomato";

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
