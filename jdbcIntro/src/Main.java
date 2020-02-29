import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;

        try {
            connection = helper.getConnection();
            System.out.println("Connected to mysql");
            String sql = "DELETE FROM city WHERE ID = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, 4088);
            int result = statement.executeUpdate();
            System.out.println(result + " Adet Data Silindi:");
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void updateData() {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;

        try {
            connection = helper.getConnection();
            System.out.println("Connected to mysql");
            String sql = "UPDATE city SET Population = ?, District = ? WHERE ID = ?";
            statement.setString(1,"Duzce");
            statement.setInt(2, 200000);
            statement.setInt(3, 4088);

            statement = connection.prepareStatement(sql);
            int result = statement.executeUpdate();
            System.out.println(result + " Adet Data Degisti:");
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void insertData() {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;

        try {
            connection = helper.getConnection();
            System.out.println("Connected to mysql");
            String sql = "INSERT INTO city(Name, CountryCode, District, Population) VALUES(?, ?, ?, ?)";
            statement = connection.prepareStatement(sql);

            statement.setString(1, "Duzce2");
            statement.setString(2, "TUR");
            statement.setString(3, "Turkey");
            statement.setInt(4, 70000);

            int result = statement.executeUpdate();
            System.out.println(result + " Adet Data Eklendi:");
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void selectDemo() {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet result;

        try {
            connection = helper.getConnection();
            System.out.println("Connected to mysql");
            statement = connection.createStatement();
            result = statement.executeQuery("SELECT Code, Name, Continent, Region FROM country");
            ArrayList<Country> countries = new ArrayList<Country>();
            while (result.next()) {
                countries.add(new Country(
                        result.getString("Code"),
                        result.getString("Name"),
                        result.getString("Continent"),
                        result.getString("Region")
                ));
            }
            System.out.println(countries.size());
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}