package JAVA_8.OptionalClass;

import java.util.Optional;

public class OptionalEExample {
    public static void main(String[] args) {
        String str = null;
//        String str = "JAVA Programming";
        Optional<String> optional =Optional.ofNullable(str);
        System.out.println(optional.isPresent());
//        System.out.println(optional.get());
        System.out.println(optional.orElse("No value present in this object"));
    }
}
