package com.dubbo.es.entity;


import com.dubbo.es.utils.EsConstants;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = EsConstants.StuIndex.STU_INDEX, type = EsConstants.StuIndex.STU_TYPE)
public class StuEntity {


    private int id;

    private String stu_name;
    private String stu_sex;
    private String stu_bir;
    private String stu_tel;
    private String stu_addr;
    private String stu_phone;

}
