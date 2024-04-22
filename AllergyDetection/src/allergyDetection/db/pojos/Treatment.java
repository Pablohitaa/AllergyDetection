package allergyDetection.db.pojos;

import java.util.Objects;

public class Treatment {
	
	private Integer id;
	private String treatment_type;
	
	//CONSTRUCTOR WITHOUT PARAMETERS 
	public Treatment () {
	
	}
	
	public Treatment (Integer _id, String _treatment_type) {
		this.id=_id;
		this.treatment_type=_treatment_type;
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
		Treatment other = (Treatment) obj;
		return Objects.equals(id, other.id);
	}

	public Integer getId() {
	        return id;
	    }

	public void setId(Integer _id) {
	        this.id = _id;
	    }
	public String getTreatmentType() {
		 return treatment_type;
	 }
	 public void setTreatmentType(String _treatment_type) {
		 this.treatment_type= _treatment_type;
	 }
	 
	 public String toString() {
	    	return "Treatment [id=" + id + ", treatment type=" + treatment_type + "]";
	    }
	    

}