package com.es.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

public class Demo01 {

    @Autowired(required=false)
    private ElasticsearchTemplate esTemplate;


}
