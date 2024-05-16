package allergyDetection.db.pojos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Doctor implements Serializable{
 
	 private static final long serialVersionUID = 8046264880783423216L;
	 private Integer id;
	 private String name;
	 private String surname;
	 private String username;
	 private List <Prescription> prescriptions ;
	 
	 
	 public Doctor () {
		 this.prescriptions = new ArrayList<Prescription>();
	
	 }
	 
	 public Doctor (String _name, String _surname) {
			this.name = _name;
			this.surname = _surname;
			}
	 
	 public Doctor (Integer _id, String _name, String _surname) {
		    this.id= _id;
			this.name = _name;
			this.surname = _surname;
			
			}
	 public Doctor (Integer _id, String _name, String _surname, String _username) {
		    this.id= _id;
			this.name = _name;
			this.surname = _surname;
			this.username=_username;
			
			}
	
	 public Doctor(String _name, String _surname,String _username) {
		    this.name = _name;
			this.surname = _surname;
			this.username=_username;
	}

	@Override
	 public int hashCode() {
			return Objects.hash(id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Doctor other = (Doctor) obj;
			return Objects.equals(id, other.id);
		}


		public Integer getId() {
			return id;
		}

		public void setId(Integer _id) {
			this.id = _id;
		}

		public String getName() {
			return name;
		}

		public void setName(String _name) {
			this.name = _name;
		}
		public String getSurname() {
			return surname;
		}
		
		public void setSurname(String _surname) {
			this.surname = _surname;
		}
		public String toString() {
			return "Doctor [id=" + id + ", name=" + name + ", surname=" + surname + "]";
		}

		public List <Prescription> getPrescriptions() {
			return prescriptions;
		}

		public void setPrescriptions(List <Prescription> prescriptions) {
			this.prescriptions = prescriptions;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

}
