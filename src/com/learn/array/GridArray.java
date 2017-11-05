package com.learn.array;

/*
 * This is the GridArray class
 */
public class GridArray {

	public static void main(String[] args) {

		
		int[][] mark = {
				{76,86,85,98,77},
				{98,87,65,79,85},
				{67,95,93,72,81}
			};
		System.out.println("ARRAY LENGHT ARE :: "+mark.length);
		int len = mark.length;
		int len1 = mark[0].length;
/*
 * looping the array
 */
		for( int i = 0 ; i < len ; i++)
		{
			for( int j = 0 ; j < len1; j++)
			{
				System.out.println(" ARRAY VALUES ARE :: "+mark[i][j]);
			}
		}
	}

}
