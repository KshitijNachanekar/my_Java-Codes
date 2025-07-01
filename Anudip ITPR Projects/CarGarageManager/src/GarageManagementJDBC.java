import java.sql.*;
import java.util.Scanner;

public class GarageManagementJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/garage_jdbc";
    private static final String USER = "root";
    private static final String PASSWORD = "root; // Replace with your MySQL password

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connected!");

            createTable(connection);
            Scanner sc = new Scanner(System.in);
            int ch;

            do {
                System.out.println("\n--------------------- GARAGE MENU ---------------------");
                System.out.println("1. Add Vehicle");
                System.out.println("2. View All Vehicles");
                System.out.println("3. Update Service Status");
                System.out.println("4. Remove Vehicle");
                System.out.println("5. Select Vehicle by ID");
                System.out.println("0. Exit");
                System.out.println("--------------------------------------------------------");
                System.out.print("Enter your choice: ");
                ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        System.out.print("Enter number of vehicles to add: ");
                        int n = sc.nextInt();
                        for (int i = 0; i < n; i++) {
                            System.out.print("Enter vehicle_id: ");
                            int vehicle_id = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter owner_name: ");
                            String owner_name = sc.nextLine();
                            System.out.print("Enter vehicle_model: ");
                            String vehicle_model = sc.nextLine();
                            System.out.print("Enter license_plate: ");
                            String license_plate = sc.nextLine();
                            System.out.print("Enter service_status: ");
                            String service_status = sc.nextLine();
                            insertVehicle(connection, vehicle_id, owner_name, vehicle_model, license_plate, service_status);
                        }
                        break;

                    case 2:
                        retrieveVehicles(connection);
                        break;

                    case 3:
                        System.out.print("Enter vehicle_id to update: ");
                        int update_id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter new service_status: ");
                        String new_status = sc.nextLine();
                        updateServiceStatus(connection, update_id, new_status);
                        break;

                    case 4:
                        System.out.print("Enter vehicle_id to remove: ");
                        int delete_id = sc.nextInt();
                        deleteVehicle(connection, delete_id);
                        break;

                    case 5:
                        System.out.print("Enter vehicle_id to view: ");
                        int search_id = sc.nextInt();
                        selectVehicleById(connection, search_id);
                        break;

                    case 0:
                        System.out.println("Exiting program...");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } while (ch != 0);

            connection.close();
            sc.close();
            System.out.println("Database connection closed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS vehicles (" +
                "vehicle_id INT PRIMARY KEY," +
                "owner_name VARCHAR(100)," +
                "vehicle_model VARCHAR(100)," +
                "license_plate VARCHAR(50) UNIQUE," +
                "service_status VARCHAR(50))";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table 'vehicles' created (if not exists).");
        }
    }

    private static void insertVehicle(Connection connection, int vehicle_id, String owner_name, String vehicle_model, String license_plate, String service_status) throws SQLException {
        String sql = "INSERT INTO vehicles (vehicle_id, owner_name, vehicle_model, license_plate, service_status) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, vehicle_id);
            pstmt.setString(2, owner_name);
            pstmt.setString(3, vehicle_model);
            pstmt.setString(4, license_plate);
            pstmt.setString(5, service_status);
            pstmt.executeUpdate();
            System.out.println("Inserted: " + vehicle_model + " (" + license_plate + ")");
        }
    }

    private static void retrieveVehicles(Connection connection) throws SQLException {
        String sql = "SELECT * FROM vehicles";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("Garage Vehicle Data:");
            while (rs.next()) {
                System.out.println("vehicle_id: " + rs.getInt("vehicle_id") +
                        ", Owner: " + rs.getString("owner_name") +
                        ", Model: " + rs.getString("vehicle_model") +
                        ", Plate: " + rs.getString("license_plate") +
                        ", Status: " + rs.getString("service_status"));
            }
        }
    }

    private static void updateServiceStatus(Connection connection, int vehicle_id, String new_status) throws SQLException {
        String sql = "UPDATE vehicles SET service_status = ? WHERE vehicle_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, new_status);
            pstmt.setInt(2, vehicle_id);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Updated service status for vehicle ID: " + vehicle_id);
            } else {
                System.out.println("Vehicle ID not found.");
            }
        }
    }

    private static void deleteVehicle(Connection connection, int vehicle_id) throws SQLException {
        String sql = "DELETE FROM vehicles WHERE vehicle_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, vehicle_id);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Deleted vehicle with ID: " + vehicle_id);
            } else {
                System.out.println("Vehicle ID not found.");
            }
        }
    }

    private static void selectVehicleById(Connection connection, int vehicle_id) throws SQLException {
        String sql = "SELECT * FROM vehicles WHERE vehicle_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, vehicle_id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Vehicle Details:");
                    System.out.println("vehicle_id: " + rs.getInt("vehicle_id") +
                            ", Owner: " + rs.getString("owner_name") +
                            ", Model: " + rs.getString("vehicle_model") +
                            ", Plate: " + rs.getString("license_plate") +
                            ", Status: " + rs.getString("service_status"));
                } else {
                    System.out.println("No vehicle found with ID: " + vehicle_id);
                }
            }
        }
    }
}
