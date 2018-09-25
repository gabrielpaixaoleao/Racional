
package racional;


public class NumeroRacional {
    private double numerador;
    private double denominador;
    
    
    NumeroRacional(double numerador, double denominador){
        this.numerador = numerador;
        if(denominador == 0){
            System.out.println("O númerador é 0, o numerador n");
        }
    }
    
    public void soma(NumeroRacional num){
        this.numerador = (this.numerador * num.denominador) + (this.denominador * num.numerador);
        this.denominador = this.denominador * num.denominador;
        
    }
    
    public void subtracao(NumeroRacional num){
        this.numerador = (this.numerador * num.denominador) + (this.denominador * num.numerador);
        this.denominador = this.denominador * num.denominador;
    }
    
    public void divisao(NumeroRacional num){
        this.numerador = this.numerador * num.denominador;
        this.denominador = this.denominador * num.numerador;
    }
    
    public void multiplicacao(NumeroRacional num){
        this.numerador = this.numerador * num.numerador;
        this.denominador = this.denominador * num.denominador;
    }
    
    @Override
    public String toString(){
        String resultado = this.numerador+" / "+this.denominador;
        return resultado;        
    }  
}
