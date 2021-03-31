import java.util.*;
import java.util.ArrayList;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String name, address, insuranceProvider, insuranceID, primaryPhysician, strInsurance,
                bloodPressure, pulseRate, assignedPhysician, emergencyContactName, strCurrentMedication, content, strAdmitted;
        int phone, emergencyContactNumber;
        float height, weight, temperature;
        boolean insurance;
        boolean isAdmitted;
        boolean currentMedication;
        String dateOfBirth, dateOfVisit;

        ArrayList<String> medicationName = new ArrayList<String>();
        ArrayList<String> symptoms = new ArrayList<String>();

        System.out.println("Patient Name: ");
        name = scan.nextLine();

        System.out.println("Address: ");
        address = scan.nextLine();

        System.out.println("Insurance Provider: ");
        insuranceProvider = scan.nextLine();

        System.out.println("InsuranceID: ");
        insuranceID = scan.nextLine();

        System.out.println("Primary Physician: ");
        primaryPhysician = scan.nextLine();

        System.out.println("Blood Pressure: ");
        bloodPressure = scan.nextLine();

        System.out.println("Pulse Rate: ");
        pulseRate = scan.nextLine();

        System.out.println("Assigned Physician: ");
        assignedPhysician = scan.nextLine();

        System.out.println("Notes: ");
        content = scan.nextLine();

        System.out.println("Phone Number: ");
        phone = scan.nextInt();

        System.out.println("Emergency Phone Number: ");
        emergencyContactNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Emergency Contact Name: ");
        emergencyContactName = scan.nextLine();

        System.out.println("Are you currently on medication: ");
        strCurrentMedication = scan.nextLine();

        System.out.println("height: ");
        height = scan.nextFloat();

        System.out.println("Weight: ");
        weight = scan.nextFloat();

        System.out.println("Temperature: ");
        temperature = scan.nextFloat();

        scan.nextLine();

        System.out.println("Were they Admitted: ");
        strAdmitted = scan.nextLine();

        System.out.println("Do you have insurance: ");
        strInsurance = scan.nextLine();

        if (strInsurance.equals("yes"))
            insurance = true;
        else
            insurance = false;

        if (strAdmitted.equals("yes"))
            isAdmitted = true;
        else
            isAdmitted = false;

        if (strCurrentMedication.equals("yes"))
            currentMedication = true;
        else
            currentMedication = false;

        if (currentMedication = true){
            String meds;
            System.out.println("List current Medications(separate by ', '): ");
            meds = scan.nextLine();
            for (String retval: meds.split(", ")){
                medicationName.add(retval);
            }
        }

        System.out.println("Enter Symptoms(separate by ', '): ");
        String sym = scan.nextLine();
        for(String retval: sym.split(", ")){
            symptoms.add(retval);
        }

        System.out.println("DOB: ");
        dateOfBirth = scan.nextLine();

        System.out.println("Date: ");
        dateOfVisit = scan.nextLine();

        Patient patient = new Patient(name, address, phone, emergencyContactName, emergencyContactNumber, insurance, insuranceProvider,
                insuranceID, primaryPhysician, currentMedication, medicationName, symptoms,
                dateOfBirth, dateOfVisit, height, weight, temperature, bloodPressure, pulseRate,
                assignedPhysician, isAdmitted, content);

        System.out.println(patient.toString());
    }
}