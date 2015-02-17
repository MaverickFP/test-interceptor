package test.ejb;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

import test.ejb.interfaccia.StatelessTargetEjbRemote;
import test.interceptor.LoggingInterceptor;

/**
 * Session Bean implementation class StatelessTargetEjb
 */
@Stateless(mappedName = "StatelessTargetEjb")
public class StatelessTargetEjb implements StatelessTargetEjbRemote {

    /**
     * Default constructor. 
     */
    public StatelessTargetEjb() {
        // TODO Auto-generated constructor stub
    }
    
    
    
    //lego un class interceptor ad un metodo di una classe
    @Interceptors(LoggingInterceptor.class)
    public void businessMethod(String s){
    	System.out.println("Business Method: " + s);
    }

}
