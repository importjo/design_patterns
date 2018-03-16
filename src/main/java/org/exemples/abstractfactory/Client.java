package org.exemples.abstractfactory;

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
