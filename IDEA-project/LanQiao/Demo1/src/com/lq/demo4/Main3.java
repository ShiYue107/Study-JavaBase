package com.lq.demo4;

public class Main3 {
    //暴力法破解0(n²)
    static void findByForce(int[] arr){
        int maxSum=arr[0];
        for (int j = 0; j < arr.length; j++) {
            int sum=arr[j];
            int maxOfJ=sum;

            for (int i = j+1; i <arr.length; i++) {
                sum+=arr[i];
                if (sum > maxOfJ) {
                    maxOfJ=sum;
                }
            }
            if (maxOfJ>maxSum){
                maxSum=maxOfJ;
            }
        }
        System.out.println(maxSum);
    }

    //递推法0(n)
    static int findByDp(int[] arr){
        int sumJ=arr[0];
        int max=sumJ;
//        int left=0,right=0;
        for (int j = 1; j < arr.length; j++) {
            if (sumJ>=0){
                sumJ += arr[j];
            }else {
                sumJ=arr[j];
//                left=j;
            }
            if (sumJ>max){
                max=sumJ;
//                right=j;
            }
        }
//        System.out.println(max+",left="+left+",right="+right);
        return max;
    }

    public static void main(String[] args) {
        int[]arr={1,-2,3,5,-2,6,-1};
        findByForce(arr);
        findByDp(arr);
    }
}
