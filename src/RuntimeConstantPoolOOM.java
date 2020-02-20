import java.util.HashSet;
import java.util.Set;

/**
 * <pre>
 * desc ：运行时常量池溢出
 * author ：lizj
 * date ：2020-02-18 22:27
 * </pre>
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        short i = 0;
        while (true){
            set.add(String.valueOf(i++).intern());
        }
    }

}
