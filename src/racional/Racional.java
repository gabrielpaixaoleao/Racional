
package racional;

public class Racional {


    public static void main(String[] args) {
        //criando dois objetos do tipo numero racional e passando dois valores inteiros para o construtor da classe 
        NumeroRacional rac1 = new NumeroRacional(2, 4);
        NumeroRacional rac2 = new NumeroRacional(3, 5);
        
        //invocando o metodo divisão e passando um objeto do tipo NumeroRacional como parâmetro
        rac1.divisao(rac2);
        
        //Mostra o resutado da operação...
        System.out.println(rac1.toString());
    }
    
}
