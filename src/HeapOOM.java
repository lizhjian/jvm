import java.util.ArrayList;
import java.util.List;

/**
 * desc : -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @author lizj
 * @date 2020-02-18 18:48:25
 * @param
 * @return
 */
public class HeapOOM {

    static class MyObject{

    }

    public static void main(String[] args) {

        List<MyObject> list = new ArrayList<>();
        while (true){
            list.add(new MyObject());
        }

    }
}
