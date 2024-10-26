package singleton_object;

public class Connection {
    String host;
    String username;
    String password;
    Connection(String host,String username,String password){
        this.host = host;
        this.username = username;
        this.password = password;
    }

    public void query(String query){
        System.out.println("exect query "+ query);
    }
}