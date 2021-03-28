import com.mongodb.*;
import com.mongodb.client.*;
import java.net.UnknownHostException;
import org.bson.Document;
import javax.print.Doc;

public class DatabaseInterface {

    public static ConnectionString connString = new ConnectionString(
        "mongodb+srv://test-user-01:testPass01@mediform-cluster-1.t6zjg.mongodb.net/test?authSource=admin&replicaSet=atlas-2ds9so-shard-0&readPreference=primary&appname=MongoDB%20Compass&ssl=true"
        );
    public static MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connString)
        .retryWrites(true)
        .build();
    public static MongoClient mongoClient = MongoClients.create(settings);

    public static MongoDatabase database = mongoClient.getDatabase("MediForm");
    public static MongoCollection<Document> collectionUser = database.getCollection("user");
    public static MongoCollection<Document> collectionPatient = database.getCollection("patient");

    public static void main(String[] args) throws UnknownHostException{

    }

    public static void findUser(User user) {

    }

    public static void savePatient(Patient patient) {

    }

    public static void findPatient(){
        
    }
}
