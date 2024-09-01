import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Patient {
    private String patientId;
    private String name;
    private Date dateOfBirth;
    private String gender;

    public Patient(String patientId, String name, Date dateOfBirth, String gender) {
        this.patientId = patientId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }
}

class Appointment {
    private String appointmentId;
    private Date date;
    private String patientId;

    public Appointment(String appointmentId, Date date, String patientId) {
        this.appointmentId = appointmentId;
        this.date = date;
        this.patientId = patientId;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public Date getDate() {
        return date;
    }

    public String getPatientId() {
        return patientId;
    }
}

class Billing {
    private String patientId;
    private double amount;

    public Billing(String patientId, double amount) {
        this.patientId = patientId;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

class HospitalManagementSystem {
    private List<Patient> patients;
    private List<Appointment> appointments;

    public HospitalManagementSystem() {
        this.patients = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    public void scheduleAppointment(String patientId, Date date) {

        String appointmentId = "APPT" + (appointments.size() + 1);
        appointments.add(new Appointment(appointmentId, date, patientId));
        System.out.println("Appointment scheduled successfully.");
    }

    public void addPatient(String patientId, String name, Date dateOfBirth, String gender) {

        patients.add(new Patient(patientId, name, dateOfBirth, gender));
        System.out.println("Patient added successfully.");
    }

    public void generateBill(String patientId, double amount) {

        Billing billing = new Billing(patientId, amount);
        System.out.println("Bill generated successfully. Amount: " + billing.getAmount());
    }
}

public class HospitalManagementSystemDemo {
    public static void main(String[] args) {

        HospitalManagementSystem hospitalSystem = new HospitalManagementSystem();

        hospitalSystem.addPatient("BWU/BTA/22/148", "Saswata Das", new Date(), "Male");

        hospitalSystem.scheduleAppointment("BWU/BTA/22/148", new Date());

        hospitalSystem.generateBill("BWU/BTA/22/148", 150000.0);
    }
}