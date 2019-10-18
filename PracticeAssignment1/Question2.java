class Question2 {
    public static void main(String[] args) {
        double n1 = 1.0;
        double n2 = 0.0;
        double nSum = 0.0;

        for (double i = 0.0; i < 4000000.0; i = n1 + n2) {
            if (i % 2.0 == 0.0) {
                nSum += i;
            }
            
            n2 = n1;
            n1 = i;
        }
        
        System.out.println((int)nSum);
    }
}