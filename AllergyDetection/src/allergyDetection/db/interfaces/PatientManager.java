package allergyDetection.db.interfaces;

public interface PatientManager {
	
	public void addPatient();//Entre estos paréntesis hay que pasar Patient p (pues deberemos tener creado un  List< > de Patient).
	public void erasePatient();//?? --> Ponemos para eliminar a un paciente si ya no tiene alergia?
	public void searchPatient();//Método para buscar a un paciente en específico dentro de la base de datos.
	
	public void addAllergy();
	public void addSymptom();
	public void addPrescription();
	public void addTreatment(); //Tengo la duda de si añadirlo porque en el E-R diagram el treatment y el patient no están unidos directamente.
	
	

}
