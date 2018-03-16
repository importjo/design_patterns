package org.exemples.abstractfactory;

import org.exemples.abstractfactoryproduct.AbstractProductA;
import org.exemples.abstractfactoryproduct.AbstractProductB;

public interface AbstractFactory {
	public AbstractProductA createProductA();
	public AbstractProductB createProductB();
}
