public class Main {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。
        System.out.printf("Hello and welcome!");

        System.out.println("v1.0, test add 2 int, add(1, 3) == " + add(1, 3));
        System.out.println("v1.0, test mul 2 int, mul(1, 3) == " + mul(1, 3));
        System.out.println("v1.0, test div 2 int, div(1, 3) == " + div(3, 1));
    }
}