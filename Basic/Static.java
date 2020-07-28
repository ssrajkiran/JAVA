public class Static {
    static int a = 0;

    Static() {
        a++;
        System.out.println(a);

    }

    public static void main(String[] args) {
        Static c1 = new Static();
        Static c2 = new Static();

    }
}