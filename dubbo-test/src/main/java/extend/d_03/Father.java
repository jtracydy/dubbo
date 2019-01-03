/*
*  2018 
*/
package extend.d_03;

/**
 * @author wangdan Date: 2018/12/17 Time: 19:48
 * @version $Id$
 */
public abstract class Father {

    private String name;

    public Father(){

    }

    protected Father(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    abstract String getAge();
}