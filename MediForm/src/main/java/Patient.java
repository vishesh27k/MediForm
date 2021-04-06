import java.util.Date;

import org.bson.types.ObjectId;

public class Patient {
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
    public Object patientID;

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
        patientID = new ObjectId();
    }

    public Patient(Patient patientCopy) {
        name = patientCopy.getName();
        address = patientCopy.getAddress();
        phone = patientCopy.getPhone();
        emergencyContactName = patientCopy.getEmergencyContactName();
        emergencyContactNumber = patientCopy.getEmergencyContactNumber();
        insurance = patientCopy.getInsurance();
        insuranceProvider = patientCopy.getInsuranceProvider();
        insuranceID = patientCopy.getInsuranceID();
        primaryPhysician = patientCopy.getPrimaryPhysician();
        currentMedication = patientCopy.getCurrentMedication();
        medicationName = patientCopy.getMedicationName();
        medicalHistory = patientCopy.getMedicalHistory();
        symptoms = patientCopy.getSymptoms();
        dateOfBirth = patientCopy.getDateOfBirth();
        dateOfVisit = patientCopy.getDateOfVisit();

        patientID = patientCopy.getPatientID();

        height = patientCopy.getHeight();
        weight = patientCopy.getWeight();
        temperature = patientCopy.getTemperature();
        bloodPressure = patientCopy.getBloodPressure();
        pulseRate = patientCopy.getPulseRate();
        assignedPhysician = patientCopy.getAssignedPhysician();
        isAdmit = patientCopy.getAdmit();

        content = patientCopy.getContent();

        pain = patientCopy.getPain();
        anticoagulant = patientCopy.getAnticoagulant();
        antiretroviral = patientCopy.getAntiretroviral();
        betaBlocker = patientCopy.getBetaBlocker();
        insulin = patientCopy.getInsulin();
        antiInflammatory = patientCopy.getAntiInflammatory();
        ursodiol = patientCopy.getUrsodiol();
        calciumReducer = patientCopy.getCalciumReducer();

        nucleicAcid = patientCopy.getNucleicAcid();
        coagulationPanel = patientCopy.getCoagulationPanel();
        dheaSulfateSerum = patientCopy.getDheaSulfateSerum();
        cReactiveProtein = patientCopy.getcReactiveProtein();
        alc = patientCopy.getAlc();
        xray = patientCopy.getXray();
        ctScan = patientCopy.getCtScan();
        mri = patientCopy.getMri();
        urinalysis = patientCopy.getUrinalysis();
        stoolCultures = patientCopy.getStoolCultures();

        brokenBone = patientCopy.getBrokenBone();
        heartAttack = patientCopy.getHeartAttack();
        laceration = patientCopy.getLaceration();
        hivAIDS = patientCopy.getHivAIDS();
        liverFailure = patientCopy.getLiverFailure();
        kidneyFailure = patientCopy.getKidneyFailure();
        diabetes = patientCopy.getDiabetes();
        infammatoryBowlDisease = patientCopy.getInfammatoryBowlDisease();
        stroke = patientCopy.getStroke();
        tornMuscleTendon = patientCopy.getTornMuscleTendon();
    }

    //constructor to initiate every variable
    public void RegForm(String name, String address, int phone, String emergencyContactName, int emergencyContactNumber, Boolean insurance, String insuranceProvider,
                   String insuranceID, String primaryPhysician, Boolean currentMedication, String[] medicationName, String[] medicalHistory, String[] symptoms,
                   Date dateOfBirth, Date dateOfVisit, float height, float weight, float temperature, String bloodPressure, String pulseRate,
                   String assignedPhysician, Boolean isAdmit, String content, int pain, int anticoagulant, int antiretroviral, int betaBlocker, int insulin, int antiInflammatory,
                   int ursodiol, int calciumReducer, Boolean nucleicAcid, Boolean dheaSulfateSerum, Boolean cReactiveProtein, Boolean alc, Boolean xray, Boolean ctScan,
                   Boolean mri, Boolean urinalysis, Boolean stoolCultures, Boolean brokenBone, Boolean heartAttack, Boolean laceration, Boolean hivAIDS, Boolean liverFailure,
                   Boolean kidneyFailure, Boolean diabetes, Boolean infammatoryBowlDisease, Boolean stroke, Boolean tornMuscleTendon, Boolean coagulationPanel) {
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

        patientID = new ObjectId();

        this.height = height;
        this.weight = weight;
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.pulseRate = pulseRate;
        this.assignedPhysician = assignedPhysician;
        this.isAdmit = isAdmit;

        this.content = content;

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
    public Object getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
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

    //medication
    //get and set pain
    public int getPain() {
        return pain;
    }

    public void setPain(int pain) {
        this.pain = pain;
    }

    //get and set anticoagulant
    public int getAnticoagulant() {
        return anticoagulant;
    }

    public void setAnticoagulant(int anticoagulant) {
        this.anticoagulant = anticoagulant;
    }

    //get and set antiretroviral
    public int getAntiretroviral() {
        return antiretroviral;
    }

    public void setAntiretroviral(int antiretroviral) {
        this.antiretroviral = antiretroviral;
    }

    //get and set betaBlocker
    public int getBetaBlocker() {
        return betaBlocker;
    }

    public void setBetaBlocker(int betaBlocker) {
        this.betaBlocker = betaBlocker;
    }

    //get and set insulin
    public int getInsulin() {
        return insulin;
    }

    public void setInsulin(int insulin) {
        this.insulin = insulin;
    }

    //get and set antiInflammartory
    public int getAntiInflammatory() {
        return antiInflammatory;
    }

    public void setAntiInflammatory(int antiInflammatory) {
        this.antiInflammatory = antiInflammatory;
    }

    //get and set ursodial
    public int getUrsodiol() {
        return ursodiol;
    }

    public void setUrsodiol(int ursodiol) {
        this.ursodiol = ursodiol;
    }

    //get and set calciumReducer
    public int getCalciumReducer() {
        return calciumReducer;
    }

    public void setCalciumReducer(int calciumReducer) {
        this.calciumReducer = calciumReducer;
    }

    //Test
    //get and set nucleicAcid
    public Boolean getNucleicAcid() {
        return nucleicAcid;
    }

    public void setNucleicAcid(Boolean nucleicAcid) {
        this.nucleicAcid = nucleicAcid;
    }

    //get and set coagulationPanel
    public Boolean getCoagulationPanel() {
        return coagulationPanel;
    }

    public void setCoagulationPanel(Boolean coagulationPanel) {
        this.coagulationPanel = coagulationPanel;
    }

    //get and set dheaSulfateSerum
    public Boolean getDheaSulfateSerum() {
        return dheaSulfateSerum;
    }

    public void setDheaSulfateSerum(Boolean dheaSulfateSerum) {
        this.dheaSulfateSerum = dheaSulfateSerum;
    }

    //get and set cReactiveProtein
    public Boolean getcReactiveProtein() {
        return cReactiveProtein;
    }

    public void setcReactiveProtein(Boolean cReactiveProtein) {
        this.cReactiveProtein = cReactiveProtein;
    }

    //get and set alc
    public Boolean getAlc() {
        return alc;
    }

    public void setAlc(Boolean alc) {
        this.alc = alc;
    }

    //get and set xray
    public Boolean getXray() {
        return xray;
    }

    public void setXray(Boolean xray) {
        this.xray = xray;
    }

    //get and set ctScan
    public Boolean getCtScan() {
        return ctScan;
    }

    public void setCtScan(Boolean ctScan) {
        this.ctScan = ctScan;
    }

    //get and set mri
    public Boolean getMri() {
        return mri;
    }

    public void setMri(Boolean mri) {
        this.mri = mri;
    }

    //get and set urinalysis
    public Boolean getUrinalysis() {
        return urinalysis;
    }

    public void setUrinalysis(Boolean urinalysis) {
        this.urinalysis = urinalysis;
    }

    //get and set stoolCultures
    public Boolean getStoolCultures() {
        return stoolCultures;
    }

    public void setStoolCultures(Boolean stoolCultures) {
        this.stoolCultures = stoolCultures;
    }

    //diagnosis
    //get and set brokenBone
    public Boolean getBrokenBone() {
        return brokenBone;
    }

    public void setBrokenBone(Boolean brokenBone) {
        this.brokenBone = brokenBone;
    }

    //get and set heartAttack
    public Boolean getHeartAttack() {
        return heartAttack;
    }

    public void setHeartAttack(Boolean heartAttack) {
        this.heartAttack = heartAttack;
    }

    //get and set laceration
    public Boolean getLaceration() {
        return laceration;
    }

    public void setLaceration(Boolean laceration) {
        this.laceration = laceration;
    }

    //get and set hivAIDS
    public Boolean getHivAIDS() {
        return hivAIDS;
    }

    public void setHivAIDS(Boolean hivAIDS) {
        this.hivAIDS = hivAIDS;
    }

    //get and set liverFailure
    public Boolean getLiverFailure() {
        return liverFailure;
    }

    public void setLiverFailure(Boolean liverFailure) {
        this.liverFailure = liverFailure;
    }

    //get and set kidneyFailure
    public Boolean getKidneyFailure() {
        return kidneyFailure;
    }

    public void setKidneyFailure(Boolean kidneyFailure) {
        this.kidneyFailure = kidneyFailure;
    }

    //get and set diabetes
    public Boolean getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Boolean diabetes) {
        this.diabetes = diabetes;
    }

    //get and set inflammatoryBowelDisease
    public Boolean getInfammatoryBowlDisease() {
        return infammatoryBowlDisease;
    }

    public void setInfammatoryBowlDisease(Boolean infammatoryBowlDisease) {
        this.infammatoryBowlDisease = infammatoryBowlDisease;
    }

    //get and set stroke
    public Boolean getStroke() {
        return stroke;
    }

    public void setStroke(Boolean stroke) {
        this.stroke = stroke;
    }

    //get and set tornMuscleTendon
    public Boolean getTornMuscleTendon() {
        return tornMuscleTendon;
    }

    public void setTornMuscleTendon(Boolean tornMuscleTendon) {
        this.tornMuscleTendon = tornMuscleTendon;
    }
}