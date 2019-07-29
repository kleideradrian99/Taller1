package main;
import javax.swing.*;
import java.text.DecimalFormat;
import referencias.Mensajes;
import referencias.estudiantes.Estudiantes;
import  java.text.DecimalFormatSymbols;

public class Main {
    public static void main(String[] args){
        DecimalFormatSymbols decimales = new DecimalFormatSymbols();
        decimales.setDecimalSeparator('.');
        decimales.setGroupingSeparator(',');
        DecimalFormat reset = new DecimalFormat("##.##",decimales);

        Estudiantes student = new Estudiantes();

        String seguimientonota = JOptionPane.showInputDialog(null,Mensajes.MENSAJE_NOTA_SEGUIMIENTO.getMensaje());
        String parcialnota = JOptionPane.showInputDialog(null,Mensajes.MENSAJE_NOTA_PARCIAL.getMensaje());
        String examennota = JOptionPane.showInputDialog(null,Mensajes.MENSAJE_NOTA_EXAMEN.getMensaje());

        student.setNota_seguimiento(Double.parseDouble(seguimientonota));
        student.setNota_parcial(Double.parseDouble(parcialnota));
        student.setNota_examenfinal(Double.parseDouble(examennota));

        if (student.calificacion() >= 4 && student.calificacion() <=5){
            JOptionPane.showMessageDialog(null,Mensajes.MENSAJE_FINAL.getMensaje()+reset.format(student.calificacion())+Mensajes.MENSAJE_NOTA_4_A_5.getMensaje());
        }
        else if (student.calificacion() >= 3 && student.calificacion() <=3.9){
            JOptionPane.showMessageDialog(null,Mensajes.MENSAJE_FINAL.getMensaje()+reset.format(student.calificacion())+Mensajes.MENSAJE_NOTA_3_A_39.getMensaje());
        }
        else if (student.calificacion() >= 2 && student.calificacion() <=2.9){
            JOptionPane.showMessageDialog(null,Mensajes.MENSAJE_FINAL.getMensaje()+reset.format(student.calificacion())+Mensajes.MENSAJE_NOTA_2_A_29.getMensaje());
        }
        else if (student.calificacion() >= 1 && student.calificacion() <=1.9){
            JOptionPane.showMessageDialog(null,Mensajes.MENSAJE_FINAL.getMensaje()+reset.format(student.calificacion())+Mensajes.MENSAJE_NOTA_1_A_19.getMensaje());
        }
        else if (student.calificacion() >= 0 && student.calificacion() <=0.9){
            JOptionPane.showMessageDialog(null,Mensajes.MENSAJE_FINAL.getMensaje()+reset.format(student.calificacion())+Mensajes.MENSAJE_NOTA_0_A_09.getMensaje());
        }
    }
}
