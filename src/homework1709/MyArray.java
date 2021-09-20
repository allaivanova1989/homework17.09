package homework1709;

import sun.security.util.ArrayUtil;

import java.util.Arrays;

public class MyArray {
    private int[] array;

    public MyArray(int[] array) {
        this.array = array;
    }
@Deprecated
    public void sortArrays () {
        Arrays.sort(array);
    }

    public int searchMax (){
        int max = Arrays.stream(array).max().getAsInt();
        return max;
    }

    public int searchElement(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

}