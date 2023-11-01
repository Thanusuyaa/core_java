package com.javapractise;
class Box{
	double width;
	double height;
	double depth;
	// This is the constructor for box.
	Box(){
		System.out.println("constructing box");
		width=10;
		height=10;
		depth=10;
	}
	// compute and return volume
	double volume() {
		return width* height*depth;
	}
}

public class BoxDemo6 {

	public static void main(String[] args) {
	  Box mybox1 = new Box();
	  Box mybox2 = new Box();
	  double vol;
	  // get volume of first box
	  vol=mybox1.volume();
	  System.out.println("volume is "+ vol);
	  // get volume of second box
	  vol=mybox2.volume();
	  System.out.println("volume is"+ vol);

	}

}
