import javax.naming.InitialContext;
import javax.naming.NamingException;

import test.ejb.interfaccia.StatelessEjbInterBindRemote;
import test.ejb.interfaccia.StatelessEjbRemote;
import test.ejb.interfaccia.StatelessTargetEjbRemote;




public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InitialContext ic = new InitialContext();
			StatelessEjbRemote service = (StatelessEjbRemote) ic.lookup("StatelessEjb");
			service.sayHello("Francesco");
			
			StatelessTargetEjbRemote service2 = (StatelessTargetEjbRemote)ic.lookup("StatelessTargetEjb");
			service2.businessMethod("TargetEjb");
			
			StatelessEjbInterBindRemote service3 = (StatelessEjbInterBindRemote) ic.lookup("StatelessEjbInterBind");
			service3.saluta("Damiano Cunego");
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	

}