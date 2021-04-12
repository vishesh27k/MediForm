//test for paul

import com.mongodb.*;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;

import java.lang.reflect.Array;
import java.net.UnknownHostException;
import java.nio.file.WatchService;
import java.util.ArrayList;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.conversions.Bson;

import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static com.mongodb.MongoClientSettings.getDefaultCodecRegistry;

//import junit.framework.Test;

public class DatabaseInterface {

    public static ConnectionString connString = new ConnectionString(
        "mongodb+srv://test-user-01:testPass01@mediform-cluster-1.t6zjg.mongodb.net/test?authSource=admin&replicaSet=atlas-2ds9so-shard-0&readPreference=primary&appname=MongoDB%20Compass&ssl=true");

    public static CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
    public static CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
    public static MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connString)
        .codecRegistry(codecRegistry)
        .retryWrites(true)
        .build();
    public static MongoClient mongoClient = MongoClients.create(settings);
    public static MongoDatabase database = mongoClient.getDatabase("MediForm");
    public static MongoCollection<User> collectionUser = database.getCollection("user", User.class);
    public static MongoCollection<Patient> collectionPatient = database.getCollection("patient", Patient.class);

    /*public static void main(String[] args) throws UnknownHostException{
        User testUser = new User("testNamePOJO", "testUsernamePOJO", "testPassPOJO", 4);

        Object id = new ObjectId();
        String idString = id.toString();
        Patient testPatient = new Patient();
        testPatient.setName("testPatient");
        testPatient.setAddress("testAddress");
        testPatient.setPatientID(idString);

        collectionUser.insertOne(testUser);
        insertPatient(testPatient);
        User newUser = new User(findUser("testUsernamePOJO"));
        Patient newPatient = new Patient(findPatient(idString));

        System.out.println(newUser.getPassword());

        System.out.println(newPatient.getAddress());

        //collectionUser.insertOne(testDoc);
        //testUser = findUser("testUsername");

        //System.out.println(testUser.getUsername());

        /*ArrayList<String> testArray = new ArrayList<String>(1);
        testArray.add("This");
        testArray.add("Test");
        Document testArrayDoc = new Document("notes", testArray);
        collectionPatient.insertOne(testArrayDoc);
    }

    /*public static User findUser(String username) {
        User userReturn = new User();

        BasicDBObject whereUser = new BasicDBObject();
        whereUser.put("username", username);

        try (MongoCursor<Document> cursorUser = collectionUser.find(whereUser).iterator()) {
            while (cursorUser.hasNext()) {
                Document userBuild = new Document(cursorUser.next());
                
                userReturn.setName(userBuild.getString("name"));
                userReturn.setUsername(userBuild.getString("username"));
                userReturn.setPassword(userBuild.getString("password"));
                userReturn.setRoleID(userBuild.getInteger("role"));
            }
        }
        return userReturn;
    }*/

    /*public static void savePatient(Patient patient) {
        Document patientDocument = new Document("_id", new ObjectId());
        Document regForm = new Document();
        regForm.append("name", patient.getName())
            .append("address", patient.getAddress())
            .append("phone", patient.getPhone())
            .append("dateOfBirth", patient.getDateOfBirth())
            .append("emergencyContactName", patient.getEmergencyContactName())
            .append("emergencyContactNumber", patient.getEmergencyContactNumber())
            .append("insurance", patient.getInsurance())
            .append("insuranceProvider", patient.getInsuranceProvider())
            .append("insuranceID", patient.getInsuranceID())
            .append("primaryPhysician", patient.getPrimaryPhysician())
            .append("currentMedication", patient.getCurrentMedication())
            .append("medicationName", patient.getMedicationName())
            .append("medicalHistory", patient.getMedicalHistory())
            .append("symptoms", patient.getSymptoms())
            .append("dateOfVisit", patient.getDateOfVisit());

        Document medication = new Document();
        medication.append("pain", patient.getPain())
            .append("anticoagulant", patient.getAnticoagulant())
            .append("antiretroviral", patient.getAntiretroviral())
            .append("betaBlocker", patient.getBetaBlocker())
            .append("insulin", patient.getInsulin())
            .append("antiInflammatory", patient.getAntiInflammatory())
            .append("ursodiol", patient.getUrsodiol())
            .append("calciumReducer", patient.getCalciumReducer());

        Document test = new Document();
        test.append("nucleicAcid", patient.getNucleicAcid())
            .append("coagulationPanel", patient.getCoagulationPanel())
            .append("dheaSulfateSerum", patient.getDheaSulfateSerum())
            .append("cReactiveProtein", patient.getcReactiveProtein())
            .append("alc", patient.getAlc())
            .append("xray", patient.getXray())
            .append("ctScan", patient.getCtScan())
            .append("mri", patient.getMri())
            .append("urinalysis", patient.getUrinalysis())
            .append("stoolCultures", patient.getStoolCultures());

        Document diagnosis = new Document();
        diagnosis.append("brokenBone", patient.getBrokenBone())
            .append("heartAttack", patient.getHeartAttack())
            .append("laceration", patient.getLaceration())
            .append("hivAIDS", patient.getHivAIDS())
            .append("liverFailure", patient.getLiverFailure())
            .append("kidneyFailure", patient.getKidneyFailure())
            .append("diabetes", patient.getDiabetes())
            .append("IBD", patient.getInfammatoryBowlDisease())
            .append("stroke", patient.getStroke())
            .append("tornMuscleTendon", patient.getTornMuscleTendon());

        Document medForm = new Document();
        medForm.append("height", patient.getHeight())
            .append("weight", patient.getWeight())
            .append("temperature", patient.getTemperature())
            .append("bloodPressure", patient.getBloodPressure())
            .append("pulseRate", patient.getPulseRate())
            .append("assignedPhysician", patient.getAssignedPhysician())
            .append("isAdmit", patient.getAdmit())
            .append("medication", medication)
            .append("test", test)
            .append("diagnosis", diagnosis);

        Document notes = new Document("notes", patient.getNotes());

        patientDocument.append("patientID", patient.getPatientID());
        patientDocument.append("regForm", regForm);
        patientDocument.append("medForm", medForm);
        patientDocument.append("notes", notes);

        collectionPatient.insertOne(patientDocument);
    }

    public static Patient findPatient(int patientID){
        Patient patientReturn = new Patient();

        BasicDBObject wherePatient = new BasicDBObject();
        wherePatient.put("_id", patientID);

        try (MongoCursor<Document> cursorPatient = collectionUser.find(wherePatient).iterator()) {
            while (cursorPatient.hasNext()) {
                Document patientBuild = new Document(cursorPatient.next());

                patientReturn.setName(patientBuild.getString("name"));
                patientReturn.setAddress(patientBuild.getString("address"));
                patientReturn.setPhone(patientBuild.getInteger("phone"));
                patientReturn.setDateOfBirth(patientBuild.getDate("dateOfBirth"));
                patientReturn.setEmergencyContactName(patientBuild.getString("emergencyContactName"));
                patientReturn.setEmergencyContactNumber(patientBuild.getInteger("emergencyContactNumber"));
                patientReturn.setInsurance(patientBuild.getBoolean("insurance"));
                patientReturn.setInsuranceProvider(patientBuild.getString("insuranceProvider"));
                patientReturn.setInsuranceID(patientBuild.getString("insuranceID"));
                patientReturn.setPrimaryPhysician(patientBuild.getString("primaryPhysician"));
                patientReturn.setCurrentMedication(patientBuild.getBoolean("currrentMedication"));
                patientReturn.setMedicationName(patientBuild.getString("medicationName"));
                patientReturn.setMedicalHistory(patientBuild.getString("medicalHistory"));
                patientReturn.setSymptoms(patientBuild.getString("symptoms"));
                patientReturn.setDateOfVisit(patientBuild.getDate("dateOfVisit"));

                patientReturn.setPain(patientBuild.getInteger("pain"));
                patientReturn.setAnticoagulant(patientBuild.getInteger("anticoagulant"));
                patientReturn.setAntiretroviral(patientBuild.getInteger("antiretroviral"));
                patientReturn.setBetaBlocker(patientBuild.getInteger("betaBlocker"));
                patientReturn.setInsulin(patientBuild.getInteger("insulin"));
                patientReturn.setAntiInflammatory(patientBuild.getInteger("antiInflammatory"));
                patientReturn.setUrsodiol(patientBuild.getInteger("ursodiol"));
                patientReturn.setCalciumReducer(patientBuild.getInteger("calciumReducer"));

                patientReturn.setNucleicAcid(patientBuild.getBoolean("nucleicAcid"));
                patientReturn.setCoagulationPanel(patientBuild.getBoolean("coagulationPanel"));
                patientReturn.setDheaSulfateSerum(patientBuild.getBoolean("dheaSulfateSerum"));
                patientReturn.setcReactiveProtein(patientBuild.getBoolean("cReactiveProtein"));
                patientReturn.setAlc(patientBuild.getBoolean("alc"));
                patientReturn.setXray(patientBuild.getBoolean("xray"));
                patientReturn.setCtScan(patientBuild.getBoolean("ctScan"));
                patientReturn.setMri(patientBuild.getBoolean("mri"));
                patientReturn.setUrinalysis(patientBuild.getBoolean("urinalysis"));
                patientReturn.setStoolCultures(patientBuild.getBoolean("stoolCultures"));

                patientReturn.setBrokenBone(patientBuild.getBoolean("brokenBone"));
                patientReturn.setHeartAttack(patientBuild.getBoolean("heartAttack"));
                patientReturn.setLaceration(patientBuild.getBoolean("laceration"));
                patientReturn.setHivAIDS(patientBuild.getBoolean("hivAIDS"));
                patientReturn.setLiverFailure(patientBuild.getBoolean("liverFailure"));
                patientReturn.setKidneyFailure(patientBuild.getBoolean("kidneyFailure"));
                patientReturn.setDiabetes(patientBuild.getBoolean("diabetes"));
                patientReturn.setInfammatoryBowlDisease(patientBuild.getBoolean("IBD"));
                patientReturn.setStroke(patientBuild.getBoolean("stroke"));
                patientReturn.setTornMuscleTendon(patientBuild.getBoolean("tornMuscleTendon"));

                patientReturn.setHeight(patientBuild.getDouble("height"));
                patientReturn.setWeight(patientBuild.getDouble("weight"));
                patientReturn.setTemperature(patientBuild.getDouble("temperature"));
                patientReturn.setBloodPressure(patientBuild.getString("pulseRate"));
                patientReturn.setPulseRate(patientBuild.getString("pulseRate"));
                patientReturn.setAssignedPhysician(patientBuild.getString("assignedPhysician"));
                patientReturn.setAdmit(patientBuild.getBoolean("isAdmit"));
            }
        }
        return patientReturn;
    }*/

    public static void insertPatient(Patient patientInsert) {
        collectionPatient.insertOne(patientInsert);
    }

    public static Patient findPatient(String patientID) {  
        Patient patientReturn = new Patient();
        
        BasicDBObject wherePatient = new BasicDBObject();
        wherePatient.put("patientID", patientID);

        try (MongoCursor<Patient> cursorPatient = collectionPatient.find(wherePatient).iterator()) {
            while (cursorPatient.hasNext()) {
                patientReturn = cursorPatient.next();
            }
        }
        return patientReturn;
    }

    public static void updatePatient(Patient patientUpdate) {
        Bson filter = Filters.eq("patientID", patientUpdate.getPatientID());
        collectionPatient.replaceOne(filter, patientUpdate);
    }

    public static User findUser(String username) {
        User userReturn = new User();

        BasicDBObject whereUser = new BasicDBObject();
        whereUser.put("username", username);

        try (MongoCursor<User> cursorUser = collectionUser.find(whereUser).iterator()) {
            while (cursorUser.hasNext()) {
                userReturn = cursorUser.next();
            }
        }
        return userReturn;
    }
}