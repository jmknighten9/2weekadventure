package com.revature.collections;

import com.revature.blueprints.RocketShip;

public class FunWithArrays {
	/*
	 * Arrays in Java are fixed length/type unlike JavaScript where rules dont
	 * matter
	 * 
	 */
	public static void main(String[] args) {
		// int array with 5 elements
		int[] myArray = new int[5];
		myArray[3] = 3;
		for (int i = 0; i < myArray.length; i++) {
			//System.out.println(myArray[i]);
		}
		//Array Literal
		int [] myArray2= {1,3,4,5,2,6,7,3,8,9,2004};//11 elements
		//Take each element, multiply by 15 and then print the array
		for (int i =0;i< myArray2.length;i++) {
			myArray2[i]*=15;
			//System.out.println(myArray2[i]);
		}
		//IN A METHOD, make a String array and then add something to those elements and
		//then print them off backwards ( last element printed 1st...)
		//funStringArray();
		 RocketShip [] rocketShipArray= new RocketShip [27] ;
		 RocketShip rs1= new RocketShip("Fred",20001, 9001,false);
		 RocketShip rs2= new RocketShip("Stuart", 17,7, true );
		 RocketShip rs3= new RocketShip("Kelly", 2,10, true );
		 RocketShip rs4= new RocketShip("Ian", 1,100, true );
		 RocketShip rs5= new RocketShip("Nick", 3,2, false );
		 RocketShip rs6= new RocketShip("Janie", 5,15,false);
		 RocketShip rs7= new RocketShip("Daniel", 9,200,true);
		 rocketShipArray[0]= rs1;
		 rocketShipArray[1]= rs2;
		 rocketShipArray[3]= rs3;
		 rocketShipArray[10]= rs4;
		 rocketShipArray[11]= rs5;
		 rocketShipArray[20]= rs6;
		 rocketShipArray[26]= rs7;
		 System.out.println("the fuel capacity for rs3 is : " + rocketShipArray[3].getFuelCapacity() );
	}
	public static void funStringArray() {
		String [] a = {"Matt", "Tiff", "Trevor","Gavin"};
		for(int i=a.length-1; i>=0;i--) {
			a[i]= a[i]+ " Knighten";
			System.out.println(a[i]);
		}
	}
}
