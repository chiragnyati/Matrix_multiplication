package com.pp;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixMulti {

	
	public static void main(String[] args) {
		
		int arr[][] = new int[3][3];
		int arr1[][] = new int[3][3];
		int arr2[][]= new int [3][3];
		
		ArrayList al = new ArrayList();
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		for(int i=0 ; i<3 ; i++)
		{
			
			for(int j=0 ; j<3 ; j++)
			{
				System.out.print("enter any number");
				int x = sc.nextInt();
				arr[i][j]=x;
				arr1[i][j]=j+1;
			}
		}
		for(int i=0 ; i<3 ; i++)
		{
			int x=0;
			while(x<3)
			{
				int sum=0;
			for(int j=0; j<3 ; j++)
			{
				sum=sum+(arr[i][j]*arr1[j][x]);
			}
			 arr2[i][x]=sum;
			x++;
			}
		}
		for(int i=0 ; i<3 ; i++)
		{
			for(int j=0 ; j<3 ; j++)
			{
				System.out.print(arr2[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
