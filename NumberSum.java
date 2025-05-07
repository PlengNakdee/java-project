class Main {
    public static void main(String[] args) {
        int numbers = 100;
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= numbers; ++i) {
            if (i%2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        int result = evenSum - oddSum;

        System.out.print(result);
    }
}