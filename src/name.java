public class name {
    private String firstName, lastName;

    public name(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String fullName(){
        return toString(lastName, firstName);
    }

    public String toString(String lastName, String firstName) {
        return lastName + " " + firstName;
    }

    public boolean equals(){

        return false;
    }
}
