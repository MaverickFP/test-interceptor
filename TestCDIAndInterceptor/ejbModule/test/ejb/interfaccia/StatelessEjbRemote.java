package test.ejb.interfaccia;

import javax.ejb.Remote;

@Remote
public interface StatelessEjbRemote {

	public void sayHello(String s);
	
}
