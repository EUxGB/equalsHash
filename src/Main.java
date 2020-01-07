public class Main {

    public static void main(String[] args) {
        Auto mustang1 = new Auto("Mustang v10", 1954, 10000, Color.WHITE);
        Auto mustang2 = new Auto("Mustang v10", 1954, 10000, Color.RED);
        Auto mustang3 = new Auto("Mustang v2", 1944, 100230, Color.BLACK);
        Auto mustang4 = new Auto("Mustang x500", 1954, 10000, Color.RED);
        Auto mustang5 = new Auto("Mustang v10", 1954, 10000, Color.RED);
        if (mustang2.equals(mustang5)) {
            System.out.println("mustang2 and mustang5 true");
        }
        else System.out.println("false");

        if (mustang1.equals(mustang5)) {
            System.out.println("true");
        }
        else System.out.println("mustang1 and mustang5 false");
        int i = mustang4.hashCode();
        System.out.println(i);
        System.out.println("hashCode mustang2 = "+mustang2.hashCode());
        System.out.println("hashCode mustang5 = "+mustang5.hashCode());



    }
}