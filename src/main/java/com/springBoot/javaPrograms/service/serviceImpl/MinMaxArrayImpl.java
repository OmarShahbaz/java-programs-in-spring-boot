package com.springBoot.javaPrograms.service.serviceImpl;

import com.springBoot.javaPrograms.service.MinMaxArray;
import org.springframework.stereotype.Service;

@Service
public class MinMaxArrayImpl implements MinMaxArray {

    @Override
    public int max() {
        int[] arr = {18,17,16,15,19};
        int max=0;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]>=arr[i+1]){
                if(max<=arr[i]){
                    max = arr[i];
                }
            }else{
                if(max<=arr[i+1]){
                    max = arr[i+1];
                }
            }
        }
        return max;
    }

    @Override
    public int min() {
        int[] arr = {12,9,30,40,5};
        int tempMin;
        int min=arr[0];
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]<=arr[i+1]) {
                tempMin = arr[i];
                if (min >= tempMin) {
                    min = tempMin;
                }
            }
            else{
                tempMin = arr[i+1];
                if(min>=tempMin){
                    min=tempMin;
                }
            }
        }
        return min;
    }


}
