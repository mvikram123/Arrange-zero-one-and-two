import java.util.*;

class ReArrangeZeroOne{
    public static void ReArrangeZeroOneTwo(int arr[],int n){
        int count1=0,count2=0,count3=0;

        //counting all zeros , ones, two
        for(int i=0; i<n; i++) {
            switch (arr[i]) {
                case 0:
                    count1++;
                    break;
                case 1:
                    count2++;
                    break;

                case 2:
                    count3++;
                    break;
            }
        }
            int i=0;//update the Array

            //store all the 0s in the begining
            while(count1>0){
                arr[i++]=0;
                count1--;
            }
        //sort all ones
            while(count2>0){
                arr[i++]=1;
                count2--;
            }
        //sort all twos
            while(count3>0){
                arr[i++]=2;
                count3--;
            }


        //sort the array element
        for(i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

}



public class Main
{
    public static void main(String[] args) {
        //	System.out.println("Hello World");
        int arr[]={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int n=arr.length;
        ReArrangeZeroOne.ReArrangeZeroOneTwo(arr,n);


    }
}


// another way
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int count0=0, count1=0,count2=0;
        for(int i=0; i<n; i++)
        {
            if(a[i]==0)count0++;
            else if(a[i]==1)count1++;
            else  count2++;
           
        }
        for(int i=0; i<count0; i++)
        {
            a[i]=0;
        }
         for(int i=count0; i<count0+count1; i++)
        {
            a[i]=1;
        }
         for(int i=count0+count1; i<n; i++)
        {
            a[i]=2;
        }
       
    }
}
