import com.mongodb.*;
import com.mongodb.client.*;
import java.net.UnknownHostException;

import org.bson.Document;

import javax.print.Doc;

public class DatabaseInterface {
    ConnectionString connString = new ConnectionString(
        "mongodb+srv://test-user-01:*****@mediform-cluster-1.t6zjg.mongodb.net/test?authSource=admin&replicaSet=atlas-2ds9so-shard-0&readPreference=primary&appname=MongoDB%20Compass&ssl=true"
    );
    MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connString)
        .retryWrites(true)
        .build();
    MongoClient mongoClient = MongoClients.create(settings);

    MongoDatabase database = mongoClient.getDatabase("MediForm");
    MongoCollection<Document> dbCollection = database.getCollection("user");

    Document document = new Document("username", "test")
        .append("password", "testPass")
        .append("role", "nurse");

    dbCollection.insertOne(document);
}   
