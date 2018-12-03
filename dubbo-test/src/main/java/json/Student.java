/*
* Copyright (c) 2018 Qunar.com. All Rights Reserved.
*/
package json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author wangdan Date: 2018/10/23 Time: 12:40
 * @version $Id$
 */
public class Student {

    @JsonProperty("real_name")
    private String realName;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "realName='" + realName + '\'' +
                '}';
    }
}