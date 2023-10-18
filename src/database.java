public class database {

    database Database = new database();

    static class PatientList {
        static patient[] patientList = new patient[1000];

        // Adding new Patients to the list with Name and DOB
        public static void addPatient(String patientName, String patientDOB){

            for(int i = 0; i < patientList.length; i++){

                if(patientList[i] == null){
                    patientList[i] = new patient(patientName,patientDOB);
                    return;
                }
            }
            return;
        }
    }

    /*
    static class EncounterList {
        encounter encounterList[] = new encounter[1000];
    }

    static class ObservationList {
        observation observationList[] = new observation[1000];
    }
    */

    /*
    private static boolean isSpace(Object[] array){
        for (Object element : array){
            if (element == null) {return true;}
        }
        return false;
    }
    */
}
