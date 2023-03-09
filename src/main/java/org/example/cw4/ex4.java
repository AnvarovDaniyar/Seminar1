package org.example.cw4;

public class ex4 {
    public static void main(String[] args) {
        System.out.println(isArraySymetrical(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1}));
    }

    public static boolean isArraySymetrical(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;

    }

}