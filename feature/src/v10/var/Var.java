package v10.var;

import java.io.Closeable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;

public class Var {
    public static void main(String[] args) {
        // case 1
        var a = 100;

        // case 2
        var listWithInterface = createListWithInterface(true);
    }

    public static <T extends List<E> & RandomAccess & Closeable & Serializable, E>
    T createListWithInterface(boolean flag) {
        if (flag) {
            return (T) new ArrayList<E>();
        }
        return (T) new CopyOnWriteArrayList<E>();
    }
}
