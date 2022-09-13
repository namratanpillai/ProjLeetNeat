package com.leet.neat.Sort;

public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort=new BubbleSort();
        int[] arr=new int[]{2,5,3,1,0,4};
        System.out.println(bubbleSort.sortIt(arr));
    }

    int[] sortIt(int[] data){

        for(int i=0;i<data.length;i++){
            for(int j=0;j<(data.length-1)-i;j++){
                if(data[j]>data[j+1]){
                    int temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
            }
        }
        return data;
    }

}
