package one_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Mobile 
{
	@Id
	private int id ;
	private String bName ;
	private String ram ;
	@OneToMany
	private List<Sim> sim;
	
	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public List<Sim> getSim() {
		return sim;
	}

	public void setSim(List<Sim> sim) {
		this.sim = sim;
	}

	public int getId() {
		return id ;
	}
	
	public String getBName() {
		return bName ;
	}
	
	public String getRam() {
		return ram ;
	}
	
	public void setId(int id) {
		this.id = id ;
	}
	public void setName(String bName) {
		this.bName = bName ;
	}
	public void setRam(String ram) {
		this.ram = ram ;
	}
}
