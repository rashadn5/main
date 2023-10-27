public class LinearEquation {
    private int x1, y1, x2, y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double calculateDistance() {
    return roundedToHundredth(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
}

    public String lineInfo() {
        int numerator = y2 - y1;
        int denominator = x2 - x1;

        if (denominator == 0) {
            return "x = " + x1;
        }

        int gcd = findGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        String slope = "";
        slope += numerator;
        if (denominator != 1) {
            slope = "/"+ denominator ;
        }
        slope += "x";
        if ()


        double yIntercept = y1 - (numerator * x1 / (double) denominator);

        String equation = "y = " + slope;

        if (yIntercept != 0) {
            equation += " + " + roundedToHundredth(yIntercept);
        }

        String info =  String.format("The two points: (%d, %d) and (%d, %d)\nEquation of the line: %s\nSlope: %s\nY-intercept: %.2f\nDistance between the points: %.2f",
                x1, y1, x2, y2, equation, slope, yIntercept, calculateDistance());
        return info;
    }

    public String findCoordinate(double xValue) {
        double yValue = (y2 - y1) / (double)(x2 - x1) * (xValue - x1) + y1;
        return String.format("(%.2f, %.2f)", roundedToHundredth(xValue), roundedToHundredth(yValue));
    }

    public int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public double roundedToHundredth(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}