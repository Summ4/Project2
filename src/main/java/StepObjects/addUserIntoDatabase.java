package StepObjects;

import DatabaseConnection.dbConnection;
import io.qameta.allure.Step;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class addUserIntoDatabase extends dbConnection {

    static StringBuilder mail = new StringBuilder();

    @Step("Generate random Email")
    public String RandomEmail() {
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            char randomizedCharacter = (char) (rand.nextInt(26) + 'a');
            mail.append(randomizedCharacter);
        }
        for (int i = 0; i < 3; i++) {
            int randomizednumber = rand.nextInt(10);
            mail.append(randomizednumber);
        }
        return mail + "@gmail.com";

    }

    @Step("Prepared statement to update database")
    public static void DatabaseUpdate(String firstName, String lastName, String phone, String password, String address, StringBuilder email, String country, String state, String city, int zip) {

        String sql = """
                insert into [users].[dbo].[users]
                (firstName,lastName,phone,password,address,email,country,state,city,zip)
                values (?,?,?,?,?,?,?,?,?,?)""";

        try (Connection connect = getConnection();
             PreparedStatement pstmt = connect.prepareStatement(sql);
        ) {
            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setString(3, phone);
            pstmt.setString(4, password);
            pstmt.setString(5, address);
            pstmt.setString(6, String.valueOf(email));
            pstmt.setString(7, country);
            pstmt.setString(8, state);
            pstmt.setString(9, city);
            pstmt.setInt(10, zip);
            pstmt.executeUpdate();
            connect.commit();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    //    @Test
    @Step("Insert data to Database")
    public void insertToDatabase() {
        String firstName = "Daviti";
        String lastName = "Vardanidze";
        String phone = "5555555555";
        StringBuilder email = new StringBuilder(RandomEmail());
        String password = "paroli123";
        String address = "BadriShubladzis N100";
        String country = "Georgia";
        String state = "Imereti";
        String city = "Kutaisi";
        int zip = 4600;

        DatabaseUpdate(firstName, lastName, phone, password, address, email, country, state, city, zip);

    }

}
