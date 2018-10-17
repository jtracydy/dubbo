package proxy.testjavadynamic;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * 咖啡 name 和code的关系
 */

public enum TypeEnum {

    LATTE(1,"拿铁"),
    MOCHA(2,"摩卡"),
    AMERICAN(3,"美式"),
    ;
    /**
     *可反向映射的Map
     */
    private static final BiMap<Integer,String> typeMap;

    static  {
        typeMap = HashBiMap.create();
        typeMap.put(TypeEnum.LATTE.code,TypeEnum.LATTE.name());
        typeMap.put(TypeEnum.MOCHA.code,TypeEnum.MOCHA.name());
        typeMap.put(TypeEnum.AMERICAN.code,TypeEnum.AMERICAN.name());
    }

    private Integer code;

    private String desc;

    TypeEnum(Integer code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode(){
       return  code;
    }

    public String getDesc(){
        return desc;
    }

    public static Integer getCodeByName(String name){
        return typeMap.inverse().get(name);
    }

    public static String getCodeByCode(Integer code){
        return typeMap.get(code);
    }

}
