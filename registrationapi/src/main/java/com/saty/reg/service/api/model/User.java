package com.saty.reg.service.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="USER_REG_TBL")
public class User {
	 	@Id
	    @GeneratedValue
	    private int id;
	    private String name;
	    private String email;
	    private int experience;
	    private String domain;
	    
	    
	    
		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}



		public int getExperience() {
			return experience;
		}



		public void setExperience(int experience) {
			this.experience = experience;
		}



		public String getDomain() {
			return domain;
		}



		public void setDomain(String domain) {
			this.domain = domain;
		}



		public String getName() {
			// TODO Auto-generated method stub
			return this.name;
		}
}
