package com.dubbo.spr.annotation.dynamic;



public interface RepostoryOperate {

    @Insert(value = "select * from table where name=? and age=?")
    void insert(String name,String age);


    @Delete(value = "delete  from table where name=? and age=?")
    void delete(String name,String age);
}
