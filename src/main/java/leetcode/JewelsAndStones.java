package leetcode;

public class JewelsAndStones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int i = 0;
        String[] split1 = stones.split("");

        for (int j = 0; j < split1.length; j++) {
            if (jewels.contains(split1[j])) {
                i++;
            }

        }
        return i;
    }

    public static int numJewelsInStonesAnotherWay(String jewels, String stones) {
        int i = 0;
        StringBuilder str = new StringBuilder();
        str.append(jewels);

        for (char c : stones.toCharArray()) {
            if (str.toString().contains(String.valueOf(c))) {
                i++;
            }
        }
        return i;
    }
}
