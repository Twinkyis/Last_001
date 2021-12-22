package Last.Strategy;

import java.util.Arrays;

public class Sort_Z implements Strategy{


    public void sort(int[] arr) {
        System.out.println("Sort bubble");
        System.out.println("do:\t" + Arrays.toString(arr));
                for (int barrier=arr.length-1;barrier>=0;barrier--) {
                for (int i=0;i<barrier;i++){
                    if(arr[i]>arr[i+1]);
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
          }
       }  System.out.println("posle:\t"+Arrays.toString(arr));

    }



    }

