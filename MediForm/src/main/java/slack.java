
import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThirdPartyApiCall {
    public static void main(String[] args) {
        double latitude = 37.7749; // Example latitude valu
        double longitude = -122.4194; // Example longitude value
        double drivingLicence = -122.4194; // Example longitude value

        try {
            String apiUrl = "https://slack.com/endpoint?lat=" + latitude + "&lng=" + longitude;

            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String response;
                StringBuilder sb = new StringBuilder();
                while ((response = reader.readLine()) != null) {
                    sb.append(response);
                }
                reader.close();
                String apiResponse = sb.toString();

                // Process the API response
                System.out.println("API Response: " + apiResponse);
            } else {
                System.out.println("API Request failed with response code: " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
