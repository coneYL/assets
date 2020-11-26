package com.cone.yang.assets.user;

import lombok.extern.slf4j.Slf4j;

import java.beans.beancontext.BeanContext;
import java.util.Arrays;
import java.util.List;

/**
 * @author YangLei
 * @version 1.0.0.1
 * @since 2020/11/24 14:26
 */
@Slf4j
public class BubbleSort {
    public static void main(String[] args) {
   /*     List<Integer> numList = Lists.newArrayList(12, 4, 15, 6);
        sort(numList);*/

        int[] numArry = {6,8,10,3,5, 2, 6,7, 4,6, 9};
        sort(numArry);
        sort4Speed(numArry);
    }


    public static List sort(List<Integer> numList) {
        log.info("sort number is [{}]", numList.size());
        int times = 0;
        for (int i = 0; i < numList.size() - 1; i++) {

            for (int j = 0; j < numList.size() - 1 - i; j++) {
                if (numList.get(j) > numList.get(j + 1)) {
                    int temp = numList.get(j);
                    numList.set(j, numList.get(j + 1));
                    numList.set(j + 1, temp);
                }
                times++;
            }
        }
        log.info("sorted list run times is [{}]", times);
        log.info("sorted list is [{}]", numList.toString());

        return numList;
    }


    public static int[] sort(int[] numArra) {
        int times = 0; //执行次数
        // 冒泡排序的循环次数，与数组大小有关，循环次数为元素个数-1
        for (int i = 0; i < numArra.length - 1; i++) {
            // 每次循环从头到上次循环的结尾，找出当次最大数，通过移动，置在末尾
            for (int j = 0; j < numArra.length - 1 - i; j++) {
                if (numArra[j] > numArra[j + 1]) {
                    swap(numArra, j, j + 1);
                }
                times++;
            }
        }
        log.info("sort number is [{}]", numArra.length);
        log.info("sorted list run times is [{}]", times);
        log.info("sorted list is [{}]", Arrays.toString(numArra));
        return numArra;
    }

    public static int[] sort4Speed(int[] numArra) {
        int times = 0; //执行次数
        boolean isSwap = false;// 是否执行了交换
        // 冒泡排序的循环次数，与数组大小有关，循环次数为元素个数-1
        for (int i = 0; i < numArra.length - 1; i++) {
            // 每次循环从头到上次循环的结尾，找出当次最大数，通过移动，置在末尾
            for (int j = 0; j < numArra.length - 1 - i; j++) {
                if (numArra[j] > numArra[j + 1]) {
                    swap(numArra, j, j + 1);
                    isSwap = true;
                }
                times++;
            }
            if(!isSwap) break; //本次循环没有执行交换，说明已经排序完成，可以跳过剩下的循环
        }
        log.info("sort number is [{}]", numArra.length);
        log.info("sorted list run times is [{}]", times);
        log.info("sorted list is [{}]", Arrays.toString(numArra));
        return numArra;
    }

    private static void swap(int[] numArra, int i, int j) {
        int temp = numArra[i];
        numArra[i] = numArra[j];
        numArra[j] = temp;
    }
}
