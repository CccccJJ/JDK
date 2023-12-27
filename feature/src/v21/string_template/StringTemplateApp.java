package v21.string_template;

import static java.lang.StringTemplate.RAW;
import static java.lang.StringTemplate.STR;

public class StringTemplateApp {

    public static void main(String[] args) {
        var name = "li";
        var message = "Greetings" + name + "!";

        // STR
        message = STR."Greetings \{name}.";

        // FMT
        message = STR."Greetings %-12s\{name}";

        // RAW
        StringTemplate st = RAW. "Greetings \{name}";
        STR.process(st);
    }
}
