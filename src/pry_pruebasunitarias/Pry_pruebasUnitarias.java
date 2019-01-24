package pry_pruebasunitarias;

import java.util.Scanner;

public class Pry_pruebasUnitarias {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        float num1,num2,num3;
        int op;
        System.out.println("Ingrese el valor de a: "); num1 = tec.nextInt();
        System.out.println("Ingrese el valor de b: "); num2 = tec.nextInt();
        Operaciones obj = new Operaciones();
        do{
        System.out.println("---Menu---");
        System.out.println("[1].Suma");
        System.out.println("[2].Resta");
        System.out.println("[3].Multiplicacion");
        System.out.println("[4].Division");
        System.out.println("[5].Salir");
        System.out.println("Escoja una de las opciones: "); op=tec.nextInt();
        switch(op){
            case 1:
                num3 = obj.Suma(num1, num2);
                System.out.println("El resultado es: "+num3);
            break;
            case 2:
                num3 = obj.Res(num1, num2);
                System.out.println("El resultado es: "+num3);
            break;
            case 3:
                num3 = obj.Multi(num1, num2);
                System.out.println("El resultado es: "+num3);
            break;
            case 4:
                num3 = obj.Div(num1, num2);
                System.out.println("El resultado es: "+num3);
        }
        }while(op!=5);
    }
}
