/*
*  2019 
*/
package arithematic.niuke.n1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangdan Date: 2019/3/25 Time: 23:04
 * @version $Id$
 */
public class Demo02 {

    public static void main(String[] args) {
        Demo02 d = new Demo02();
        System.out.println( d.method2(new StringBuffer(" as  dfa ")));

    }
    /**
     * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     * @param str
     * @return
     */

    public String replaceSpace(StringBuffer str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' '){
                list.add("%20");
            }else{
                list.add(str.charAt(i)+"");
            }
        }
        StringBuffer sb= new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    public String method2(StringBuffer str){
        int spacenum = 0;//spacenum为计算空格数
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                spacenum++;
            }
        }
        int indexold = str.length()-1; //indexold为为替换前的str下标
        int newlength = str.length() + spacenum*2;//计算空格转换成%20之后的str长度
        int indexnew = newlength-1;//indexold为为把空格替换为%20后的str下标
        str.setLength(newlength);//使str的长度扩大到转换成%20之后的长度,防止下标越界
        for(;indexold>=0 && indexold<newlength;--indexold){
            if(str.charAt(indexold) == ' '){  //
                str.setCharAt(indexnew--, '0');
                str.setCharAt(indexnew--, '2');
                str.setCharAt(indexnew--, '%');
            }else{
                str.setCharAt(indexnew--, str.charAt(indexold));
            }
        }
        return str.toString();
    }
}