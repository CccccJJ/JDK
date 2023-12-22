package v17.pattern_matching_switch;

public class PatternMatchingSwitch {

    public static void main(String[] args) {
        Object o = "Pattern Matching Switch";

        matching(o);
    }

    public static void matching(Object o) {
        switch (o) {
            case String string && string.length() > 5 -> System.out.println("String & Length > 5");
            case String string -> System.out.println("String");
            case Integer integer -> System.out.println("Integer");
            default -> System.out.println("not supported class type");
        }
    }
}
