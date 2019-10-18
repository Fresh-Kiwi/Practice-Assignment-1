class Question1 {
    public static void main(String[] args) {
        double t = 0;
        for (double i = 0.0; i < 1000.0; i++) {
            if ((i % 3.0) == 0 || (i % 5.0) == 0) {
                t += i;
            }
        }
        System.out.println((int)t);
    }
}