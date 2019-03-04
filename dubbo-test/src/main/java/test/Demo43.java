/*
*  2019 
*/
package test;

import lombok.Data;

/**
 * @author wangdan Date: 2019/2/16 Time: 11:14
 * @version $Id$
 */
public class Demo43 {

    public static void main(String[] args) {
        Type t = new Type();
        System.out.println("s"+t.getS());
        System.out.println("b"+t.getB());
        System.out.println("i"+t.getI());
        System.out.println("l"+t.getL());
        System.out.println("f"+t.getF());
        System.out.println("d"+t.getD());
        System.out.println("c"+t.getC());
        System.out.println("t"+t.isT());

        System.out.println(".......");
        System.out.println(t.getSs());
        System.out.println(t.getBb());
        System.out.println(t.getIi());
        System.out.println(t.getLl());
        System.out.println(t.getFf());
        System.out.println(t.getDd());
        System.out.println(t.getCc());
        System.out.println(t.getTt());

        System.out.println("length.....");
        String str =  "我";
        char c [] = str.toCharArray();
        System.out.println(c.length);
    }
}

@Data
class Type{
    private short s;
    private Short ss;
    private Byte bb;
    private byte b;
    private int i;
    private Integer ii;
    private long l;
    private Long ll;
    private float f;
    private Float ff;
    private double d;
    private Double dd;
    private char c;
    private Character cc;
    private boolean t;
    private Boolean tt;
}