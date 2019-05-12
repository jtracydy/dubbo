/*
*  2019 
*/
package arithematic.niuke.n2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author wangdan Date: 2019/5/12 Time: 10:19
 * @version $Id$
 */
public class Demo07 {

    public static void main(String[] args) {
        System.out.println(new Demo07().Permutation("aab"));
    }

    public  ArrayList<String> Permutation(String str) {
        if (str == null || str.length() == 0) {
            return new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        f(str.toCharArray(), 0, arrayList);
        Collections.sort(arrayList);
        return arrayList;
    }

    public  void f(char c[], int index, ArrayList arrayList) {
        if (index >= c.length) {
            arrayList.add(new String(c));
            return;
        }
        for (int i = index; i < c.length; i++) {
            if (judge(c, index,i)) {
                continue;
            }
            swap(c, i, index);
            f(c, index + 1, arrayList);
            swap(c, index, i);
        }
    }

    /**
     * 判断当前元素在之前的元素中是否已经遍历过
     * @param c
     * @param index
     * @param j
     * @return
     */
    public  boolean judge(char c[], int index,int j) {
        for (int i = index; i < j; i++) {
            if (c[i] == c[j]) {
                return true;
            }
        }
        return false;
    }

    public  void swap(char c[], int from, int to) {
        if (from == to) {
            return;
        }
        char temp = c[from];
        c[from] = c[to];
        c[to] = temp;
    }
}