package leetcode;

import java.util.Arrays;

public class Decode {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decode(new int[]{1, 2, 3}, 1)));
    }

    public static int[] decode(int[] encoded, int first) {
        int[] array = new int[encoded.length + 1];
        array[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            array[i + 1] = encoded[i] ^ array[i];
        }

        return array;
    }
}
