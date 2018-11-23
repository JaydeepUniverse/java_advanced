package com;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class CustomInterceptor implements Interceptor{
    
    @Override
    public void destroy() {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void init() {
	// TODO Auto-generated method stub
	
    }

    @Override
    public String intercept(ActionInvocation arg0) throws Exception {
	ValueStack stack = arg0.getStack();
	String username = stack.findString("username");
	stack.set("username", username.toUpperCase());
	return arg0.invoke();
    }
    
}
