/**
 * <pre>
 * desc ：-Xss256k
 * author ：lizj
 * date ：2020-02-18 20:45
 * </pre>
 */
public class JavaVMStackSOF02 {
    private static int stackLength = 0;

    public static void test(){
        long unused01,unused11,unused21,unused31,unused41,unused51,unused61,unused71,unused81,unused91,
             unused02,unused12,unused22,unused32,unused42,unused52,unused62,unused72,unused82,unused92,
             unused03,unused13,unused23,unused33,unused43,unused53,unused63,unused73,unused83,unused93,
             unused04,unused14,unused24,unused34,unused44,unused54,unused64,unused74,unused84,unused94,
             unused05,unused15,unused25,unused35,unused45,unused55,unused65,unused75,unused85,unused95,
             unused06,unused16,unused26,unused36,unused46,unused56,unused66,unused76,unused86,unused96,
             unused07,unused17,unused27,unused37,unused47,unused57,unused67,unused77,unused87,unused97,
             unused08,unused18,unused28,unused38,unused48,unused58,unused68,unused78,unused88,unused98,
             unused09,unused19,unused29,unused39,unused49,unused59,unused69,unused79,unused89,unused99;
        stackLength++;
        test();
        unused01=unused11=unused21=unused31=unused41=unused51=unused61=unused71=unused81=unused91=
        unused02=unused12=unused22=unused32=unused42=unused52=unused62=unused72=unused82=unused92=
        unused03=unused13=unused23=unused33=unused43=unused53=unused63=unused73=unused83=unused93=
        unused04=unused14=unused24=unused34=unused44=unused54=unused64=unused74=unused84=unused94=
        unused05=unused15=unused25=unused35=unused45=unused55=unused65=unused75=unused85=unused95=
        unused06=unused16=unused26=unused36=unused46=unused56=unused66=unused76=unused86=unused96=
        unused07=unused17=unused27=unused37=unused47=unused57=unused67=unused77=unused87=unused97=
        unused08=unused18=unused28=unused38=unused48=unused58=unused68=unused78=unused88=unused98=
        unused09=unused19=unused29=unused39=unused49=unused59=unused69=unused79=unused89=unused99=0;

    }
    public static void main(String[] args) {
        JavaVMStackSOF02 stackSOF = new JavaVMStackSOF02();
        try {
            test();
        }catch (Throwable e){
            System.out.println("length:"+stackSOF.stackLength);
            throw e;
        }
    }
}
