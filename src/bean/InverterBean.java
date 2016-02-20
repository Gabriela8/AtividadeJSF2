package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class InverterBean {
	
  private String campo1, campo2, aux;
  
  public InverterBean() {
	  
	  this.aux = " ";
	  this.campo1 = " ";
	  this.campo2 = " ";
  }

public String getCampo1() {
	return campo1;
}

public void setCampo1(String campo1) {
	this.campo1 = campo1;
}

public String getCampo2() {
	return campo2;
}

public void setCampo2(String campo2) {
	this.campo2 = campo2;
}

public String getAux() {
	return aux;
}

public void setAux(String aux) {
	this.aux = aux;
}

public String inversaoCampo(){
	
	aux = campo1;
	campo1 = campo2;
	campo2 = aux;
	
	return null;
}
}