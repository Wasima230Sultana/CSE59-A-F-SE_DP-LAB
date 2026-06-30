

class Patient {

    private String patientName;
    private String nationalId;

    public Patient(String patientName, String nationalId) {
        this.patientName = patientName;
        this.nationalId = nationalId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getNationalId() {
        return nationalId;
    }
}

class IdValidator {

    public boolean validate(String nationalId) {
        return nationalId.length() == 10 || nationalId.length() == 17;
    }
}

class SMSService {

    public void sendConfarmation(Patient patient) {
        IdValidator validator = new IdValidator();

        if (validator.validate(patient.getNationalId())) {
            System.out.println("Sending MS to " + patient.getPatientName() + " : Registration successfully .");
        } else {
            System.out.println("Invalid National Id");
        }
    }
}

public class Main3 {

    public static void main(String[] args) {
        Patient patient = new Patient("Alice", "1234566");
        SMSService sms = new SMSService();
        sms.sendConfarmation((patient));
    }
}
