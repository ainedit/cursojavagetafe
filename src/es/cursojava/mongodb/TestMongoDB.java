package es.cursojava.mongodb;

import org.bson.Document;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.ListCollectionNamesIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class TestMongoDB {

	public static void main(String[] args) {
		String connectionString = "mongodb+srv://joseluisllorente_db_user:iIqI1dAQ3fI3xLtD@cluster0.of5jl3x.mongodb.net/?appName=Cluster0";
		
		ServerApi serverApi = ServerApi.builder().version(ServerApiVersion.V1).build();
		MongoClientSettings settings = MongoClientSettings.builder()
				.applyConnectionString(new ConnectionString(connectionString)).serverApi(serverApi).build();
		
		// Create a new client and connect to the server
		System.out.println("Connecting to MongoDB...");
		try (MongoClient mongoClient = MongoClients.create(settings)) {
			System.out.println("Connected to MongoDB.");
			try {
				// Send a ping to confirm a successful connection
				MongoDatabase database = mongoClient.getDatabase("getafemongodb");
				ListCollectionNamesIterable listCollections =  database.listCollectionNames();
				for (String string : listCollections) {
					System.out.println("Collection: " + string);
				}
				
				
				//{"nombre": "Juan", "apellido": "Pérez"}
				Document doc1 = new Document();
				doc1.append("nombre", "Juan");
				doc1.append("apellido", "Pérez");
				
				database.getCollection("personas").insertOne(doc1);
				
				
			} catch (MongoException e) {
				e.printStackTrace();
			}
		}

	}

}
