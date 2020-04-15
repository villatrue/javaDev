package com.smoothstack.training.daytwo;


//Construct a 2D array and find the max number and show it’s position in an array
//

public class TwoDArray {
    public static void main(String args[]) {
        int arr[][] = {
         {1,2,3,4,5},
         {6,7,8,9,10},
         {11,12,13,14,15},
         {16,17,18,19,20}
        };
//        creates a 2d array
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > max){
                	//if the object int the array's coordinates are more than max then 
                	//the new value is now the object
                    max = arr[i][j];
                }
            }
            
        }
        System.out.println("Maximum Value : " + max);
    }
}