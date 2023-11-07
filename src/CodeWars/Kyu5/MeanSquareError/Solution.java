package CodeWars.Kyu5.MeanSquareError;

public class Solution {
    public static double solution(int[] arr1, int[] arr2) {
        double result = 0;
        for(int i = 0; i < arr1.length; i++){
            result += Math.pow(Math.abs(arr1[i]) - Math.abs(arr2[i]), 2);
        }
        result = result/arr1.length;
        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {10, 20, 10, 2};
        int[] a2 = {10, 25, 5, -2};
        System.out.println(solution(a1, a2));
    }
}