
package maquinaRefrigeranteFinalUltima;
import java.util.Scanner;

public class Produto {

    //Variável que receberá a quantidade de estoque.
    int fanta;
    int fantaAdicional;
    int pepsi;
    int pepsiAdicional;
    int sprite;
    int spriteAdicional;
    int guarana;
    int guaranaAdicional;
    //Variável para controle de saída da máquina de refrigerante.
    int controleFanta;
    int controlePepsi;
    int controleSprite;
    int controleGuarana;
    //Construtor da classe Produto.
    public Produto(){
        fanta = 0;
        pepsi = 0;
        sprite = 0;
        guarana = 0;         
    }
    //Imprime a marca do produto que o cliente escolher.
    public void fanta(){
        System.out.println("\n* * * * * * * * * ** * * * * * * * * * *");
        System.out.println("* *              FANTA               * *");
        System.out.println("* * * * * * * * * ** * * * * * * * * * *"); 
    }
    //Imprime a marca do produto que o cliente escolher.
    public void pepsi(){
        System.out.println("\n* * * * * * * * * ** * * * * * * * * * *");
        System.out.println("* *              PEPSI               * *");
        System.out.println("* * * * * * * * * ** * * * * * * * * * *");
    }
    //Imprime a marca do produto que o cliente escolher.
    public void sprite(){
        System.out.println("\n* * * * * * * * * ** * * * * * * * * * *");
        System.out.println("* *              SPRITE              * *");
        System.out.println("* * * * * * * * * ** * * * * * * * * * *");
    }
    //Imprime a marca do produto que o cliente escolher.
    public void guarana(){
        System.out.println("\n* * * * * * * * * ** * * * * * * * * * *");
        System.out.println("* *        GUARANÁ ANTARCTICA        * *");
        System.out.println("* * * * * * * * * ** * * * * * * * * * *");
    }
    //Pedirá ao administrador da máquina inserir a quantidade de latas na máquina (com as condições).
    public int estoqueFanta(){
        
        Scanner entrada = new Scanner(System.in);
            
            fantaAdicional = entrada.nextInt();
            if (fantaAdicional < 0 || fantaAdicional > 10){
            System.out.println("*      INSERIR VALOR ENTRE 1 E 10.     *");
            System.out.println("* * * * * * * * * ** * * * * * * * * * *");
            }else{
                fanta += fantaAdicional;
                if (fanta > 10){
                    System.out.println("*    CAPACIDADE MÁXIMA ÚLTRAPASSADA    *");
                    System.out.println("*        CONSULTE O ESTOQUE            *");
                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                    fanta -= fantaAdicional;
                }    
            }
        return fanta;    
    }
    //Pedirá ao administrador da máquina inserir a quantidade de latas na máquina (com as condições).
    public int estoquePepsi(){
        
        Scanner entrada = new Scanner(System.in);
        
            pepsiAdicional = entrada.nextInt();
            if (pepsiAdicional < 0 || pepsiAdicional > 10){
            System.out.println("*      INSERIR VALOR ENTRE 1 E 10.     *");
            System.out.println("* * * * * * * * * ** * * * * * * * * * *");
            }else{
                pepsi += pepsiAdicional;
                if (pepsi > 10){
                    System.out.println("*    CAPACIDADE MÁXIMA ÚLTRAPASSADA    *");
                    System.out.println("*        CONSULTE O ESTOQUE            *");
                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                    pepsi -= pepsiAdicional;                    
                }    
            }   
        return pepsi;      
    }
    //Pedirá ao administrador da máquina inserir a quantidade de latas na máquina (com as condições).   
    public int estoqueSprite(){
        
        Scanner entrada = new Scanner(System.in);
        
            spriteAdicional = entrada.nextInt();
            if (spriteAdicional < 0 || spriteAdicional > 10){
            System.out.println("*      INSERIR VALOR ENTRE 1 E 10.     *");
            System.out.println("* * * * * * * * * ** * * * * * * * * * *");
            }else{
                sprite += spriteAdicional;
                if (sprite > 10){
                    System.out.println("*    CAPACIDADE MÁXIMA ÚLTRAPASSADA    *");
                    System.out.println("*        CONSULTE O ESTOQUE            *");
                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                    sprite -= spriteAdicional;
                }    
            } 
        return sprite;    
    }
    //Pedirá ao administrador da máquina inserir a quantidade de latas na máquina (com as condições).
    public int estoqueGuarana(){
        
        Scanner entrada = new Scanner(System.in);
        
            guaranaAdicional = entrada.nextInt();
            if (guaranaAdicional < 0 || guaranaAdicional > 10){
            System.out.println("*      INSERIR VALOR ENTRE 1 E 10.     *");
            System.out.println("* * * * * * * * * ** * * * * * * * * * *");
            }else{
                guarana += guaranaAdicional;
                if (guarana > 10){
                    System.out.println("*    CAPACIDADE MÁXIMA ÚLTRAPASSADA    *");
                    System.out.println("*        CONSULTE O ESTOQUE            *");
                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                    guarana -= guaranaAdicional;
                }    
            } 
        return guarana;    
    }
    //Informar ao administrador na hora em que a máquina está sendo usada o estoque do produto.
    public int saidaFanta(){
        if(fanta >= 0 && fanta <= 10){
            fanta = fanta + 0;
        }
       return fanta; 
    }
    //Informar ao administrador na hora em que a máquina está sendo usada o estoque do produto.
    public int saidaPepsi(){
        
        if(pepsi >= 0 && pepsi <= 10){
            pepsi = pepsi + 0;
        }
        return pepsi;
    }
    //Informar ao administrador na hora em que a máquina está sendo usada o estoque do produto.
    public int saidaSprite(){
        
        if(sprite >= 0 && sprite <= 10){
            sprite = sprite + 0;
        }
        return sprite;  
    }
    //Informar ao administrador na hora em que a máquina está sendo usada o estoque do produto.
    public int saidaGuarana(){
        
        if(guarana >= 0 && guarana <= 10){
            guarana = guarana + 0;
        }
        return guarana; 
    }
    //Variável de controle de saída para o administrador dos produtos indivisualmente.
    public void controle(){
        
        controleFanta= 0;
        controlePepsi= 0;
        controleSprite= 0;
        controleGuarana= 0;
    }
}
