/*
*  2019 
*/
package pattern.strategy;

/**
 * @author wangdan Date: 2019/3/5 Time: 20:15
 * @version $Id$
 */
public class Context {

    private IStrategy iStrategy;

    public Context(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }

    public void execute(){
        iStrategy.doSomeThing();
    }
}