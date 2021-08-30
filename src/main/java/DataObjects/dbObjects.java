package DataObjects;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static DatabaseConnection.dbConnection.getConnection;

public class dbObjects {

    private static String firstName;
    private static String lastName;
    private static String phone;
    private static StringBuilder email;
    private static String password;
    private static String address;
    private static String country;
    private static String state;
    private static String city;
    private static int zip;

    public dbObjects() {

    }

    public void getDBObjects() throws SQLException {
        Statement statement = getConnection().createStatement();
        ResultSet results = statement.executeQuery("select * from users.dbo.users order by id desc");
        results.next();
        firstName = results.getString("firstName");
        lastName = results.getString("lastName");
        phone = results.getString("phone");
        password = results.getString("password");
        address = results.getString("address");
        email = new StringBuilder(results.getString("email"));
        state = results.getString("state");
        country = results.getString("country");
        city = results.getString("city");
        zip = results.getInt("zip");
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static String getPhone() {
        return phone;
    }

    public static String getPassword() {
        return password;
    }

    public static String getAddress() {
        return address;
    }

    public static StringBuilder getEmail() {
        return email;
    }

    public static String getState() {
        return state;
    }

    public static String getCountry() {
        return country;
    }

    public static String getCity() {
        return city;
    }

    public static String getZip() {
        return String.valueOf(zip);
    }

}
