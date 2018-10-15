package test;

public class Demo14 {


    private static  String  FULL_SCALE= "%s%%的用户给出满分";

    private static  String  SCORE_SCALE= "高于%s%%同城%s星级酒店";

    public static void main(String[] args) {




        System.out.println(String.format(FULL_SCALE,100));


        System.out.println(String.format(SCORE_SCALE,22,2));
    }
}
