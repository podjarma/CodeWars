package CodeWars.Kyu4.RangeExtraction;

import java.util.ArrayList;

class Solution {

    // TODO решить эту задачу позже с нуля
    public static String rangeExtraction(int[] arr) {
        String out = new String();
        String buff = "";
        ArrayList<Integer> range = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++){
            buff = "";
            System.out.println("Итерация: " + i + " Текущее число: " + arr[i]);
            if(arr[i] + 1 == arr[i+1]){
                System.out.println("        добавили в список: " + arr[i]);
                range.add(arr[i]);
            }
            else{
                if(!range.isEmpty()) {
                    buff = range.get(0) + "-" + range.get(range.size()-1);
                    System.out.println("            Выгружаем буфер: " + buff);
                }
                if(buff.isEmpty()){
                    out+=arr[i] + ", ";
                }
                else {
                    out += buff + ", " + arr[i]  + ", ";
                    range.clear();
                }
            }
        }
        return out;
    }


    public static void main(String[] args) {
        System.out.println(Solution.rangeExtraction(new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}));
    }
}
