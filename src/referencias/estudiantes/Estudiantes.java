package referencias.estudiantes;

public class Estudiantes {
    private double nota_seguimiento;
    private double nota_parcial;
    private  double nota_examenfinal;


    public double getNota_seguimiento() {
        return nota_seguimiento;
    }

    public void setNota_seguimiento(double nota_seguimiento) {
        this.nota_seguimiento = nota_seguimiento;
    }


    public double getNota_parcial() {
        return nota_parcial;
    }

    public void setNota_parcial(double nota_parcial) {
        this.nota_parcial = nota_parcial;
    }

    public double getNota_examenfinal() {
        return nota_examenfinal;
    }

    public void setNota_examenfinal(double nota_examenfinal) {
        this.nota_examenfinal = nota_examenfinal;
    }
/*Metodo encargado de hacer la operacion para la nota final*/
    public double calificacion(){
        return ((this.getNota_seguimiento()*0.4)+(this.getNota_examenfinal()*0.3)+(this.getNota_parcial()*0.3));
    }
}
