import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * <pre>
 * desc ：直接内存溢出
 * author ：lizj
 * date ：2020-02-18 23:05
 * </pre>
 */
public class DirectMemoryOOM {
    private static final int _1MB = 1024*1024;

    public static void main(String[] args) throws Exception{
//        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
//        unsafeField.setAccessible(true);
//        Unsafe unsafe= (Unsafe)unsafeField.get(null);
//        int index = 0;
//        while (true){
//            unsafe.allocateMemory(_1MB);
//            System.out.println(index++);
//        }

    }

}

