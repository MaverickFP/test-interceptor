package test.ejb.interfaccia;

import javax.ejb.Remote;

@Remote
public interface StatelessTargetEjbRemote {
	
	public void businessMethod(String s);

}
