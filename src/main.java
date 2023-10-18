public class main {

    public static void main(String[] args) {

        // Testing the addPatient Function
        database.PatientList.addPatient("Bob Joe","May 15, 2023");
        database.PatientList.addPatient("Basil Chang", "December 16, 2023" );

        int blankSpaces = 0;
        for(int i = 0; i<database.PatientList.patientList.length;i++){
            if(database.PatientList.patientList[i]==null){blankSpaces++;}
            else{
                System.out.println(database.PatientList.patientList[i]);
            }
        }
        System.out.println(blankSpaces + " Blank Spaces");

        // Testing Patient's toString method
        System.out.println(database.PatientList.patientList[2].toString());

    }

}
