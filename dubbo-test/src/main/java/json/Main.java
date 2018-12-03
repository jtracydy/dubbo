/*
* Copyright (c) 2018 Qunar.com. All Rights Reserved.
*/
package json;

/**
 * @author wangdan Date: 2018/10/23 Time: 12:41
 * @version $Id$
 */
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Student student = new Student();
        student.setRealName("zhangsan");
        System.out.println(new ObjectMapper().writeValueAsString(student));
    }
}