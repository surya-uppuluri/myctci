package Ch02.LinkedList.ch00.ArraysStrings;

public class MyStringBuilder {
    private static int hash;
    private static final char[] value = new char[]{'1','2','3'};
    public static void main(String args[]) {
        int h = hash;
        System.out.println("h: "+h);
        if (h == 0) {
            char[] val = value;
            for (int i = 0; i < value.length; i++) {
                System.out.println("i" + i);
                h = 31 * h + val[i];
                System.out.println(h);
            }
            hash = h;
        }
    }
}
