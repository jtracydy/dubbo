/*
* Copyright (c) 2018 Qunar.com. All Rights Reserved.
*/
package proxy.testjavadynamic;

/**
 * @author wangdan Date: 2018/10/17 Time: 17:00
 * @version $Id$
 */
public class Mocha implements Coffee{

    @Override
    public CoffeeEntity name(Integer code) {

        CoffeeEntity entity = CoffeFactory.getCoffeeType().get(TypeEnum.getCodeByCode(code));
        return entity == null ? new CoffeeEntity() : entity;
    }
}