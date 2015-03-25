package com.hyq.utils;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
//fastJson用法
public class JaonUtils {
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
	public static void main(String[] args) {
		List<Test> list=new ArrayList<Test>();
		Test test=new Test();
		list.add(test);
		test.setName("name");
		System.out.println(objToJson(list));
		System.out.println(jsonToList(objToJson(list), Test.class).get(0).getName());
		System.out.println(jsonToObj(objToJson(test), test.getClass()).getName());
	}
}
