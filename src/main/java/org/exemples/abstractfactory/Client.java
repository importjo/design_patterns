package org.exemples.abstractfactory;

import org.exemples.abstractfactoryproduct.AbstractProductA;
import org.exemples.abstractfactoryproduct.AbstractProductB;

public class Client {
	public Client() {

	}

	public AbstractProductA getProductA() {
		AbstractFactory productFactory = new AbstractFactoryConcrete();
		return productFactory.createProductA();
	}

	public AbstractProductB getProductB() {
		AbstractFactory productFactory = new AbstractFactoryConcrete();
		return productFactory.createProductB();
	}

}
