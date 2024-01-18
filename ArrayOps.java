public class ArrayOps {
    public static void main(String[] args) {
        System.out.println(containsTheSameElements(new int[] { 3, -4, 1, 2, 5 }, new int[] { 1, 3, -4, 5 }));

    }

    public static int findMissingInt(int[] array) {
        int[] fullArray = new int[array.length + 1];

        for (int i = 0; i < fullArray.length; i++) {
            fullArray[i] = i;
        }

        int missingInteger = 0;

        for (int i = 0; i < fullArray.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (fullArray[i] == array[j]) {
                    break;
                } else if (j == (array.length - 1)) {
                    missingInteger = fullArray[i];
                }
            }
        }

        return missingInteger;

    }

    public static int secondMaxValue(int[] array) {
        int firstMax = Math.max(array[0], array[1]);
        int secondMax = Math.min(array[0], array[1]);
        for (int i = 2; i < array.length; i++) {

            if (array[i] >= firstMax) {
                secondMax = firstMax;
                firstMax = array[i];
            } else if ((array[i] > secondMax) && (array[i] <= firstMax)) {
                secondMax = array[i];
            }

        }

        return secondMax;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        boolean hasAppear = false;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    hasAppear = true;
                    break;
                } else {
                    hasAppear = false;
                }
            }
            if (hasAppear == false) {
                break;
            }

        }

        return hasAppear;

    }

    public static boolean isSorted(int[] array) {
        int maxToMin = 0;
        int minToMax = 0;
        boolean isOk = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                minToMax++;
            } else {
                maxToMin++;
            }

            if ((maxToMin == array.length - 1) || (minToMax == array.length - 1)) {
                isOk = true;
            } else {
                isOk = false;
            }

        }

        return isOk;

    }
}
