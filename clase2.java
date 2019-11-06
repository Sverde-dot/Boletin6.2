
package boletin.pkg6.pkg2;

import java.util.Scanner;


public class clase2 {
    Scanner sc=new Scanner(System.in);
    private short num1;
    private short num2;

    public clase2(){
    }

   public clase2(short edad){
        this.num1=num1;
        this.num2=num2;
    }
    
    public void num1(){
        this.num1=num1;
    }
        public short getnum1(){
        return (short) num1; 
    }
    public void num2(){
        this.num2=num2;
    }
        public short getnum2(){
        return (short) num2; 
    }         
        
    public void convertir(short num1,short num2){
        System.out.println("La resta es : "+ (num1 + num2));
        if (num1>=num2)
            System.out.println("La resta es : " + (num1-num2));
        
    } 
    public int pedirShort(){
       //Scanner sc=new Scanner(System.in);
       System.out.println("El numero es: ");
       Short ed=sc.nextShort();
       return ed;
    }
}