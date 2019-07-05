/*
*  2019 
*/
package arithematic.niuke.n2;

/**
 * @author wangdan Date: 2019/5/18 Time: 12:27
 * @version $Id$
 */
public class Demo12 {

    public static void main(String[] args) {
        int arr[] = {364, 637, 341, 406, 747, 995, 234, 971, 571,
                219, 993, 407, 416, 366, 315, 301, 601, 650, 418,
                355, 460, 505, 360, 965, 516, 648, 727, 667, 465,
                849, 455, 181, 486, 149, 588, 233, 144, 174, 557,
                67, 746, 550, 474, 162, 268, 142, 463, 221, 882,
                576, 604, 739, 288, 569, 256, 936, 275, 401, 497,
                82, 935, 983, 583, 523, 697, 478, 147, 795, 380,
                973, 958, 115, 773, 870, 259, 655, 446, 863, 735,
                784, 3, 671, 433, 630, 425, 930, 64, 266, 235, 187,
                284, 665, 874, 80, 45, 848, 38, 811, 267, 575};
        System.out.println(new Demo12().InversePairs(arr));
    }

    int cnt;

    public int InversePairs(int[] array) {
        cnt = 0;
        if (array != null)
            mergeSortUp2Down(array, 0, array.length - 1);
        return cnt;
    }

    /*
     * 归并排序(从上往下)
     */
    public void mergeSortUp2Down(int[] a, int start, int end) {
        if (start >= end)
            return;
        int mid = (start + end) >> 1;

        mergeSortUp2Down(a, start, mid);
        mergeSortUp2Down(a, mid + 1, end);

        merge(a, start, mid, end);
    }

    /*
     * 将一个数组中的两个相邻有序区间合并成一个
     */
    public void merge(int[] a, int start, int mid, int end) {
        int[] tmp = new int[end - start + 1];

        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {
            if (a[i] <= a[j])
                tmp[k++] = a[i++];
            else {
                tmp[k++] = a[j++];
                cnt += mid - i + 1;  // core code, calculate InversePairs............
            }
        }

        while (i <= mid)
            tmp[k++] = a[i++];
        while (j <= end)
            tmp[k++] = a[j++];
        for (k = 0; k < tmp.length; k++)
            a[start + k] = tmp[k];
    }
}