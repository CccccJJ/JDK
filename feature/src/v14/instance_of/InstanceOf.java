package v14.instance_of;

public class InstanceOf {

    public static void main(String[] args) {
        Object obj = "instance of";

        instanceOf(obj);
    }

    public static void instanceOf(Object obj) {
        if (obj instanceof String string) {
            System.out.println(string.length());

        } else if (obj instanceof Integer integer) {
            System.out.println(integer.doubleValue());
        }
    }

}
