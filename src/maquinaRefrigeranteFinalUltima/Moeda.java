package maquinaRefrigeranteFinalUltima;

import java.util.Scanner;

public class Moeda{
    //Variáveis de saldos e lucro.
    float saldoInicial;
    float saldoFinal;
    float lucro;
    float saldoInicialAdicional;
    //Variáveis de troco e o valor inserido pelo cliente.
    float troco;
    float valor;
    //Variáveis que armazenam o lucro da venda.
    float saldoFanta;
    float saldoPepsi;
    float saldoSprite;
    float saldoGuarana;
    //Variáveis de cada produto e seus respectivos preços.
    float precoFanta = 2f;
    float precoPepsi = 3f;
    float precoSprite = 2f;
    float precoGuarana = 3f;
    
    //Construtor da classe Moeda.
    public Moeda(){
        saldoInicial = 0;
        saldoFinal = 0;
        lucro  = 0;  

    }
    /*Pede ao administrador para inserir o saldo inicial ou valor para ser repassado como troco,
    contendo a variável saldoFinal que irá mostrar a quantidade de troco que ainda há na máquina.*/
    public float saldoInicial(){
        
        Scanner entrada = new Scanner(System.in);
            System.out.println("\n* * * * * * * * * ** * * * * * * * * * *");
            System.out.println("* *    INSIRA O VALOR PARA TROCO     * *");
            System.out.println("* * * * * * * * * ** * * * * * * * * * *");
            saldoInicial = entrada.nextFloat();
            while (saldoInicial < 0){
            System.out.println("*  POR FAVOR, INSERA O VALOR CORRETO.  *");
            System.out.println("\n* * * * * * * * * ** * * * * * * * * * *");
            System.out.println("* *    INSIRA O VALOR PARA TROCO     * *");
            System.out.println("* * * * * * * * * ** * * * * * * * * * *");
            saldoInicial = entrada.nextFloat();
        } 
            saldoInicialAdicional += saldoInicial;
            saldoFinal += saldoInicial;
            return saldoInicial;
    }
    //Pedirá ao cliente para inserir o valor.
    public void trocoFanta(){
        
        System.out.println("* *         INSIRA O DINHEIRO        * *");
        System.out.println("* * * * * * * * * ** * * * * * * * * * *");
        Scanner entrada = new Scanner(System.in);
        valor = entrada.nextFloat(); 
    }
    //Pedirá ao cliente para inserir o valor.
    public void trocoPepsi(){
        
        System.out.println("* *         INSIRA O DINHEIRO        * *");
        System.out.println("* * * * * * * * * ** * * * * * * * * * *");
        Scanner entrada = new Scanner(System.in);
        valor = entrada.nextFloat();
    }
    //Pedirá ao cliente para inserir o valor.
    public void trocoSprite(){
        
        System.out.println("* *         INSIRA O DINHEIRO        * *");
        System.out.println("* * * * * * * * * ** * * * * * * * * * *");
        Scanner entrada = new Scanner(System.in);
        valor = entrada.nextFloat();
        
    } 
    //Pedirá ao cliente para inserir o valor.
    public void trocoGuarana(){
        
        System.out.println("* *         INSIRA O DINHEIRO        * *");
        System.out.println("* * * * * * * * * ** * * * * * * * * * *");
        Scanner entrada = new Scanner(System.in);
        valor = entrada.nextFloat();
    }
}
