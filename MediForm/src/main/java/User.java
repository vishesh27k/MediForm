public class User {
    public String name;
    public String password;
    private double latitude = point.getLatitude();
   
    public User() {}

    public User(User userCopy) {
        this.name = userCopy.getName();
        this.username = userCopy.getUsername();
        this.password = userCopy.getPassword();
        this.roleID = userCopy.getRoleID();
    }

    public User(String name, String username, String password, int roleID) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.roleID = roleID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleID() {
        return roleID;
    }
    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }
}

import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThirdPartyApiCall {
    public static void main(String[] args) {
        double latitude = 37.7749; // Example latitude value
        double longitude = -122.4194; // Example longitude value

        try {
            String apiUrl = "https://api.thirdparty.com/endpoint?lat=" + latitude + "&lng=" + longitude;

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

