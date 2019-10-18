class Question3 {
    public static void main(String[] args) {
        double nSum = 0;
        double sumOfSquare = 0;
        double squareOfSum = 0;
        
        for (double n = 1.0; n <= 100.0; n++) {
            sumOfSquare += Math.pow(n, 2.0);
            
            nSum += n;
        }
        
        squareOfSum = Math.pow(nSum, 2.0);
        
        System.out.println((int)(squareOfSum - sumOfSquare));
    }
}