package test.ejb;

import javax.ejb.Stateless;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptors;
import javax.interceptor.InvocationContext;

import test.ejb.interfaccia.StatelessEjbRemote;
import test.interceptor.LoggingInterceptor;

/**
 * Session Bean implementation class StatelessEjb
 */
@Stateless(mappedName = "StatelessEjb")
public class StatelessEjb implements StatelessEjbRemote {

    /**
     * Default constructor. 
     */
    public StatelessEjb() {
        // TODO Auto-generated constructor stub
    }
    
    
   
    public void sayHello(String s){
    	System.out.println("Ciao " + s);
    }
    
    
    //target class interceptor (intercetto l'invocazione dei metodi di questa classe)
    @AroundInvoke
    private Object logMethod(InvocationContext ic) throws Exception{
    	System.out.println("LOG!");
    	return ic.proceed();
    }
   
    
    

}
