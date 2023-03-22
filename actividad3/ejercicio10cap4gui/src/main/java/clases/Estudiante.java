package clases;

public class Estudiante {

        public String num_inscripcion, nombre;
        public double patrimonio;
        public int estrato;

        public Estudiante(String num_inscripcion, String nombre, double patrimonio, int estrato) {
            this.num_inscripcion = num_inscripcion;
            this.nombre = nombre;
            this.patrimonio = patrimonio;
            this.estrato = estrato;
        }

        public double matricula() {
            double pagmat = 50000;
            if ((patrimonio > 2000000) && (estrato > 3)) {
                pagmat = pagmat + (0.03*patrimonio);
            }
            return pagmat;
        }

}
