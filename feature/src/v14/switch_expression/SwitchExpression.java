package v14.switch_expression;

public class SwitchExpression {
    public static void main(String[] args) {
        // case 1
        switch ("a") {
            case "a", "b", "c":
                System.out.println("a,b,c");
                break;
            case "e", "f", "g":
                System.out.println("e,f,g");
                break;
        }

        // case 2
        String value = switch ("a") {
            case "a", "b", "c" -> "a,b,c";
            case "e", "f", "g" -> {
                System.out.println("efg");
                yield "efg";
            }
            default -> "other";
        };
    }
}
