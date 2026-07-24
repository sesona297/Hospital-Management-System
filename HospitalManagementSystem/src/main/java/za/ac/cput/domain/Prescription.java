package za.ac.cput.domain;

public class Prescription {

    private int prescriptionId;
    private String medication;
    private String dosage;
    private String instructions;


    private Prescription(Builder builder){
        this.prescriptionId = builder.prescriptionId;
        this.medication = builder.medication;
        this.dosage = builder.dosage;
        this.instructions = builder.instructions;
    }

    public int getPrescriptionId(){
        return prescriptionId;
    }
    public String getMedication(){
        return medication;
    }
    public String getDosage(){
        return dosage;
    }
    public String getInstructions(){
        return instructions;
    }

    public void updatePrescription(){
        throw new UnsupportedOperationException("Prescription updates will be implemented in the service layer.");
    }

    @Override
    public String toString(){
        return"Prescription{" +
                "prescriptionId=" + prescriptionId +
                ", medication='" + medication + '\'' +
                ", dosage='" + dosage + '\'' +
                ", instructions='" + instructions + '\'' +
                "}";
    }

    public static class Builder{

        private int prescriptionId;
        private String medication;
        private String dosage;
        private String instructions;


        public Builder setPrescriptionId(int prescriptionId){
            this.prescriptionId = prescriptionId;
            return this;
        }
        public Builder setMedication(String medication){
            this.medication = medication;
            return this;
        }
        public Builder setDosage(String dosage){
            this.dosage = dosage;
            return this;
        }

        public Builder setInstructions(String instructions){
            this.instructions = instructions;
            return this;
        }

        public Builder copy(Prescription prescription){
            this.prescriptionId = prescription.prescriptionId;
            this.medication = prescription.medication;
            this.dosage = prescription.dosage;
            this.instructions = prescription.instructions;
            return this;
        }

        public Prescription build(){
            return new Prescription(this);
        }
    }

}
