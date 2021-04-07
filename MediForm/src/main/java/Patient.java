<<<<<<< Updated upstream
import java.util.ArrayList;

public class Patient {

    //constructor to initiate every variable
    public Patient(String name, String address, int phone, String emergencyContactName, int emergencyContactNumber, boolean insurance, String insuranceProvider,
                   String insuranceID, String primaryPhysician, boolean currentMedication, ArrayList<String> medicationName, ArrayList<String> symptoms,
                   String dateOfBirth, String dateOfVisit, float height, float weight, float temperature, String bloodPressure, String pulseRate,
                   String assignedPhysician, boolean isAdmit, String content) {
=======
import java.util.Date;
import java.util.ArrayList;

public class Patient {
    //regForm variables
    public String name;
    public String address;
    public int phone;
    public String emergencyContactName;
    public int emergencyContactNumber;
    public String insuranceProvider;
    public String insuranceID;
    public String primaryPhysician;
    public String medicationName;
    public String medicalHistory;
    public String symptoms;
    public Date dateOfBirth;
    public Date dateOfVisit;

    // patient variable
    public String patientID;

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
    public ArrayList<String> notes = new ArrayList<String>();

    //medication variable
    public int pain;
    public int anticoagulant;
    public int antiretroviral;
    public int betaBlocker;
    public int insulin;
    public int antiInflammatory;
    public int ursodiol;
    public int calciumReducer;

    //test variable
    public Boolean nucleicAcid;
    public Boolean coagulationPanel;
    public Boolean dheaSulfateSerum;
    public Boolean cReactiveProtein;
    public Boolean alc;
    public Boolean xray;
    public Boolean ctScan;
    public Boolean mri;
    public Boolean urinalysis;
    public Boolean stoolCultures;

    //diagnosis variable
    public Boolean brokenBone;
    public Boolean heartAttack;
    public Boolean laceration;
    public Boolean hivAIDS;
    public Boolean liverFailure;
    public Boolean kidneyFailure;
    public Boolean diabetes;
    public Boolean infammatoryBowlDisease;
    public Boolean stroke;
    public Boolean tornMuscleTendon;

    public Patient() {
    }

    public Patient(Patient patientCopy) {
        this.name = patientCopy.getName();
        this.address = patientCopy.getAddress();
        this.phone = patientCopy.getPhone();
        this.emergencyContactName = patientCopy.getEmergencyContactName();
        this.emergencyContactNumber = patientCopy.getEmergencyContactNumber();
        this.insuranceProvider = patientCopy.getInsuranceProvider();
        this.insuranceID = patientCopy.getInsuranceID();
        this.primaryPhysician = patientCopy.getPrimaryPhysician();
        this.medicationName = patientCopy.getMedicationName();
        this.medicalHistory = patientCopy.getMedicalHistory();
        this.symptoms = patientCopy.getSymptoms();
        this.dateOfBirth = patientCopy.getDateOfBirth();
        this.dateOfVisit = patientCopy.getDateOfVisit();

        this.patientID = patientCopy.getPatientID();

        this.height = patientCopy.getHeight();
        this.weight = patientCopy.getWeight();
        this.temperature = patientCopy.getTemperature();
        this.bloodPressure = patientCopy.getBloodPressure();
        this.pulseRate = patientCopy.getPulseRate();
        this.assignedPhysician = patientCopy.getAssignedPhysician();
        this.isAdmit = patientCopy.getAdmit();

        this.content = patientCopy.getContent();

        this.pain = patientCopy.getPain();
        this.anticoagulant = patientCopy.getAnticoagulant();
        this.antiretroviral = patientCopy.getAntiretroviral();
        this.betaBlocker = patientCopy.getBetaBlocker();
        this.insulin = patientCopy.getInsulin();
        this.antiInflammatory = patientCopy.getAntiInflammatory();
        this.ursodiol = patientCopy.getUrsodiol();
        this.calciumReducer = patientCopy.getCalciumReducer();

        this.nucleicAcid = patientCopy.getNucleicAcid();
        this.coagulationPanel = patientCopy.getCoagulationPanel();
        this.dheaSulfateSerum = patientCopy.getDheaSulfateSerum();
        this.cReactiveProtein = patientCopy.getcReactiveProtein();
        this.alc = patientCopy.getAlc();
        this.xray = patientCopy.getXray();
        this.ctScan = patientCopy.getCtScan();
        this.mri = patientCopy.getMri();
        this.urinalysis = patientCopy.getUrinalysis();
        this.stoolCultures = patientCopy.getStoolCultures();

        this.brokenBone = patientCopy.getBrokenBone();
        this.heartAttack = patientCopy.getHeartAttack();
        this.laceration = patientCopy.getLaceration();
        this.hivAIDS = patientCopy.getHivAIDS();
        this.liverFailure = patientCopy.getLiverFailure();
        this.kidneyFailure = patientCopy.getKidneyFailure();
        this.diabetes = patientCopy.getDiabetes();
        this.infammatoryBowlDisease = patientCopy.getInfammatoryBowlDisease();
        this.stroke = patientCopy.getStroke();
        this.tornMuscleTendon = patientCopy.getTornMuscleTendon();
    }

    // constructor to initiate every in our regForm. Makes the patient object
    public patient(String name, String address, int phone, String emergencyContactName, int emergencyContactNumber, String insuranceProvider,
                   String insuranceID, String primaryPhysician, String medicationName, String medicalHistory, String symptoms, Date dateOfBirth, Date dateOfVisit) {
>>>>>>> Stashed changes
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactNumber = emergencyContactNumber;
        this.insuranceProvider = insuranceProvider;
        this.insuranceID = insuranceID;
        this.primaryPhysician = primaryPhysician;
        this.medicationName = medicationName;
        //this.medicalHistory = medicalHistory;
        this.symptoms = symptoms;
        this.dateOfBirth = dateOfBirth;
        this.dateOfVisit = dateOfVisit;
    }

<<<<<<< Updated upstream
        //this.patientID = generatePatientID;
=======
    // This is all the information after.
    public patient(String patientID, float height, float weight, float temperature, String bloodPressure, String pulseRate, String assignedPhysician, Boolean isAdmit,
                   String content, int pain, int anticoagulant, int antiretroviral, int betaBlocker, int insulin, int antiInflammatory, int ursodiol, int calciumReducer,
                   Boolean nucleicAcid, Boolean dheaSulfateSerum, Boolean cReactiveProtein, Boolean alc, Boolean xray, Boolean ctScan, Boolean mri, Boolean urinalysis,
                   Boolean stoolCultures, Boolean brokenBone, Boolean heartAttack, Boolean laceration, Boolean hivAIDS, Boolean liverFailure, Boolean kidneyFailure,
                   Boolean diabetes, Boolean infammatoryBowlDisease, Boolean stroke, Boolean tornMuscleTendon, Boolean coagulationPanel){
        this.patientID = patientID;
>>>>>>> Stashed changes

        this.height = height;
        this.weight = weight;
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.pulseRate = pulseRate;
        this.assignedPhysician = assignedPhysician;
        this.isAdmit = isAdmit;

        this.content = content;

<<<<<<< Updated upstream
       /* this.tests = tests;
        this.medications = medications;
        this.diagnosis = diagnosis;*/

    }

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
    ArrayList<Tests> tests = new ArrayList<Tests>();

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
    public ArrayList<Medications> medications = new ArrayList<Medications>();

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
    public ArrayList<Diagnosis> diagnosis= new ArrayList<Diagnosis>();

    //regForm variables
    public String name;
    public String address;
    public int phone;
    public String emergencyContactName;
    public int emergencyContactNumber;
    public boolean insurance;
    public String insuranceProvider;
    public String insuranceID;
    public String primaryPhysician;
    public boolean currentMedication;
    public ArrayList<String> medicationName = new ArrayList<String>();
    //public String[] medicalHistory;
    public ArrayList<String> symptoms = new ArrayList<String>();
    public String dateOfBirth;
    public String dateOfVisit;

    // patient variable
    public int patientID;

    //medForm variables
    public float height;
    public float weight;
    public float temperature;
    public String bloodPressure;
    public String pulseRate;
    public String assignedPhysician;
    public boolean isAdmit;

    //notes variable
    public String content;
=======
        this.pain = pain;
        this.anticoagulant = anticoagulant;
        this.antiretroviral = antiretroviral;
        this.betaBlocker = betaBlocker;
        this.insulin = insulin;
        this.antiInflammatory = antiInflammatory;
        this.ursodiol = ursodiol;
        this.calciumReducer = calciumReducer;

        this.nucleicAcid = nucleicAcid;
        this.coagulationPanel = coagulationPanel;
        this.dheaSulfateSerum = dheaSulfateSerum;
        this.cReactiveProtein = cReactiveProtein;
        this.alc = alc;
        this.xray = xray;
        this.ctScan = ctScan;
        this.mri = mri;
        this.urinalysis = urinalysis;
        this.stoolCultures = stoolCultures;

        this.brokenBone = brokenBone;
        this.heartAttack = heartAttack;
        this.laceration = laceration;
        this.hivAIDS = hivAIDS;
        this.liverFailure = liverFailure;
        this.kidneyFailure = kidneyFailure;
        this.diabetes = diabetes;
        this.infammatoryBowlDisease = infammatoryBowlDisease;
        this.stroke = stroke;
        this.tornMuscleTendon = tornMuscleTendon;
    }
>>>>>>> Stashed changes

    //regForm
    //get and set Address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

<<<<<<< Updated upstream
    //get and set currentMedication
    public boolean getCurrentMedication() {
        return currentMedication;
    }

    public void setCurrentMedication(boolean currentMedication) {
        this.currentMedication = currentMedication;
    }

    //get and set Insurance
    public Boolean getInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

=======
>>>>>>> Stashed changes
    //get and set DOB
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    //get and set DateOfVisit
    public String getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(String dateOfVisit) {
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
<<<<<<< Updated upstream
   /* public String[] getMedicalHistory() {
=======
    public String getMedicalHistory() {
>>>>>>> Stashed changes
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    //get and set medicationName
    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    //get and set symptoms
    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(Stringsymptoms) {
        this.symptoms = symptoms;
    }*/

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
    public boolean getAdmit() {
        return isAdmit;
    }

    public void setAdmit(boolean admit) {
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
/*
    //Tests
    //get and set tests
    public ArrayList<Tests> getTests() {
        return tests;
    }

    public void setTests(ArrayList<Tests> tests) {
        this.tests = tests;
    }

    //medications
    //get and set medications
    public ArrayList<Medications> getMedications() {
        return medications;
    }

    public void setMedications(ArrayList<Medications> medications) {
        this.medications = medications;
    }

    //diagnosis
    //get and set diagnosis
    public ArrayList<Diagnosis> getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(ArrayList<Diagnosis> diagnosis) {
        this.diagnosis = diagnosis;
    }*/

    //toString to check code
    public String toString(){
        return name + address + phone + emergencyContactName +
                emergencyContactNumber + insurance + insuranceProvider +
                insuranceID + primaryPhysician + currentMedication +
                medicationName + symptoms + dateOfBirth + dateOfVisit;
    }
}