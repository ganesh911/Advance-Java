package one_to_many;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sim {
@Id
private int simId ;
private String sPName ;
private String type ;
public int getSimId() {
	return simId ;
}
public String getSPName() {
	return sPName ;
}
public String getType() {
	return type ;
}
public void setId(int id) {
	this.simId = simId ;
}
public void setSPName(String sPName) {
	this.sPName = sPName ;
}
public void setType(String type) {
	this.type = type ;
}
}
