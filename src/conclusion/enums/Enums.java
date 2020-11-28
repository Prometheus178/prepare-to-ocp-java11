package conclusion.enums;

public enum  Enums {

    I("Я"),
    YOU("Ты");

    private final String value;

    Enums(String val){
        this.value = val;
    }

    public String getValue() {
        return value;
    }

}
