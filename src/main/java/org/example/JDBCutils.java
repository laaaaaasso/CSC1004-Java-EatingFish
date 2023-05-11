import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBCutils {
    static String url;
    static String name;
    static String password;

    static String driver;

    static {
        Properties properties = new Properties();
        InputStream inputStream = JDBCutils.class.getClassLoader().getResourceAsStream("JDBC.properties");
        try {
            properties.load(inputStream);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        url = properties.getProperty("url");
        name = properties.getProperty("name");
        password = properties.getProperty("password");
        driver = properties.getProperty("driver");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, name, password);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return connection;
    }

    static void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    static void commit(Connection connection) {
        try {
            connection.commit();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    static void rollback(Connection connection) {
        try {
            connection.rollback();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    static void closeStatement(Statement statement) {
        try {
            statement.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    static void closeResultSet(ResultSet resultSet) {
        try {
            resultSet.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    static public void closeResource(Statement statement, Connection connection) {
        closeStatement(statement);
        closeConnection(connection);
    }

    static public void closeResource(ResultSet resultSet, Statement statement, Connection connection) {
        closeResultSet(resultSet);
        closeStatement(statement);
        closeConnection(connection);
    }
}
