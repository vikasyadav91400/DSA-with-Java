class Main01 {
    public static void main(String[] args) {
        int a = 19;
        int b = 20;
        int c = 15;

        String biggest = (a > b)
            ? ((a > c) ? "a" : "c")
            : ((b > c) ? "b" : "c");

        System.out.println(biggest + " is the biggest");
    }
}