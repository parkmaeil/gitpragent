public class Calculator {
    public int add(int a, int b) {
        System.out.println("더하기 시작"); // 불필요한 로그
        if (a == 10) return 0; // 이상한 버그 로직
        return a + b;
    }
}
