package ua.com.codefire._07_interfaces;

public class SqliteConnector implements DBConnector{

    private String fileName; // null

    /**
     * Default constructor ('ctor' <- abbr)
     */
    public SqliteConnector(){
        this.fileName = "database.sqlite";
    }

    public SqliteConnector(String fileName) {
        this.fileName = fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void init() {
        System.out.println("Init Sqlite database driver...");
    }

    @Override
    public boolean connect() {
        System.out.printf("Open datafile jdbc:sqlite://%s\n", fileName);
        return true;
    }

    @Override
    public void disconnect() {
        System.out.println("Close datafile...");
    }
}
