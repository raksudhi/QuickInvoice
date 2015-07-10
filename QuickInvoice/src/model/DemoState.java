package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DEMO_STATES database table.
 * 
 */
@Entity
@Table(name="DEMO_STATES", schema="TESTUSER")
@NamedQuery(name="DemoState.findAll", query="SELECT d FROM DemoState d")
public class DemoState implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(length=30)
	private String st;
	@Id
	@Column(name="STATE_NAME", length=30)
	private String stateName;

	public DemoState() {
	}

	public String getSt() {
		return this.st;
	}

	public void setSt(String st) {
		this.st = st;
	}

	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}