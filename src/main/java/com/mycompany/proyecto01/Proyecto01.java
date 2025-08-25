
package com.mycompany.proyecto01;

import java.util.Scanner;
// IMPORTAMOS 
public class Proyecto01 {

    public static void main(String[] args) {
        // Creamos las variables para hacer el programa
        float hora,tarifa,sueldo_bruto,descuento,sueldo_neto,sueldo_anual;
        String empleado;
        // se crea el objeto lectura pra poder leer los datos ingresados
        Scanner lectura=new Scanner(System.in);
        //entrada de valores de nombre del empleado 
        System.out.print("Ingresar el nombre del empleado:");
        empleado=lectura.next();
        //entrada de valores del numero de horas trabajadas
        System.out.print("Ingresar el numero de horas trabajadas:");
        hora=lectura.nextInt();
        //entrada de valores del numero de tarifas por hora
        System.out.print("Ingresar la tarifa por hora:");
        tarifa=lectura.nextInt();
        //proceso de calculo de sueldo del empleado
        sueldo_bruto=hora*tarifa;
        descuento=(float) (0.13*sueldo_bruto);
        sueldo_neto=sueldo_bruto-descuento;
        sueldo_anual=12*sueldo_neto;
        
        //salida de datos de la consola de los calculos realizados
        System.out.println("Sueldo Bruto:" + sueldo_bruto);
        System.out.println("Descuento:" + descuento);
        System.out.println("Sueldo Neto:" + sueldo_neto);
        System.out.println("Sueldo Anual:" + sueldo_anual);
    }
}