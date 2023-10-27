package JavaProgrammingLAB;

import java.util.Scanner;

/*
|----------------------------------|
|DATE: week 9 | 2023 oct 26 | LAB 6|
|----------------------------------|
*/

/*
* 4.Fourth question:
* Write java program that:
* Ask the user to give a positive number between 10 and 20.
* Create an array of integer. The length of the array is the given number by the user.
* Print the content of the array
* Fill the array with numbers from 0 to the given number -1.
* Print the content of the array
* Fill the array with positive random numbers less than 200.
* Print the content of the array.
* Find and print :
* The odd numbers, the maximum and the minimum numbers.
* The sum and the average.
*/

public class ArrayManipulation {
    public static void main(String[] args) {
        //init Scanner
        Scanner in=new Scanner(System.in);
        
        int x=0; //assign a placeholder value to x to avoid compile error
        do{
            try{
                System.out.print("Enter a number between 10 and 20: "); //print question and store the entered number
                x=in.nextInt();
                while(x<10||x>20){ //when user's input is out of the 10-20 range
                    System.out.print("\nThe number must be between 10 and 20\nEnter a number between 10 and 20: ");
                    x=in.nextInt();
                }
            }catch(Exception e){ //when user's input is not an int
                System.out.println("\nInput must be an integer between 10 and 20");
                in.next();
            }
        }while(x<10||x>20);
        in.close();
        
        //create array with x elements
        int[] arr=new int[x];
        
        //print state of array before init
        System.out.println("\nState of array before intialization:");
        for(int i:arr)
            System.out.print(i+" ");
        
        //init array and print state
        for(int i=0;i<arr.length;i++)
            arr[i]=i;
        System.out.println("\nState of array after intialization:");
        for(int i:arr)
            System.out.print(i+" ");
        
        //change array elements to random int
        int min=0,max=200; //set range for random int
        for(int i=0;i<arr.length;i++){
            int randomInt=(int)Math.floor(Math.random()*(max-min+1)+min); //init a random int between 0 and 200
            arr[i]=randomInt; //set arr[i] value to the random int
        }
        
        //print state of array
        System.out.println("\nState of array random filling:");
        for(int i:arr)
            System.out.print(i+" ");
        
        //finding the odd numbers
        int[] oddPre=new int[x]; //create temporary array with length of x to store the odd numbers
        int count=0;
        for(int i:arr){
            if(i%2!=0){ //test every element to see if it's odd
                oddPre[count]=i; //set the value of oddPre[count] to the odd number
                count++; //increment count to prepare for the next odd number
            }
        }
        if(count!=0){
            int[] odd=new int[count]; //create array for the odd numbers
            System.arraycopy(oddPre, 0, odd, 0, count); //copy the odd numbers in oddPre to the newly created odd array in order to remove extra zeroes
            System.out.println("\nOdd numbers:");
            for (int i:odd)
                System.out.print(i+" ");
        }else //if count is still zero (no odd numbers found)
            System.out.println("There are no odd numbers");
        
        //finding sum
        int sum=0;
        for(int i:arr)
            sum+=i; //sum=sum+i
        System.out.println("\n\nThe sum is: "+sum);
        
        //finding average
        double avg=(double)sum/(double)x;
        System.out.println("The average is: "+avg);
        
        //finding max element
        int arrMax=0;
        for(int i:arr)
            arrMax=Math.max(arrMax, i);
        System.out.println("The max is: "+arrMax);
        
        //finding min element
        int arrMin=arrMax;
        for(int i:arr)
            arrMin=Math.min(arrMin, i);
        System.out.println("The min is: "+arrMin);
    }
}
