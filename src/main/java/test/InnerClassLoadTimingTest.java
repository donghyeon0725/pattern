package test;

public class InnerClassLoadTimingTest {
    private InnerClassLoadTimingTest() {

    }

    private static final String TEXT1 = "TEXT1";

    static {
        System.out.println(TEXT1);
    }

    private static class InnerClass {
        static {
            System.out.println("inner class load");
        }

        private static final InnerClassLoadTimingTest outerClass = new InnerClassLoadTimingTest();
    }

    public static InnerClassLoadTimingTest innerClassLoadTimingTest() {
        return InnerClass.outerClass;
    }

    public static void main(String[] args) {
        System.out.println("main");

        // TEXT1
        // main
    }



}
