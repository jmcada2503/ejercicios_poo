package school;

public class Student {

    public double[] notas;

    public Student() {}

    public Student(double[] notas) {
        this.notas = notas;
    }

    public String toString() {
        String s = "Notas:\n";
        for (int i=0; i<this.notas.length; i++) {
            s = s + ("N"+(i+1)+": "+this.notas[i]+"\n");
        }
        return s;
    }

    public double mean() {
        double sum = 0;
        for (int i=0; i<this.notas.length; i++) {
            sum = sum + this.notas[i];
        }
        return (sum/this.notas.length);
    }

    public double sd() {
        double sd = 0;
        for (int i=0; i<this.notas.length; i++) {
            sd = sd + Math.pow((this.notas[i]-this.mean()), 2);
        }
        return Math.sqrt(sd/(this.notas.length-1));
    }

    public double min() {
        double min = this.notas[0];
        for (int i=1; i<this.notas.length; i++) {
            if (this.notas[i] < min) {
                min = this.notas[i];
            }
        }
        return min;
    }

    public double max() {
        double max = this.notas[0];
        for (int i=1; i<this.notas.length; i++) {
            if (this.notas[i] > max) {
                max = this.notas[i];
            }
        }
        return max;
    }

}
