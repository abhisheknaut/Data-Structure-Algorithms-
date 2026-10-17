class Solution {
    public double[] convertTemperature(double celsius) {
        double [] num = new double[2];

        num[0] = celsius +273.15;
        num[1] = celsius*1.80 + 32.00;
        return num;
    }
}