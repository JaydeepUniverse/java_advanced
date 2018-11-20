package com;

public class InterceptorAction {
    public String execute() {
	for(int i=0; i<10; i++) {
	    for(int j=0; j<10; j++) {
		System.out.println(j);
	    }
	    System.out.println(i);
	}
	System.out.println("Done!");
	return "interceptor_success";
    }
}
