package com.javapractise;
      // initialize a two-dimensional array
public class Matrix32 {
	public static void main(String[] args) {
		double m[] []= {     //  here you can also give int
				{0*0, 1*0, 2*0, 3*0, 4*0},
				{0*1, 1*1, 2*1, 2*1, 4*1},
				{0*2, 1*2, 2*2, 3*2, 4*2},
				{0*3, 1*3, 2*3, 3*3, 4*3}
				};
		int i,j;
		for (i=0; i<4; i++) {
			for (j=0; j<4; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}		
		}
}
