package com.cone.yang.assets.user;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @author YangLei
 * @version 1.0.0.1
 * @since 2020/11/24 14:26
 */
@Slf4j
public class FastSort {
    public static void main(String[] args) {

        int[] numArry = {6,8,10,3,5, 2, 6,7, 4,6, 9};
        numArry = sort(numArry,0,numArry.length-1);
        System.out.println(Arrays.toString(numArry));
        numArry = sort4Speed(numArry, 0, numArry.length - 1);
        System.out.println(Arrays.toString(numArry));
    }


    public static int[] sort(int[] numArry,int left,int right) {
        int times = 0; //执行次数

        if(left > right){
            return numArry;
        }
        int compareNum = numArry[left];
        int startIndex = left;
        int endIndex = right;

        while (left != right){
            while (numArry[right] > compareNum && left < right)
            {
                right--;
            }

            while (numArry[left] <= compareNum && left< right){
                left++;
            }

            if(left<right){
                int temp = numArry[left];
                numArry[left] = numArry[right];
                numArry[right] = temp;
            }

        }

        int temp = numArry[left];
        numArry[left] = compareNum;
        numArry[startIndex] = temp;

        sort(numArry,startIndex,left-1);
        sort(numArry,left+1,endIndex);
        return numArry;
    }

    public static int[] sort4Speed(int[] numArra,int left,int right) {
        if(left > right){
            return numArra;
        }
        int i,j,temp ;
        i = left;
        j = right;
        temp = numArra[left];

        while(i != j){
            while (numArra[j] >= temp && i<j){
                j--;
            }

            while (numArra[i] <= temp && i<j){
                i++;
            }

            if(i < j){
                int t = numArra[j];
                numArra[j] = numArra[i];
                numArra[i] = t;
            }
        }

        numArra[left] = numArra[i];
        numArra[i] = temp;

        sort4Speed(numArra,left,i-1);
        sort4Speed(numArra, i + 1, right);
        return numArra;
    }

    private static void swap(int[] numArra, int i, int j) {
        int temp = numArra[i];
        numArra[i] = numArra[j];
        numArra[j] = temp;
    }
}
