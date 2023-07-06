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
            while(count2>0){
                arr[i++]=1;
                count2--;
            }
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