package test.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;


@Interceptor
@Loggable
public class LoggingInterceptor2 {

	public LoggingInterceptor2() {
		// TODO Auto-generated constructor stub
	}
	
	
	@AroundInvoke
	public Object logMethod(InvocationContext ic) throws Exception{
		System.out.println("LOG Interceptor!");
    	return ic.proceed();
	}

	
	
	
}
