import java.util.Date;

public class patient {

    //tests
    public enum Tests{
        NUCLEICACID,
        COAGULATIONSPANEL,
        CREACVTIVEPROTEIN,
        ALC,
        XRAY,
        CTSCAN,
        MRI,
        URINALYSIS,
        STOOLCULTURES
    }
   private ArrayList<Tests> tests = new ArrayList<Tests>();

    //medications
    public enum Medications{
        PAIN,
        ANTICOAGULANT,
        ANTIRETROVIRAL,
        BETABLOCKER,
        INSULIN,
        ANTIINFLAMMATORY,
        URSODIOL,
        CALCIUMREDUCER,
    }
    private ArrayList<Medicaions> medications = new ArrayList<Medications>();

    // //diagnosis
    public enum Diagnosis{
        BROKENBONE,
        HEARTATTACK,
        LACERATION,
        HIVAIDS,
        LIVERFAILURE,
        KIDNEYFAILURE,
        DIABETES,
        INFAMMATORYBOWLDISEASE,
        STROKE,
        TORNMUSCLETENDON,
    }
    private ArrayList<Diagnosis> diagnosis= new ArrayList<Diagnosis>;

    //regForm variables
    public String name;
    public String address;
    public int phone;
    public String emergencyContactName;
    public int emergencyContactNumber;
    public Boolean insurance;
    public String insuranceProvider;
    public String insuranceID;
    public String primaryPhysician;
    public Boolean currentMedication;
    public String[] medicationName;
    public String[] medicalHistory;
    public String[] symptoms;
    public Date dateOfBirth;
    public Date dateOfVisit;

    // patient variable
    public int patientID;

    //medForm variables
    public float height;
    public float weight;
    public float temperature;
    public String bloodPressure;
    public String pulseRate;
    public String assignedPhysician;
    public Boolean isAdmit;

    //notes variable
    public String content;

    //constructor to initiate every variable
    public Patient(String name, String address, int phone, String emergencyContactName, int emergencyContactNumber, Boolean insurance, String insuranceProvider,
                   String insuranceID, String primaryPhysician, Boolean currentMedication, String[] medicationName, String[] medicalHistory, String[] symptoms,
                   Date dateOfBirth, Date dateOfVisit, float height, float weight, float temperature, String bloodPressure, String pulseRate,
                   String assignedPhysician, Boolean isAdmit, String content, ArrayList<Tests> tests, ArrayList<Medications> medications, ArrayList<Diagnosis> diagnosis) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactNumber = emergencyContactNumber;
        this.insurance = insurance;
        this.insuranceProvider = insuranceProvider;
        this.insuranceID = insuranceID;
        this.primaryPhysician = primaryPhysician;
        this.currentMedication = currentMedication;
        this.medicationName = medicationName;
        this.medicalHistory = medicalHistory;
        this.symptoms = symptoms;
        this.dateOfBirth = dateOfBirth;
        this.dateOfVisit = dateOfVisit;

        //this.patientID = generatePatientID;

        this.height = height;
        this.weight = weight;
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.pulseRate = pulseRate;
        this.assignedPhysician = assignedPhysician;
        this.isAdmit = isAdmit;

        this.content = content;

        this.tests = tests;
        this.medications = medications;
        this.diagnosis = diagnosis;

    }

    //regForm
    //get and set Address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //get and set currentMedication
    public Boolean getCurrentMedication() {
        return currentMedication;
    }

    public void setCurrentMedication(Boolean currentMedication) {
        this.currentMedication = currentMedication;
    }

    //get and set Insurance
    public Boolean getInsurance() {
        return insurance;
    }

    public void setInsurance(Boolean insurance) {
        this.insurance = insurance;
    }

    //get and set DOB
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    //get and set DateOfVisit
    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    //Get and set EmergencyContactNumber
    public int getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public void setEmergencyContactNumber(int emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }

    //get and set Phone
    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    //get and set EmergencyContactName
    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    //get and set insuranceID
    public String getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(String insuranceID) {
        this.insuranceID = insuranceID;
    }

    //get and set insuranceProvider
    public String getInsuranceProvider() {
        return insuranceProvider;
    }

    public void setInsuranceProvider(String insuranceProvider) {
        this.insuranceProvider = insuranceProvider;
    }

    //get and set name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //get and set primary Physician
    public String getPrimaryPhysician() {
        return primaryPhysician;
    }

    public void setPrimaryPhysician(String primaryPhysician) {
        this.primaryPhysician = primaryPhysician;
    }

    //get and set medicalHistory
    public String[] getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String[] medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    //get and set medicationName
    public String[] getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String[] medicationName) {
        this.medicationName = medicationName;
    }

    //get and set symptoms
    public String[] getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String[] symptoms) {
        this.symptoms = symptoms;
    }

    //patient
    //get and set patientID
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    //medForm
    //get and set admit
    public Boolean getAdmit() {
        return isAdmit;
    }

    public void setAdmit(Boolean admit) {
        isAdmit = admit;
    }

    //get and set height
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    //get and set temperature
    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    //get and set weight
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    //get and set assignedPhysician
    public String getAssignedPhysician() {
        return assignedPhysician;
    }

    public void setAssignedPhysician(String assignedPhysician) {
        this.assignedPhysician = assignedPhysician;
    }

    //get and set bloodPressure
    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    //get and set pulseRate
    public String getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(String pulseRate) {
        this.pulseRate = pulseRate;
    }

    //notes
    //get and set content
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //Tests
    //get and set tests
    public ArrayList<Tests> getTests() {
        return tests;
    }

    public void setTests(ArrayList<Tests> tests) {
        this.tests = tests;
    }

    //medications
    //get and set medicaions
    public ArrayList<Medicaions> getMedications() {
        return medications;
    }

    public void setMedications(ArrayList<Medicaions> medications) {
        this.medications = medications;
    }

    //diagnosis
    //get and set diagnosis
    public ArrayList<Diagnosis> getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(ArrayList<Diagnosis> diagnosis) {
        this.diagnosis = diagnosis;
    }

    //toString to check code
    public String toString(){
        return "The medications are " + this.medications;
    }
}
