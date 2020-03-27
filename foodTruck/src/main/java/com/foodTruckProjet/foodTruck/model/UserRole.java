package  com.foodTruckProjet.foodTruck.model;

import javax.annotation.Generated;



public class UserRole {
	
	private int id;
	
	
	
	private Role role;

	public UserRole() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Utilisateur getUser() {
		return utilisateur;
	}

	public void setUser(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
