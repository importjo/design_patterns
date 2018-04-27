package org.exemples.composite;

public class Test {
	public static void main(String[] args) {
		Picture test = new Picture();
		test.add(new Text());
		test.add(new Image());
		test.add(new Line());
		
		Picture testMany = new Picture();
		testMany.add(new Image());
		testMany.add(new Image());
		
		test.add(testMany);
		
		test.draw();
		
	}
}
