package clases;

import java.util.Arrays;

public class NumberSeries {

    public double[] values;

    public NumberSeries(double[] values) {
        this.values = values;
    }

    public double[] getOrderedSeries() {
        double[] ans = Arrays.copyOf(this.values, this.values.length);

        for (int i=0; i<(ans.length-1); i++) {
            for (int j=0; j<ans.length; j++) {
                if (ans[j] > ans[j+1]) {
                    double aux = ans[j];
                    ans[j] = ans[j+1];
                    ans[j+1] = aux;
                }
            }
        }

        return ans;
    }

    public void orderSeries() {
        for (int i=0; i<this.values.length; i++) {
            for (int j=0; j<(this.values.length-1); j++) {
                if (this.values[j] > this.values[j+1]) {
                    double aux = this.values[j];
                    this.values[j] = this.values[j+1];
                    this.values[j+1] = aux;
                }
            }
        }
    }

    public String getCsvString() {
        String ans = "";

        for (int i=0; i<this.values.length; i++) {
            ans += String.valueOf(this.values[i])+",";
        }
        ans = ans.substring(0, ans.length()-1);

        return ans;
    }

}
