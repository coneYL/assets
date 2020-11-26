package com.cone.yang.assets.user;

import lombok.extern.slf4j.Slf4j;
import sun.rmi.runtime.Log;

import java.util.Arrays;

/**
 * @author YangLei
 * @version 1.0.0.1
 * @since 2020/11/26 9:35
 */
@Slf4j
public class BarrelSort {
    public static void main(String[] args) {
        int[] numArry = {6,8,10,3,5, 2, 6,7, 4,6, 9};
        sort(numArry);
    }

    public static int[] sort(int[] arrayNum){
        int[] baseArray = new int[100];
        log.info(Arrays.toString(baseArray));
        for (int i = 0; i < arrayNum.length; i++) {
            int value = arrayNum[i];
            int times = baseArray[value] ;

            if(times == 0){
                times = 1;
            }else{
                times = times + 1;
            }
            baseArray[value] = times;
        }
        log.info(Arrays.toString(baseArray));

        int[] sortedArray = new int[arrayNum.length];
        int index = 0;
        for (int i = 0; i < baseArray.length; i++) {
            int times = baseArray[i];
            for (int j = 0; j < times; j++) {
                sortedArray[index] = i;
                index++;
            }
        }

        log.info(Arrays.toString(sortedArray));
        return arrayNum;
    }
}
