package test.interceptor;

import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LoggingInterceptor {

	public LoggingInterceptor() {
		// TODO Auto-generated constructor stub
	}
	
	@AroundConstruct
	private void init(InvocationContext ic) throws Exception{
		System.out.println("Costruttore");
		ic.proceed();
	}
	
	
	@AroundInvoke
    private Object logMethod(InvocationContext ic) throws Exception{
    	System.out.println("LOG2!");
    	return ic.proceed();
    }

}
