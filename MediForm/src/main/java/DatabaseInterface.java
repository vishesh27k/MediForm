//test for paul

import com.mongodb.*;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.conversions.Bson;

import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;

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
        String id = patientUpdate.getPatientID();
        Bson filter = Filters.eq("patientID", id);
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