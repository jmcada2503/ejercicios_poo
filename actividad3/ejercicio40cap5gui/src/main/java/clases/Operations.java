package clases;

public class Operations {

    public double[] values;

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public Operations(double[] values) {
        this.values = values;
    }

    public double[] squaredRoot() {
        double[] ans = new double[this.values.length];
        for (int i=0; i<this.values.length; i++) {
            ans[i] = Math.sqrt(this.values[i]);
        }
        return ans;
    }

    public double[] square() {
        double[] ans = new double[this.values.length];
        for (int i=0; i<this.values.length; i++) {
            ans[i] = Math.pow(this.values[i], 2);
        }
        return ans;
    }

    public double[] cube() {
        double[] ans = new double[this.values.length];
        for (int i=0; i<this.values.length; i++) {
            ans[i] = Math.pow(this.values[i], 3);
        }
        return ans;
    }

    public String getOperationString() {
        double[] squared_roots = this.squaredRoot();
        double[] squares = this.square();
        double[] cubes = this.cube();

        String ans = "";
        for (int i=0; i<this.values.length; i++) {
            ans += "Para: "+String.valueOf(round(this.values[i], 2))+"\n";
            ans += String.valueOf(round(this.values[i], 2))+"**(1/2) = "+String.valueOf(round(squared_roots[i], 2))+"\n"+String.valueOf(round(this.values[i], 2))+"**2 = "+String.valueOf(round(squares[i], 2))+"\n"+String.valueOf(round(this.values[i], 2))+"**3 = "+String.valueOf(round(cubes[i], 2))+"\n\n";
        }

        return ans;
    }

}
