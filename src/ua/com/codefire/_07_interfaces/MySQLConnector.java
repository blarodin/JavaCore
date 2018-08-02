package ua.com.codefire._07_interfaces;

public class MySQLConnector implements DBConnector, Checkable{

    private String host; // null
    private String username; // null
    private String password; // null

    /**
     * Default constructor ('ctor' <- abbr)
     */
    public MySQLConnector(){
        this.host = "127.0.0.1";
        this.username = "root";
        this.password = "root";
    }

    public MySQLConnector(String host) {
        this();
        this.host = host;
    }

    public MySQLConnector(String host, String username, String password) {
        this.host = host;
        this.username = username;
        this.password = password;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void init() {
        System.out.println("Init MySql database driver...");
    }

    @Override
    public boolean connect() {
        // Connect with jdbc:mysql://username:password@host:port
        System.out.printf("Connected with jdbc:mysql://%s:%s@%s\n", username, password, host);
        return true;
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from MySql server...");
    }
}
