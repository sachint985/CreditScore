package com.creditscore.data;

import java.util.ArrayList;
import java.util.List;

import com.creditscore.model.Pan;

public class GetData {
	private static List<Pan> list;
	
	private GetData() {
		list = new ArrayList<Pan>();
		list.add(new Pan("abcd", 6));
		list.add(new Pan("def", 3));
		list.add(new Pan("das", 6));
		list.add(new Pan("asd", 2));
		list.add(new Pan("ase", 9));
	}
	
	public static List<Pan> getData(){
		if(list == null) {
			new GetData();
		}
		return list;
	}
}
