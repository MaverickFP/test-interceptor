package test.ejb.interfaccia;

import javax.ejb.Remote;

@Remote
public interface StatelessEjbInterBindRemote {
	
	public void saluta(String s);

}
