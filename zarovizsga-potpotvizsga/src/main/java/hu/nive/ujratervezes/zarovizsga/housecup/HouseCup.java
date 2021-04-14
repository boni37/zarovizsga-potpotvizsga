package hu.nive.ujratervezes.zarovizsga.housecup;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;

public class HouseCup {

    private final MariaDbDataSource dataSource;

    public HouseCup(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public int getPointsOfHouse(String house) throws SQLException {
        int result = 0;
        try (Connection connection = dataSource.getConnection()) {
            String selectPoints = "select sum(points_earned) as Points from house_points where house_name=?";
            PreparedStatement stmt = connection.prepareStatement(selectPoints);
            stmt.setString(1, house);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = rs.getInt("Points");
            }
        }
        return result;
    }
}
