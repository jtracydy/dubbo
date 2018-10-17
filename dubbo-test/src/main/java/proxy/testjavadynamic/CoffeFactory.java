package proxy.testjavadynamic;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.Map;

public class CoffeFactory {

    private  static final Map<String,CoffeeEntity> coffeeType;

    static {
        coffeeType = Maps.newHashMap();

        /**
         * 拿铁
         */
        CoffeeEntity latte = new CoffeeEntity();
        latte.setName(TypeEnum.LATTE.name());
        CoffeeEntity.CoffeeParams c1 = latte.new CoffeeParams("15","tall");
        CoffeeEntity.CoffeeParams c2 = latte.new CoffeeParams("20","grande");
        CoffeeEntity.CoffeeParams c3 = latte.new CoffeeParams("25","venti");
        latte.setCoffeeParams(Lists.newArrayList(c1,c2,c3));
        coffeeType.put(TypeEnum.LATTE.name(),latte);

        /**
         * 摩卡
         */
        CoffeeEntity mocha = new CoffeeEntity();
        mocha.setName(TypeEnum.MOCHA.name());
        CoffeeEntity.CoffeeParams c4 = mocha.new CoffeeParams("16","tall");
        CoffeeEntity.CoffeeParams c5 = mocha.new CoffeeParams("21","grande");
        CoffeeEntity.CoffeeParams c6 = mocha.new CoffeeParams("26","venti");
        mocha.setCoffeeParams(Lists.newArrayList(c4,c5,c6));
        coffeeType.put(TypeEnum.MOCHA.name(),mocha);
        /**
         * 美式
         */
        CoffeeEntity american = new CoffeeEntity();
        american.setName(TypeEnum.AMERICAN.name());
        CoffeeEntity.CoffeeParams c7 = american.new CoffeeParams("18","tall");
        CoffeeEntity.CoffeeParams c8 = american.new CoffeeParams("23","grande");
        CoffeeEntity.CoffeeParams c9 = american.new CoffeeParams("28","venti");
        american.setCoffeeParams(Lists.newArrayList(c7,c8,c9));
        coffeeType.put(TypeEnum.AMERICAN.name(),american);

    }

    public static Map<String,CoffeeEntity> getCoffeeType(){
        return coffeeType;
    }

    public static void main(String[] args) {
        System.out.println(coffeeType);
    }
}
