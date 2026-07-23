package za.ac.cput.domain;




public class Receptionist {
    private int receptionistId;
    private String firstName;
    private String lastName;
    private String email;



    private Receptionist(){
    }
    private Receptionist(Builder builder){
        this.receptionistId = builder.receptionistId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
    }

    public int getReceptionistId(){
        return receptionistId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }

    public void scheduleAppointment(){
        throw new UnsupportedOperationException("Scheduling will be implemented in the service layer.");

    }

    @Override
    public String toString(){
        return "Receptionist{" +
                "receptionistId='" + receptionistId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                "}";
    }

    public static class Builder{
        private int receptionistId;
        private String firstName;
        private String lastName;
        private String email;

        public Builder setReceptionistId(int receptionistId) {
            this.receptionistId = receptionistId;
            return this;
        }
        public Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder copy(Receptionist receptionist){
            this.receptionistId = receptionist.receptionistId;
            this.firstName = receptionist.firstName;
            this.lastName = receptionist.lastName;
            this.email = receptionist.email;
            return this;
        }
        public Receptionist build(){
            return new Receptionist(this);
        }
    }

}
