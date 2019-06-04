package com.example.mylibrary.common;

/**
 * Created by myzcx on 2018/1/22.
 */

import java.util.TreeMap;

import okhttp3.FormBody;
import okhttp3.RequestBody;


/**
 * @author dell-pc
 */
public class Parameter extends TreeMap<String,String> {

    public Parameter add(String key, String value){
        put(key,value);
        return this;
    }

    public String toParameterString(){
        String result="";
        if (!entrySet().isEmpty()) {
            for (Entry<String, String> entry : entrySet()) {
                result = result + entry.getKey() + "=" + entry.getValue() + "&";
            }
            if (result.endsWith("&")) {
                result = result.substring(0, result.length() - 1);
            }
        }
        return result;
    }

    public RequestBody toOkHttpParameter(){
        RequestBody requestBody;

        FormBody.Builder builder = new FormBody.Builder();
        for (Entry<String, String> entry : entrySet()) {
            builder.add(entry.getKey()+"",entry.getValue()+"");
        }

        requestBody = builder.build();
        return requestBody;
    }
}