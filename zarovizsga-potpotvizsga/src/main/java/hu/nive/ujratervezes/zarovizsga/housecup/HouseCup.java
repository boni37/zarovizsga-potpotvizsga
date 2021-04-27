package hu.nive.ujratervezes.zarovizsga.housecup;

import org.flywaydb.core.internal.jdbc.Results;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class HouseCup {

    DataSource dataSource;

    public HouseCup(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public int getPointsOfHouse(String house) {
        int summ = 0;
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement("select sum(points_earned) as summ from house_points where house_name=?");
            statement.setString(1, house);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                summ = resultSet.getInt("summ");
            }
            return summ;
        } catch (SQLException throwables) {
            throw new IllegalStateException("Database unaccessable");
        }
    }
}
