/**
 * <pre>
 * desc ：-Xss128k
 * author ：lizj
 * date ：2020-02-18 20:45
 * </pre>
 */
public class JavaVMStackSOF01 {
    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }
    public static void main(String[] args) {
        JavaVMStackSOF01 stackSOF = new JavaVMStackSOF01();
        try {
            stackSOF.stackLeak();
        }catch (Throwable e){
            System.out.println("length:"+stackSOF.stackLength);
            throw e;
        }
    }
}
