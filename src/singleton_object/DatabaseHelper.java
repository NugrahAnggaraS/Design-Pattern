package singleton_object;


// file DatabaseHelper.java
public class DatabaseHelper {
    public static Connection connection;

    public static Connection setInstance(){
        if(connection == null){
            connection = new Connection("localhost","root", "root");
        }

        return connection;
    }
}
