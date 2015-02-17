package test.ejb.interfaccia;

import javax.ejb.Stateless;

import test.interceptor.Loggable;

/**
 * Session Bean implementation class StatelessEjbInterBind
 */
@Stateless(mappedName = "StatelessEjbInterBind")
public class StatelessEjbInterBind implements StatelessEjbInterBindRemote {

    /**
     * Default constructor. 
     */
    public StatelessEjbInterBind() {
        // TODO Auto-generated constructor stub
    }
    
    
    @Loggable
    public void saluta(String s){
    	System.out.println("Buongiorno " + s);
    }

}
