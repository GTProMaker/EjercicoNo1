
package ejerciciono1;
import static java.lang.Math.abs;
import static java.lang.System.exit;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class EJERCICIONO1 {

  
    public static void main(String[] args) {
    String OP;/*Variable para usar en el switch*/
    int op;/*Variable para convertir el String*/
    char R;/*Variable Tipo Caracter para Usar en el do while*/
    JOptionPane.showMessageDialog(null,"Ejercicio No 1 \n25-07-2019\nJoshua Benjamín Vásquez Godoy\n5090-18-447\nSección'B'");
    do{/*do while para regresar al menú*/
    do{/*do while para comprobar el rango*/
    OP=JOptionPane.showInputDialog("Menu Principal\n1.Que es Java IDE?\n2.Variables-Operadores\n3.Condicionales\n4.Ciclos\n5.Arreglos"
    + "\n6.Funciones-Procedimientos\n7.Salir");
    op=Integer.parseInt(OP);
    }while(op<1||op>7);
    switch(op){ //Mandamos a llamar todas las funciones
        case 1:{
        JAVA();
        break;
        }
        case 2:{
        VariablesOperadores();    
        break;
        }
        case 3:{
        Condicionales();    
        break;
        }
        case 4:{
        Ciclos();    
        break;
        }
        case 5:{
        Arreglos();    
        break;
        }
        case 6:{
        Funciones();    
        break;
        }
        case 7:{
        JOptionPane.showMessageDialog(null,"GRACIAS POR UTILZAR EL PROGRAMA");    
        exit(0);/*Salir del Programa*/
        break;
        }
    }
    R=JOptionPane.showInputDialog("Quiere Volver Al Menu PRINCIPAL?\nSi 's' o No 'n'").charAt(0);
    }while(R=='S'||R=='s');/*Final del do para volver al menu*/
    }
     public static void JAVA(){
    //Informacion sobre que es Java IDE
      JOptionPane.showMessageDialog(null,"¿Que es Java IDE?");
      JOptionPane.showMessageDialog(null,"Es una aplicación informática "
      + "\nque proporciona servicios "
      +"\nintegrales para facilitarle al "
      + "\ndesarrollador o programador\nel desarrollo de software");
    
    }
    /*Variables y Operadores*/
   public static void VariablesOperadores(){
   
    String A,B,C;/*Variables Tipo String*/
    char R,S;/*Variables Tipo Caracater*/
    int a,b,c,r;/*Variables Tipo Entero*/
    float fres;/*Variables Tipo Flotante*/
    JOptionPane.showMessageDialog(null,"Variables y Operadores");   
    do{/*Inico de do para reiniciar el programa*/ 
    JOptionPane.showMessageDialog(null,"Debera Ingresar Dos Numeros\nEn el Rango de '1-100'");
    do{/*Incio de do para comprobar el rango del valor*/
    A=JOptionPane.showInputDialog("Ingrese El Valor Del 'Primer' Dato\nEn el Rango de '1-100'");
    a=Integer.parseInt(A);
    }while(a<1||a>100);/*final del do while para confirmar el rango*/
    do{/*Incio de do para comprobar el rango del valor*/
    B=JOptionPane.showInputDialog("Ingrese El Valor Del 'Segundo' Dato\nEn el Rango de '1-100'");
    b=Integer.parseInt(B);
    }while(b<1||b>100);/*final del do while para confirmar el rango*/
    do{/*Inicio del do para regresar al menú*/
    do{ /*Inicio del do para confirmar el rango*/   
    C=JOptionPane.showInputDialog("Elija Una Opcion\n1.SUMA\n2.RESTA\n3.DIVISION\n4.MULTIPLICACION\n5.Salir");
    c=Integer.parseInt(C);
    }while(c<1||c>5);/*Final del do para comprobar el rango*/
    switch(c){
        case 1:{
        fres = a+b;
        JOptionPane.showMessageDialog(null,"El Resultado de\n"+a+" + "+b+" = "+fres);
        break;
        }
        case 2:{
        fres = a-b;
        JOptionPane.showMessageDialog(null,"El Resultado de\n"+a+" - "+b+" = "+fres);
        break;
        }
        case 3:{
        DecimalFormat resf =new DecimalFormat("0.00");
        float res = (float)a/b;
        JOptionPane.showMessageDialog(null,"El Resultado de\n"+a+" / "+b+" = "+resf.format(res));
        break;
        }
        case 4:{
        fres = a*b;    
        JOptionPane.showMessageDialog(null,"El Resultado de\n"+a+" x "+b+" = "+fres);
        break;
        }
        case 5:{
        JOptionPane.showMessageDialog(null,"GRACIAS POR UTILZAR EL PROGRAMA");    
        exit(0);/*Salir del Programa*/
        break;
        }
    }
    R=JOptionPane.showInputDialog("Quiere Volver Al Menu de Variables?\nSi 's' o No 'n'").charAt(0);
    }while(R=='S'||R=='s');/*Final del do para volver al menu*/
    S=JOptionPane.showInputDialog("Quiere Volver a Iniciar El Programa?\nSi 's' o No 'n'").charAt(0);
    }while(S=='S'||S=='s');/*Final del do para reiniciar el programa*/
//    JOptionPane.showMessageDialog(null,"GRACIAS POR UTILZAR EL PROGRAMA");    
//    exit(0);/*Salir del Programa*/
    }
   public static void Condicionales(){
   
    String A;
    char R;
    int a;
    boolean Par=true;/*Variable Booleana*/
    JOptionPane.showMessageDialog(null,"Condicionales");
    do{  
    do{
    A=JOptionPane.showInputDialog("Ingresar un Número Mayor a 'CERO'\nSi el Número es par sera 'TRUE'\nSi es Impar sera 'FALSE'");
    a=Integer.parseInt(A);
    }while(a<1);
    if(a%2==0){/*IF para saber si es Número Par*/
    JOptionPane.showMessageDialog(null,"El Número Ingresado es "+Par+"\nPAR");
    }
    else{/*Else Para saber si es Número Impar*/
    Par = false;
    JOptionPane.showMessageDialog(null,"El Número Ingresado es "+Par+"\nIMPAR");
    }
    R=JOptionPane.showInputDialog("Quiere Volver a Iniciar El Programa?\nSi 's' o No 'n'").charAt(0);
    }while(R=='S'||R=='s');
//    JOptionPane.showMessageDialog(null,"GRACIAS POR UTILZAR EL PROGRAMA");    
//    exit(0);/*Salir del Programa*/
   } 
   public static void Ciclos(){
   
   String A,B;
   /*Variables para arreglos*/
   String [] Nom=new String[20];
   String [] Ed=new String[20];
   String [] Car=new String[20];
   String [] Tel=new String[20];
   char R,S;
   int a,b,i=0,cont=1;
   JOptionPane.showMessageDialog(null,"Ciclos");
   do{
   do{
   A=JOptionPane.showInputDialog("De que Manera desea Pedir Datos\n1.FOR\n2.DO WHILE\n3.Salir");
   a=Integer.parseInt(A);
   }while(a<1||a>3);
   switch(a){
       case 1:{
       do{
       B=JOptionPane.showInputDialog("Digite el Número de Personas a Ingresar: ");
       b=Integer.parseInt(B);
       }while(b<1);
       JOptionPane.showMessageDialog(null,"FOR");
       for(i=0;i<b;i++){/*For para Pedir Datos*/
           JOptionPane.showMessageDialog(null,"Persona "+(i+1));
           Nom[i]=JOptionPane.showInputDialog("Persona"+(i+1)+"\nIngrese El Nombre: ");
           Ed[i]=JOptionPane.showInputDialog("Persona"+(i+1)+"\nIngrese La Edad: ");
           Car[i]=JOptionPane.showInputDialog("Persona"+(i+1)+"\nIngrese El Número de Carnet: ");
           Tel[i]=JOptionPane.showInputDialog("Persona"+(i+1)+"\nIngrese El Telefono: ");
       }
       for(i=0;i<b;i++){//for para Mostrar Datos
           JOptionPane.showMessageDialog(null,"Persona "+(i+1)+"\nNombre: "+Nom[i]+"\nEdad: "+Ed[i]+"\nCarnet: "+Car[i]
                   +"\nTelefono: "+Tel[i]);
       }
       break;
       }
       case 2:{
           JOptionPane.showMessageDialog(null,"DO WHILE");
           i=0;
           do{//Do while para pedir datos
           JOptionPane.showMessageDialog(null,"Persona "+(i+1));
           Nom[i]=JOptionPane.showInputDialog("Persona"+(i+1)+"\nIngrese El Nombre: ");
           Ed[i]=JOptionPane.showInputDialog("Persona"+(i+1)+"\nIngrese La Edad: ");
           Car[i]=JOptionPane.showInputDialog("Persona"+(i+1)+"\nIngrese El Número de Carnet: ");
           Tel[i]=JOptionPane.showInputDialog("Persona"+(i+1)+"\nIngrese El Telefono: "); 
           cont=cont+i;
           i++;
           R=JOptionPane.showInputDialog("Quiere Ingresar a Otra Persona?\nSi 's' o No 'n'").charAt(0);
           }while(R=='S'||R=='s');
           i=0;
           do{//do while para mostar datos
           JOptionPane.showMessageDialog(null,"Persona "+(i+1)+"\nNombre: "+Nom[i]+"\nEdad: "+Ed[i]+"\nCarnet: "+Car[i]
                   +"\nTelefono: "+Tel[i]);
           i++;
           }while(i<cont);
       break;
       }
       case 3:{
           JOptionPane.showMessageDialog(null,"GRACIAS POR UTILZAR EL PROGRAMA");    
           exit(0);/*Salir del Programa*/
        break;
       }
   }
    S=JOptionPane.showInputDialog("Quiere Volver al Menu de Ciclos?\nSi 's' o No 'n'").charAt(0);
    }while(S=='S'||S=='s');/*Final del do para reiniciar el programa*/  
   // JOptionPane.showMessageDialog(null,"GRACIAS POR UTILZAR EL PROGRAMA");    
   // exit(0);/*Salir del Programa*/
   }
   public static void Arreglos(){
   //Variables para arreglos
    String [] Nom= new String[20];
    String [] Sueldo= new String[20];
    String [] Años= new String[20];
    int [] sueldo= new int[20];
    int [] años= new int[20];
    int [] tot= new int[20];
    String B;
    int i=0,b;
    char R;
    JOptionPane.showMessageDialog(null,"Arreglos");
    do{
    do{
    B=JOptionPane.showInputDialog("Digite el Número de Personas a Ingresar: ");
    b=Integer.parseInt(B);
    }while(b<1);
    for(i=0;i<b;i++){//for para pedir datos en los arreglos
        JOptionPane.showMessageDialog(null,"Persona "+(i+1));
        Nom[i]=JOptionPane.showInputDialog("Persona"+(i+1)+"\nIngrese El Nombre: ");
        Sueldo[i]=JOptionPane.showInputDialog("Persona"+(i+1)+"\nIngrese El Sueldo: ");
        sueldo[i]=Integer.parseInt(Sueldo[i]);
        Años[i]=JOptionPane.showInputDialog("Persona"+(i+1)+"\nIngrese Los Años Trabajados: ");
        años[i]=Integer.parseInt(Años[i]);
    }
    for(i=0;i<b;i++){//for para mostrar datos de los arreglos
        JOptionPane.showMessageDialog(null,"Persona "+(i+1)+"\nNombre: "+Nom[i]+"\nSueldo: "+sueldo[i]+"\nAñosTrab: "+años[i]
                   +"\nSueldo en "+años[i]+" Años: "+(sueldo[i]*12*años[i]));
    
    }
    R=JOptionPane.showInputDialog("Quiere Volver a Iniciar El Programa?\nSi 's' o No 'n'").charAt(0);
    }while(R=='S'||R=='s');/*Final del do para reiniciar el programa*/  
  //JOptionPane.showMessageDialog(null,"GRACIAS POR UTILZAR EL PROGRAMA");    
  //exit(0);/*Salir del Programa*/
    }//Funciones
   public static void Funciones(){
   String A,B,OP;
   int a,b,op;
   double c,d;
   char R;
   JOptionPane.showMessageDialog(null,"Funciones");
   do{
   do{
   OP=JOptionPane.showInputDialog("Elija una Opcion\n1.Elevar al Cuadrado\n2.Restar\n3.Sumar\n4.Elevar al Cubo"
           + "\n5.Dividir");
   op=Integer.parseInt(OP);
   }while(op<1||op>5);
   switch(op){
       case 1:{
       JOptionPane.showMessageDialog(null,"Elevar al Cuadrado");
       A=JOptionPane.showInputDialog("Elevar al Cuadrado\nIngresar el Numero que desea Elevar al Cuadrado: ");
       a=Integer.parseInt(A);
       abs(a);/*Vuelvo Positivo el Número Ingresado*/
       JOptionPane.showMessageDialog(null,"El cuadrado de "+a+" es: "+Cuadrado(a));
       break;   
       }
       case 2:{
       JOptionPane.showMessageDialog(null,"Resta de 2 Números"); 
       A=JOptionPane.showInputDialog("Resta de 2 Números\nIngresar el Primer Numero que desea Restar: ");
       a=Integer.parseInt(A);
       B=JOptionPane.showInputDialog("Resta de 2 Números\nIngresar el Primer Numero que desea Restar: ");
       b=Integer.parseInt(B);
       JOptionPane.showMessageDialog(null,"La Resta de "+a+" - "+b+" es: "+Resta(a,b));
       break;
       }
       case 3:{
       JOptionPane.showMessageDialog(null,"Suma de 2 Números"); 
       A=JOptionPane.showInputDialog("Suma de 2 Números\nIngresar el Primer Numero que desea Sumar: ");
       a=Integer.parseInt(A);
       B=JOptionPane.showInputDialog("Suma de 2 Números\nIngresar el Primer Numero que desea Sumar: ");
       b=Integer.parseInt(B);
       JOptionPane.showMessageDialog(null,"La Suma de "+a+" + "+b+" es: "+Suma(a,b));
       break;
       }
       case 4:{
       JOptionPane.showMessageDialog(null,"Elevar al Cubo");
       A=JOptionPane.showInputDialog("Elevar al Cubo\nIngresar el Numero que desea Elevar al Cubo: ");
       a=Integer.parseInt(A);
       abs(a);/*Vuelvo Positivo el Número Ingresado*/
       JOptionPane.showMessageDialog(null,"El cubo de "+a+" es: "+Cubo(a));
       break;
       }
       case 5:{
       JOptionPane.showMessageDialog(null,"Division de 2 Números"); 
       A=JOptionPane.showInputDialog("Division de 2 Números\nIngresar el Primer Numero que desea Dividir: ");
       c=Double.parseDouble(A);
       B=JOptionPane.showInputDialog("Division de 2 Números\nIngresar el Primer Numero que desea Dividir: ");
       d=Double.parseDouble(B);
       JOptionPane.showMessageDialog(null,"La Suma de "+c+" + "+d+" es: "+Dividir(c,d));   
       break;
       }
       case 6:{
       JOptionPane.showMessageDialog(null,"GRACIAS POR UTILZAR EL PROGRAMA");    
       exit(0);/*Salir del Programa*/    
       break;
       }
   
   }
   R=JOptionPane.showInputDialog("Quiere Volver a Iniciar El Programa?\nSi 's' o No 'n'").charAt(0);
    }while(R=='S'||R=='s');/*Final del do para reiniciar el programa*/  

   }
   /*Clase Para Elevar al Cuadrado*/
   public static int Cuadrado(int c){
   
   return c*c;
   }
   /*Clase Para Restar Dos Números*/
   public static int Resta(int a,int b){
   
   return a-b;
   }
   /*Clase Para Sumar Un Números*/
   public static int Suma(int a,int b){
  
  return a+b;    
  }
   /*Clase Para Dividir Dos Números*/
   public static Double Dividir(Double a,Double b){
   
   return a/b;    
   }
   /*Clase Para Elevar al Cubo*/
   public static int Cubo(int c){
   
   return c*c*c;
   }
    
}
