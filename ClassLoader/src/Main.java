public class Main{

    public static void main(String[] args) throws Exception {

        Class cls = Class.forName("Main");
        ClassLoader cLoader = cls.getClassLoader();

        System.out.println(cLoader.getClass());
        System.out.println(cLoader.getParent());

        assert 1 == 2;

        cLoader.setDefaultAssertionStatus(true);
        cLoader.clearAssertionStatus();
    }
}