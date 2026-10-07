public class Recursion {
    static void printNum(int n){
        if (n == 0)
            return;
        System.out.print(n + " ");
        printNum(n - 1);

    }
    public static void main(String[] args){
        printNum(10);
    }
    
}
