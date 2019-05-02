package com.revature.problemsolver;

public class SortStuff {

	public static void main(String[] args) {
		bubbleSort(death());

	}

	public static int[] death() {
		int a = 100000;
		int[] deathArray = new int[a];
		for (int i = deathArray.length - 1; i >= 0; i--) {
			deathArray[i] = i;
		}
		System.out.println("DeathArray filled!");
		return deathArray;
	}

	public static int[] bubbleSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			//System.out.println(i);

			for (int j = 0; j <= i; j++) {

				if (a[j] > a[j + 1]) {
					// swap arr[j+1] and arr[i]
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("Array is sorted!");
		return a;
	}
}
