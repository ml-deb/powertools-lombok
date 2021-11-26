import lombok.Data;

@Data
public class Foo {
    private int property;


    public static void main(String[] args) {
        new Foo().getProperty();
    }
}


