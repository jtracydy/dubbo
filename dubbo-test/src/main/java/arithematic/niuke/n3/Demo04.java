/*
*  2019 
*/
package arithematic.niuke.n3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wangdan Date: 2019/5/26 Time: 11:29
 * @version $Id$
 */
public class Demo04 {

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 6, 4};
        System.out.println(new Demo04().isContinuous(arr));
    }

    /**
     * “红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....LL不高兴了
     * ,他想了想,决定大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。
     * 上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”
     * 。LL决定去买体育彩票啦。 现在,要求你使用这幅牌模拟上面的过程
     * ,然后告诉我们LL的运气如何，
     * 如果牌能组成顺子就输出true，
     * 否则就输出false。为了方便起见,你可以认为大小王是0
     * <p>
     * <p>
     * 1 5个元素
     * 2 最大值最小值之差小于5
     * 3 除了0不能有重复的元素
     *
     * @param numbers
     * @return
     */
    public boolean isContinuous(int[] numbers) {
        if (numbers.length < 5) {
            return false;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                count++;
                continue;
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            set.add(numbers[i]);
        }
        if (count + set.size() < 5) {
            return false;
        }
        if (count <= 3 && max - min >= 5) {
            return false;
        }
        return true;
    }
}