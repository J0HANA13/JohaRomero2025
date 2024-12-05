package calculadora;

import java.util.Stack;

public class Calculadora {
    private Stack <String> pilaRehacer;
    private Stack<String> pilaDeshacer;
    private Stack<String> pilaResultado;
    private String contenido;
    public int Dato1;
    public int Dato2;
    public int suma;
    
    

    public Calculadora(){
        
        this.pilaRehacer = new Stack<>();
        this.pilaDeshacer = new Stack<>();
        this.contenido= " ";
    }
    
    public void rehacer(String dato) {
        pilaRehacer.push(contenido);
        contenido += dato;
        pilaResultado.clear();
        System.out.println("El contenido actual es: " + contenido);
    }

    public Calculadora(int Dato1, int Dato2, int suma) {
        this.Dato1 = Dato1;
        this.Dato2 = Dato2;
        this.suma = suma;
    }

    public int getDato1() {
        return Dato1;
    }

    public void setDato1(int Dato1) {
        this.Dato1 = Dato1;
    }

    public int getDato2() {
        return Dato2;
    }

    public void setDato2(int Dato2) {
        this.Dato2 = Dato2;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }
    
    public void suma(){
        suma=Dato1+Dato2;
    }
    
    public void MostarResultado (){
        if (!pilaResultado.isEmpty()){
            pilaRehacer.push(contenido);
            contenido = pilaResultado.pop();
            System.out.println("Deshacer" + contenido);
        } else {
            System.out.println("");
        }
        
    }
    
}
