package h3;

import java.util.Arrays;

public class H3_main {

    public static void main(String[] args) {
        int[] test = { 5, 36, 4, 7, 2, 1, -100, 0, -1, -54 , -100};
        System.out.println(Arrays.toString(mergeSort(test)));
    }

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        } else {
            int halbe = array.length / 2;
            int[] links = new int[halbe + (array.length % 2)];
            int[] rechts = new int[halbe];

            System.arraycopy(array, 0, links, 0, links.length);
            for (int i = 0; i < rechts.length; i++) {
                rechts[i] = array[i + halbe + (array.length % 2)];
            }

            links = mergeSort(links);
            rechts = mergeSort(rechts);

            return merge(links, rechts);
        }
    }

    public static int[] merge(int[] links, int[] rechts) {
        int[] neu = new int[links.length + rechts.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < links.length && j < rechts.length) {
            if (links[i] > rechts[j]) {
                neu[k] = rechts[j];
                j++;
            } else {
                neu[k] = links[i];
                i++;
            }
            k++;
        }
        while (i < links.length) {
            neu[k] = links[i];
            k++;
            i++;
        }
        while (j < rechts.length) {
            neu[k] = rechts[j];
            k++;
            j++;
        }
        return neu;
    }
}