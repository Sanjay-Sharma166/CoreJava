package com.yash.enumdemo;

public enum PizzaSize {

	SMALL(4),REGULAR(8),LARGE(12);
	int size;

private PizzaSize(int size)
{
	this.size=size;
	}
public int getSize()
{
	return this.size;
	}

}
