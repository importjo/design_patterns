package org.exemples.composite;

import java.util.ArrayList;
import java.util.List;

public class Picture implements Graphic {

	private List<Graphic> listOfAllGraphic;

	public Picture() {
		this.listOfAllGraphic = new ArrayList<Graphic>();
	}

	@Override
	public void draw() {
		this.listOfAllGraphic.forEach((value) -> {
			value.draw();
		});
	}
	
	public void add(Graphic graphic) {
		this.listOfAllGraphic.add(graphic);
	}
	
	public Graphic get(int index) {
		return this.listOfAllGraphic.get(index);
	}

	public Graphic remove(int index) {
		return this.listOfAllGraphic.remove(index);
	}
}
