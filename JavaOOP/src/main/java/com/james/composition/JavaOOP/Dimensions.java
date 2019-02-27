package com.james.composition.JavaOOP;

public class Dimensions {

	private int widht;
	private int height;
	private int depth;

	public Dimensions(int widht, int height, int depth) {
		super();
		this.widht = widht;
		this.height = height;
		this.depth = depth;
	}

	public void setWidht(int widht) {
		this.widht = widht;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getWidht() {
		return widht;
	}

	public int getHeight() {
		return height;
	}

	public int getDepth() {
		return depth;
	}

	public String getDimensionsDetails() {
		String data = +widht+"(W)" +"x" + height+"(H)"  +"x" + depth+"(D)" ;
		return data;
	}

}
