public class patient {

    private String patientName;
//    private int patientUUID;
    private String patientDOB; //Patient Date of Birth

    public patient(String patientName, String patientDOB){
        this.patientName = patientName;
        this.patientDOB = patientDOB;
    }


    // Patient Name
    public void setName(String newName){
        patientName = newName;
    }
    public String getPatientName() {
        return patientName;
    }

    /* Patient UUID
    public void setPatientUUID(int newUUID) {
        patientUUID = newUUID;
    }
    public int getPatientUUID() {
        return patientUUID;
    } */

    //Patient Date of Birth
    public void setPatientDOB(String newDOB){
        patientDOB = newDOB;
    }
    public String getPatientDOB() {
        return patientDOB;
    }


    // Overriding toString
    public String toString(){
        return patientName+" "+patientDOB;
    }
}
