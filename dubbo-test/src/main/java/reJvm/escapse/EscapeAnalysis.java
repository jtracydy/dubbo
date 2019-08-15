/*
*  2019 
*/
package reJvm.escapse;

/**
 * @author wangdan Date: 2019/7/23 Time: 11:54
 * @version $Id$
 */
public class EscapeAnalysis {

    public static Object object;

    public void globalVariableEscape(){//全局变量赋值逃逸
        object =new Object();
    }

    public Object methodEscape(){  //方法返回值逃逸
        return new Object();
    }

    public void instancePassEscape(){ //实例引用发生逃逸
        this.speak(this);
    }

    public void speak(EscapeAnalysis escapeAnalysis){
        System.out.println("Escape Hello");
    }


    public StringBuffer createString(String ... values){
        StringBuffer stringBuffer = new StringBuffer();
        for (String string : values) {
            stringBuffer.append(string+",");
        }
        return stringBuffer;
    }

    public static void main(String[] args) {
        StringBuffer sb = new EscapeAnalysis().createString("Escape","Hello");
        System.out.println(sb.toString());
    }
}