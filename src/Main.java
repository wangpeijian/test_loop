import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    //初始化10w长度
    private static List<Integer> ARRAY = new ArrayList<>(100000);

    static {
        for (Integer i = 0; i < 100000; i++) {
            ARRAY.add(i);
        }
    }

    public static void main(String[] args) {

        long sum1 = 0, sum2 = 0, sum3 = 0;

        for (int i = 0; i < 100; i++) {
            sum1 += loop1();
            sum2 += loop2();
            sum3 += loop3();
        }

        System.out.println("第一次" + (sum1 / 100));
        System.out.println("第二次" + (sum2 / 100));
        System.out.println("第三次" + (sum3 / 100));
    }

    private static long loop1() {
        List<String> array = new ArrayList<>();

        long time = new Date().getTime();
        for (Integer i = 0; i < ARRAY.size(); i++) {
            array.add(i + "");
        }
        return new Date().getTime() - time;
    }

    private static long loop2() {
        List<String> array = new ArrayList<>();

        long time = new Date().getTime();
        for (Integer i = 0; i < ARRAY.size(); i++) {
            array.add(i + "");
        }
        return new Date().getTime() - time;
    }

    private static long loop3() {
        List<String> array1 = new ArrayList<>();
        List<String> array2 = new ArrayList<>();

        long time = new Date().getTime();
        for (Integer i = 0; i < ARRAY.size(); i++) {
            array1.add(i + "");
            array2.add(i + "");
        }
        return new Date().getTime() - time;
    }

    class TestObj {

        char[] payload = new char[1024 * 1024 * 4];

    }
}
