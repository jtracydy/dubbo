/*
*  2019 
*/
package arithematic.sort;


/**
 * @author wangdan Date: 2019/3/20 Time: 17:18
 * @version $Id$
 */
public class Demo01 {

    public static void main(String[] args) {
        Demo01 d = new Demo01();
        int arr[] = {3, 1, 9, 5, 7, 6, 2, 8, 4, 3};
        //d.insertBubbling(arr);
        d.insertQuick(arr, 0, arr.length - 1);
        d.outConsole(arr);
    }

    public void insertBubbling(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int len = arr.length - i;
            for (int j = 0; j < len; j++) {
                if (j + 1 < len && arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void insertQuick(int arr[], int from, int to) {
        if (from >= to) {
            return;
        }
        int i = from;
        int j = to;
        int flag = arr[from];
        int index = from;
        while (i < j) {
            while (i < j && arr[j] >= flag) {
                j--;
            }
            if (flag > arr[j]) {
                arr[index] = arr[j];
                index = j;
            }

            while (i < j && arr[i] <= flag) {
                i++;
            }
            if (flag < arr[i]) {
                arr[index] = arr[i];
                index = i;
            }
        }
        arr[index] = flag;

        insertQuick(arr, from, j - 1);
        insertQuick(arr, j + 1, to);

    }

    private void outConsole(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}