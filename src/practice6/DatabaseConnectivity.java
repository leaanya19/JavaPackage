package practice6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectivity {

    public static void main(String[] args) throws SQLException {

        String username = "root";
        String passeword = "1234";
        String dbName = "peoplentech";

        String query = "select * from students;";


        //jdbc:mysql---driver name
        //localhost---host of the database
        //33067---port number of the db
        String url = "jdbc:mysql://localhost: 33067/"+dbName;

            }


        }



