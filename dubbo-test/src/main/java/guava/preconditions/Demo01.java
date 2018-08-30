package guava.preconditions;

import com.google.common.base.Preconditions;

public class Demo01 {


    public static void main(String[] args) {
        /**
         * 该方法的expression 表达式结果如果为false，那么抛出异常`
         */
       // System.out.println("checkArgument ="+get6(-1));

        //System.out.println("checkArgument str="+get2(null));

       // System.out.println("checkElementIndex str="+get3(5));

       // System.out.println("checkNotNull str="+get4(""));


        System.out.println("checkPositionIndexes str="+get5(1,5));


    }

    public static int get1(int i){
        Preconditions.checkArgument( i > 0,"empty",i);
        return i*i;
    }

    public static int get6(int i){
        Preconditions.checkArgument( i > 0);
        return i*i;
    }

    public static String get2(String str){
        Preconditions.checkArgument(!str.isEmpty());
        return str;
    }
    public static int get3(int input){
        int[] data = {1,2,3,4,5};
        Preconditions.checkElementIndex(input,data.length,"Illegal Argument passed: Invalid index.");
        return input;
    }
    public static String get4(String str){
        Preconditions.checkNotNull(str,"Illegal Argument passed: First parameter is Null.");
        return str;
    }
    public static int get5(int start,int end){
        int arr [] = {1,2,3,4,5,6,7};
        Preconditions.checkPositionIndexes(start,end,arr.length);
        return start+end;
    }
    public static boolean get6(String str){
        Preconditions.checkState(str.isEmpty());
        return true;
    }
}
