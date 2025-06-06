import java.util.ArrayList;

public class Declaration {
    private  int key;
    private String value;

    public  Declaration(String value, int key){
        this.key=key;
        this.value=value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
