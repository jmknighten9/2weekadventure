package com.revature.mdarrays;

public class TwoDArrary {

	public static void main(String[] args) {
		int twoD[][]=new int [4][5];//4 row with 5 columns
		int i,j,k=0;
		for(i=0; i<4;i++){
			for (j=0;j<5;j++) {
				twoD[i][j]=k;
				k++;
			}
		}
			for(i=0; i<4;i++){
				for (j=0;j<5;j++) {
					System.out.print(twoD[i][j]+ " ");

				}
				System.out.println();
			}
		}
	}


