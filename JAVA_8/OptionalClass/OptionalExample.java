package JAVA_8.OptionalClass;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
//        String str = null;
//        String str = "JAVA Programming";
        String str = new String("JAVA Programming");
//        String str = new String();
        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
        System.out.println(optional.orElse("No value present in this object"));

        Optional<String> nameOptional = getName();
        System.out.println("op is "+nameOptional.orElse("NULL"));
    }

    public static Optional<String> getName(){
        String name = "Adesh";
//        String name = null;
        return Optional.ofNullable(name);
    }
}
