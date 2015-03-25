package com.hyq.utils;

import java.util.List;

import com.alibaba.fastjson.JSON;
//fastJson用法
public class JsonUtils {
	//json转实体
	public static <T> T jsonToObj(String json,Class<T> t){
		return JSON.parseObject(json,t);
	}
	//实体转json
	public static <T> String objToJson(T t){
		return JSON.toJSONString(t);
	}
	public static <T> List<T> jsonToList(String json,Class<T> className){
		return JSON.parseArray(json, className);
	}
}
