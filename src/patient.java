public class patient {

    private String patientName;
    private int patientAge;
    private String patientDOB; //Patient Date of Birth

    // Patient Name
    public void setName(String newName){
        patientName = newName;
    }
    public String getPatientName() {
        return patientName;
    }

    // Patient Age
    public void setPatientAge(int newAge) {
        patientAge = newAge;
    }
    public int getPatientAge() {
        return patientAge;
    }

    //Patient Date of Birth
    public void setPatientDOB(String newDOB){
        patientDOB = newDOB;
    }
    public String getPatientDOB() {
        return patientDOB;
    }


    public void add(String patientName){

    }

    // Overriding toString
    public String toString(){
        return patientName + " " + patientAge;
    }
}
