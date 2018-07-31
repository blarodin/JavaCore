package ua.com.codefire._05_classes;

public class Contact {

    private String name;
    private String phone;
    private String email;

    /**
     * This method is DEPRECATED<br/>
     * Use new method 'setContactName'
     * @param name
     */
    @Deprecated
    public void setName(String name) {
        this.name = name;
    }

    public void setContactName(String name) {
        if(name == null || name.trim().isEmpty()) {
            name = "John Doe";
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
