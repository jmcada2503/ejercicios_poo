package clases;

public class Empleado {

    public String name;
    public double hour_value, num_hours;

    public Empleado(String name, double hour_value, double num_hours) {
        this.name = name;
        this.hour_value = hour_value;
        this.num_hours = num_hours;
    }

    public double salary() {
        return hour_value * num_hours;
    }

}
