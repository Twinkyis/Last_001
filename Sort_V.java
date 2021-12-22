package Last.Strategy;

import java.util.Arrays;

public class Sort_V implements Strategy{


    public void sort(int[] arr) {
        System.out.println("Sort V");
        System.out.println("do:\t" + Arrays.toString(arr));
                for (int barrier1=arr.length-1;barrier1>=0;barrier1--) {
                for (int i=0;i<barrier1;i++){
                    if(arr[i]>arr[i+1]);
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
          }
       }  System.out.println("posle:\t"+Arrays.toString(arr));

    }



    }

