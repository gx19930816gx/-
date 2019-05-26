package com.epoint.proxy.text;

import java.util.ArrayList;
import java.util.List;

public class sorttext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[] arr = new Double[] { 0.00D, 1.00D, 3.00D, 1.11D, 0.22D };
		List<Double> arrList = new ArrayList<Double>();
		for (Double item : arr)
			arrList.add(item);
		arrList.sort(null);
		System.out.println(arrList);
		System.out.println("1.00在的位置是："+String.valueOf(arrList.indexOf(1.00D)));
	}

}
