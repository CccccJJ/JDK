package mm.three;

import mm.two.TwoModule;

public class ThreeModule {
    public static void main(String[] args) {
        System.out.println("Three Modules!");

        TwoModule twoModule = new TwoModule();
        twoModule.sayHi();
    }
}
