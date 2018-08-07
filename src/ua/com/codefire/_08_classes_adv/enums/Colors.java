package ua.com.codefire._08_classes_adv.enums;

public enum Colors {
    RED("255,0,0"), GREEN("00FF00"), BLUE("0000FF");

    private String code;

    private Colors(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
