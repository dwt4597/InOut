package com.biz.inout;

import java.util.*;

import com.biz.inout.service.*;

public class InoutExec01 {

	public static void main(String[] args) {
		List<InoutService> inoutList = new ArrayList();

		for (int i = 0; i < 3; i++) {

			InoutService inoutService = new InoutService();
			if (inoutService.makeInout() == false) {
				i--;
				continue;
			}
			System.out.println(inoutService.toString());
		}
	}
}