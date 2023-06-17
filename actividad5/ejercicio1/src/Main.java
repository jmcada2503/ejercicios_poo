import school.Student;

public class Main {

    public static void main(String[] args) {

        double[] notas = {1,2,3,4,5};
        Student myStudent = new Student(notas);
        System.out.println(myStudent.toString());
        System.out.println("Mean -> "+myStudent.mean());
        System.out.println("Standard Deviation -> "+myStudent.sd());
        System.out.println("Minimum -> "+myStudent.min());
        System.out.println("Maximum -> "+myStudent.max());

    }

}
