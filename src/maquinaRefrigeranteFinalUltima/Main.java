
package maquinaRefrigeranteFinalUltima;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        //Variáveis.
        int opcao;
        int produto;
        int ad;
        //Cria os objetos das referidas classes. 
        Moeda administrador = new Moeda();
        Produto adm = new Produto();
        //Menu inicial da máquina de refrigerante. 
        do{
            System.out.println("* * * * * * * MENU INICIAL * * * * * * *");
            System.out.println("* * * * * * * * * ** * * * * * * * * * *");
            System.out.println("*                                      *");
            System.out.println("*            1 - Administrador:        *");
            System.out.println("*            2 - Usuário:              *");
            System.out.println("*                                      *");
            System.out.println("* * * * * * * * * ** * * * * * * * * * *");
            Scanner entrada = new Scanner(System.in);
            //Opção para administrador ou usuário.
            opcao = entrada.nextInt();

            if(opcao <1 || opcao > 2){
                System.out.println("*   OPÇÃO INVÁLIDA! DIGITE NOVAMENTE.  *");
                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
            }
        }while(opcao < 1 || opcao >2);
        Scanner entrada = new Scanner(System.in);
        switch (opcao) {
            //Caso a escolha da opção for 1,pedirá a senha do administrador.
            case 1:
                System.out.println("\n* * * * * * * * * ** * * * * * * * * * *");
                System.out.println("* *      SENHA DO ADMINISTRADOR      * *");
                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                int senha = entrada.nextInt();

                    if (senha == 2015201400) {
                        //O administrador da máquina terá acesso ao menu administrativo.
                        do{  
                            System.out.println("\n* * * * *  MENU ADMINISTRATIVO * * * * *");
                            System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                            System.out.println("*                                      *");
                            System.out.println("*    1 - Consultar valores para troco  *");
                            System.out.println("*    2 - Inserir valor para troco      *");
                            System.out.println("*    3 - Consultar estoque de latas    *");
                            System.out.println("*    4 - Inserir refrigerantes         *");
                            System.out.println("*    5 - Consultar histórico de venda  *");
                            System.out.println("*    6 - Iniciar vendas                *");
                            System.out.println("*    0 - Desligar                      *");                            
                            System.out.println("*                                      *");
                            System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                            //Variável para opção do menu.
                            ad = entrada.nextInt();
                            switch (ad){
                                //Escolha 1, imprime o saldo inicial e final para o repasse de troco.
                                case 1 :
                                    System.out.println("\n* * * * *  MENU ADMINISTRATIVO * * * * *");
                                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                    System.out.println("* * * * *  CONSULTA PARA TROCO * * * * *");
                                    System.out.println("*                                      *");
                                    System.out.printf ("*   Saldo total adicionado: R$ %.2f    * \n", administrador.saldoInicialAdicional);
                                    System.out.printf ("*        Saldo atual: R$ %.2f          * \n", administrador.saldoFinal);
                                    System.out.println("*                                      *");
                                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                    break;
                                //Escolha 2, pedirá ao administrador para inserir o valor para o repasse de troco.       
                                case 2:
                                    administrador.saldoInicial();
                                    break;
                                //Escolha 3, mostrará a quantidade de latas de cadas fabricante inserido no estoque.       
                                case 3: 
                                    System.out.println("\n* * * * *  MENU ADMINISTRATIVO * * * * *");
                                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                    System.out.println("* * * * *  CONSULTA DE ESTOQUE * * * * *");
                                    System.out.println("*                                      *");
                                    System.out.println("*      Estoque de Fanta:   " + adm.fanta + " und.      *");
                                    System.out.println("*      Estoque de Pepsi:   " + adm.pepsi + " und.      *");
                                    System.out.println("*      Estoque de Sprite:  " + adm.sprite + " und.      *");
                                    System.out.println("*      Estoque de Guaraná: " + adm.guarana + " und.      *");
                                    System.out.println("*                                      *");
                                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                    break;
                                /*Escolha 4, é o submenu onde será inserido as quantidades de refrigerantes no estoque
                                a opção 0(Zero) retorna ao menu anterior.*/    
                                case 4:
                                    do{
                                        System.out.println("\n* * * * *  MENU ADMINISTRATIVO * * * * *");
                                        System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                        System.out.println("* *    INSIRA AS LATAS PARA VENDA    * *");
                                        System.out.println("*                                      *");    
                                        System.out.println("*        1 - Fanta                     *");
                                        System.out.println("*        2 - Pepsi                     *");
                                        System.out.println("*        3 - Sprite                    *");
                                        System.out.println("*        4 - Guaraná Antarctica        *");
                                        System.out.println("*        0 - Retorna ao menu anterior  *");
                                        System.out.println("*                                      *");
                                        System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                        
                                        opcao = entrada.nextInt();      
                                        switch (opcao){
                                            //Escolha 1, pedirá para inserir em estoque a quantidade da marca Fanta.
                                            case 1:
                                                //Inserir os produtos no estoque.
                                                System.out.println("\n* * * * * * * * * ** * * * * * * * * * *");
                                                System.out.println("*     Inserir as latinhas de Fanta     *  ");
                                                System.out.println("* * * *      ( Máx. 10 und )     * * * *  ");
                                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                                adm.estoqueFanta();
                                                break;
                                            //Escolha 2, pedirá para inserir em estoque a quantidade da marca Pepsi.    
                                            case 2: 
                                                System.out.println("\n* * * * * * * * * ** * * * * * * * * * *");
                                                System.out.println("*     Inserir as latinhas de Pepsi     *  ");
                                                System.out.println("* * * *      ( Máx. 10 und )     * * * *  ");
                                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                                adm.estoquePepsi();
                                                break;
                                            //Escolha 3, pedirá para inserir em estoque a quantidade da marca Sprite.    
                                            case 3: 
                                                System.out.println("\n* * * * * * * * * ** * * * * * * * * * *");
                                                System.out.println("*     Inserir as latinhas de Sprite    *  ");
                                                System.out.println("* * * *      ( Máx. 10 und )     * * * *  ");
                                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                                adm.estoqueSprite();
                                                break;
                                            //Escolha 4, pedirá para inserir em estoque a quantidade da marca Guaraná Antarctica.    
                                            case 4: 
                                                System.out.println("\n* * * * * * * * * ** * * * * * * * * * *");
                                                System.out.println("*     Inserir as latinhas de Guaraná   *  ");
                                                System.out.println("* * * *      ( Máx. 10 und )     * * * *  ");
                                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                                adm.estoqueGuarana();
                                                break;
                                        }
                                    }while(opcao != 0 );
                                break;
                                //Escolha 5, imprime o lucro total das vendas e quantas latas de cada produto saiu.
                                case 5:
                                    //Variável do lucro.
                                    administrador.lucro = administrador.saldoFanta + administrador.saldoPepsi + administrador.saldoSprite + administrador.saldoGuarana;
                                    System.out.println("\n* * * * *  MENU ADMINISTRATIVO * * * * *");
                                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                    System.out.println("* *        HISTÓRICO DE VENDAS       * *");
                                    System.out.println("*                                      *");
                                    System.out.printf ("*          Lucro total: R$ %.2f        *\n", administrador.lucro);
                                    System.out.println("*                                      *");
                                    System.out.println("*  Foram vendidas: " + adm.controleFanta + " und. de Fanta     *");
                                    System.out.println("*  Foram vendidas: " + adm.controlePepsi + " und. de Pepsi     *");
                                    System.out.println("*  Foram vendidas: " + adm.controleSprite + " und. de Sprite    *");
                                    System.out.println("*  Foram vendidas: " + adm.controleGuarana + " und. de Guaraná   *");
                                    System.out.println("*                                      *");
                                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                    break;
                                case 0:
                                    System.exit(0);
                                    break;                                    
                            }
                        //Escolha 6, sairá do menu administrativo e iniciará a interface do cliente.    
                        }while(ad != 6);   
                    }
     
            //Caso a escolha da opção for 2, abrirá a interface do cliente.                 
            case 2:
                do {
                    //Menu prinicpal do cliente.
                    System.out.println("\n* * * * * * * *  MENU  * * * * * * * * *");
                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                    System.out.println("*                                      *");    
                    System.out.println("*        1 - Fanta / R$ 2,00           *");
                    System.out.println("*        2 - Pepsi / R$ 3,00           *");
                    System.out.println("*        3 - Sprite / R$ 2,00          *");
                    System.out.println("*        4 - Guaraná Ant. / R$ 3,00    *");
                    System.out.println("*                                      *");
                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");                    
                    System.out.println("* * -------------------------------- * *");
                    System.out.println("* * |                              | * *");
                    System.out.println("* * |                              | * *");
                    System.out.println("* * -------------------------------- * *");
                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");                    
                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");

                    //O usuário digitará a opção.
                    produto = entrada.nextInt();

                    switch (produto) {
                        //Esta opção é para o administrador, ele consultará as saídas de produtos, estoque, saldos para repasse de troco e lucro.    
                        case 2015201400:
                            do{  
                                System.out.println("\n* * * * *  MENU ADMINISTRATIVO * * * * * *");
                                System.out.println("* * * * * * * * * ** * * * * * * * * * * *");
                                System.out.println("*                                        *");
                                System.out.println("*    1 - Consultar valores para troco    *");
                                System.out.println("*    2 - Inserir valor para troco        *");
                                System.out.println("*    3 - Consultar estoque de latas      *");
                                System.out.println("*    4 - Inserir refrigerantes           *");
                                System.out.println("*    5 - Consultar histórico de venda    *");
                                System.out.println("*    6 - Iniciar vendas                  *");
                                System.out.println("*    0 - Desligar                        *");                            
                                System.out.println("*                                        *");
                                System.out.println("* * * * * * * * * ** * * * * * * * * * * *");
                                //Variável para opção do menu.
                                ad = entrada.nextInt();
                            switch (ad){
                                //Escolha 1, imprime o saldo inicial e final para o repasse de troco.
                                case 1 :
                                    System.out.println("\n* * * * *  MENU ADMINISTRATIVO * * * * *");
                                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                    System.out.println("* * * * *  CONSULTA PARA TROCO * * * * *");
                                    System.out.println("*                                      *");
                                    System.out.printf ("*   Saldo total adicionado: R$ %.2f    * \n", administrador.saldoInicialAdicional);
                                    System.out.printf ("*        Saldo atual: R$ %.2f          * \n", administrador.saldoFinal);
                                    System.out.println("*                                      *");
                                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                    break;
                                //Escolha 2, pedirá ao administrador para inserir o valor para o repasse de troco.       
                                case 2:
                                    administrador.saldoInicial();
                                    break;
                                //Escolha 3, mostrará a quantidade de latas de cadas fabricante inserido no estoque.       
                                case 3: 
                                    System.out.println("\n* * * * *  MENU ADMINISTRATIVO * * * * *");
                                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                    System.out.println("* * * * *  CONSULTA DE ESTOQUE * * * * *");
                                    System.out.println("*                                      *");
                                    System.out.println("*      Estoque de Fanta:   " + adm.fanta + " und.      *");
                                    System.out.println("*      Estoque de Pepsi:   " + adm.pepsi + " und.      *");
                                    System.out.println("*      Estoque de Sprite:  " + adm.sprite + " und.      *");
                                    System.out.println("*      Estoque de Guaraná: " + adm.guarana + " und.      *");
                                    System.out.println("*                                      *");
                                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                    break;
                                /*Escolha 4, é o submenu onde será inserido as quantidades de refrigerantes no estoque
                                a opção 0(Zero) retorna ao menu anterior.*/    
                                case 4:
                                    do{
                                        System.out.println("\n* * * * *  MENU ADMINISTRATIVO * * * * *");
                                        System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                        System.out.println("* *    INSIRA AS LATAS PARA VENDA    * *");
                                        System.out.println("*                                      *");    
                                        System.out.println("*        1 - Fanta                     *");
                                        System.out.println("*        2 - Pepsi                     *");
                                        System.out.println("*        3 - Sprite                    *");
                                        System.out.println("*        4 - Guaraná Antarctica        *");
                                        System.out.println("*        0 - Retorna ao menu anterior  *");
                                        System.out.println("*                                      *");
                                        System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                        
                                        opcao = entrada.nextInt();      
                                        switch (opcao){
                                            //Escolha 1, pedirá para inserir em estoque a quantidade da marca Fanta.
                                            case 1:
                                                //Inserir os produtos no estoque.
                                                System.out.println("\n* * * * * * * * * ** * * * * * * * * * *");
                                                System.out.println("*     Inserir as latinhas de Fanta     *  ");
                                                System.out.println("* * * *      ( Máx. 10 und )     * * * *  ");
                                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                                adm.estoqueFanta();
                                                break;
                                            //Escolha 2, pedirá para inserir em estoque a quantidade da marca Pepsi.    
                                            case 2: 
                                                System.out.println("\n* * * * * * * * * ** * * * * * * * * * *");
                                                System.out.println("*     Inserir as latinhas de Pepsi     *  ");
                                                System.out.println("* * * *      ( Máx. 10 und )     * * * *  ");
                                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                                adm.estoquePepsi();
                                                break;
                                            //Escolha 3, pedirá para inserir em estoque a quantidade da marca Sprite.    
                                            case 3: 
                                                System.out.println("\n* * * * * * * * * ** * * * * * * * * * *");
                                                System.out.println("*     Inserir as latinhas de Sprite    *  ");
                                                System.out.println("* * * *      ( Máx. 10 und )     * * * *  ");
                                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                                adm.estoqueSprite();
                                                break;
                                            //Escolha 4, pedirá para inserir em estoque a quantidade da marca Guaraná Antarctica.    
                                            case 4: 
                                                System.out.println("\n* * * * * * * * * ** * * * * * * * * * *");
                                                System.out.println("*     Inserir as latinhas de Guaraná   *  ");
                                                System.out.println("* * * *      ( Máx. 10 und )     * * * *  ");
                                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                                adm.estoqueGuarana();
                                                break;
                                        }
                                    }while(opcao != 0 );
                                    break;
                                //Escolha 5, imprime o lucro total das vendas e quantas latas de cada produto saiu.
                                case 5:
                                    //Variável do lucro.
                                    administrador.lucro = administrador.saldoFanta + administrador.saldoPepsi + administrador.saldoSprite + administrador.saldoGuarana;
                                    System.out.println("\n* * * * *  MENU ADMINISTRATIVO * * * * *");
                                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                    System.out.println("* *        HISTÓRICO DE VENDAS       * *");
                                    System.out.println("*                                      *");
                                    System.out.printf ("*          Lucro total: R$ %.2f        *\n", administrador.lucro);
                                    System.out.println("*                                      *");
                                    System.out.println("*  Foram vendidas: " + adm.controleFanta + " und. de Fanta     *");
                                    System.out.println("*  Foram vendidas: " + adm.controlePepsi + " und. de Pepsi     *");
                                    System.out.println("*  Foram vendidas: " + adm.controleSprite + " und. de Sprite    *");
                                    System.out.println("*  Foram vendidas: " + adm.controleGuarana + " und. de Guaraná   *");
                                    System.out.println("*                                      *");
                                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                    break;
                                    
                                    case 0:
                                    System.exit(0);
                                    break; 
                            }
                        //Escolha 6, sairá do menu administrativo e iniciará a interface do cliente.    
                        }while(ad != 6);    
                            break;
                            
                        //Opção 1, Pedirá tudo o que se refere ao produto Fanta.
                        case 1:   
                            //Imprime a escolha do usuário.
                            adm.fanta();
                            //Inicia uma condição referente ao estoque, se o estoque de Fanta for igual a Zero imprime a mensagem.
                            if (adm.fanta == 0){
                                System.out.println("* *       PRODUTO INDISPONÍVEL       * *");
                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                            break;
                            }
                            //O objeto administrador pedirá ao cliente para inserir o valor para compra do produto.
                            administrador.trocoFanta();
                            //Variável do troco.
                            administrador.troco = administrador.valor - administrador.precoFanta;
                            //Inicia uma condição, se o valor inserido pelo cliente for igual ao preço, imprime a mensagem.
                            if (administrador.valor == 2) {
                                System.out.println("* *   COMPRA REALIZADA COM SUCESSO ! * *");
                                System.out.println("*                                      *");                               
                                System.out.println("*           * * * * * * * * *          *");
                                System.out.println("*         *  |               *         *");
                                System.out.println("*         *  |    FANTA      *         *");
                                System.out.println("*         *  |               *         *");
                                System.out.println("*           * * * * * * * * *          *");
                                System.out.println("*                                      *"); 
                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                //Contadores: do lucro, do estoque e da saída do produto.    
                                administrador.saldoFanta += administrador.precoFanta;
                                adm.fanta = --adm.fanta;
                                adm.controleFanta++;
                            break;
                            }
                            /*Se o valor inserido pelo cliente for menor do que o preço, imprime a mensagem e
                            não sairá produto e nem será contado o valor inserido ( O valor será devolvido e sem produto ).*/
                            if (administrador.valor < 2) {
                                System.out.println("* *        VALOR INSUFICIENTE        * *");
                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                            break;
                            }
                            /*Se o valor inserido pelo cliente for maior do que o preço e menor do que o saldo final,
                            a compra será com sucesso e informará o troco*/
                            if (administrador.valor > 2 && administrador.troco <= administrador.saldoFinal) {
                                System.out.printf("* * * *       TROCO R$ %.2f       * * * *\n", administrador.troco);
                                System.out.println("* *   COMPRA REALIZADA COM SUCESSO ! * *");
                                System.out.println("*                                      *");                               
                                System.out.println("*           * * * * * * * * *          *");
                                System.out.println("*         *  |               *         *");
                                System.out.println("*         *  |    FANTA      *         *");
                                System.out.println("*         *  |               *         *");
                                System.out.println("*           * * * * * * * * *          *");
                                System.out.println("*                                      *"); 
                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                //Contadores: do lucro e saldo para troco.    
                                administrador.saldoFanta += administrador.precoFanta;
                                administrador.saldoFinal -= administrador.troco;
                                //Contadores: do estoque e da saída do produto.    
                                adm.fanta = --adm.fanta;
                                adm.controleFanta++;
                            break;
                            }
                            /*Se o valor inserido pelo cliente for maior do que o saldo final não terá troco, 
                            a máquina perguntará se quer realizar a compra mesmo assim ou não. 
                            (Se sim libera o produto e fica com o troco, se não devolve o dinheiro).*/  
                            if (administrador.saldoFinal < administrador.troco || administrador.saldoFinal == 0) {
                                do{
                                    System.out.println("* *         TROCO INSUFICIENTE       * *");
                                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                    System.out.println("* *    Deseja comprar mesmo assim?   * *");
                                    System.out.println("*              1 - SIM                 *");
                                    System.out.println("*              2 - NÃO                 *");
                                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                    ad = entrada.nextInt();
                                }while (ad <1 || ad > 2);
                                switch (ad){
                                    case 1 :
                                        System.out.println("* *   COMPRA REALIZADA COM SUCESSO ! * *");
                                        System.out.println("*                                      *");                               
                                        System.out.println("*           * * * * * * * * *          *");
                                        System.out.println("*         *  |               *         *");
                                        System.out.println("*         *  |    FANTA      *         *");
                                        System.out.println("*         *  |               *         *");
                                        System.out.println("*           * * * * * * * * *          *");
                                        System.out.println("*                                      *"); 
                                        System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                        //Contadores: do estoque, da saída do produto e lucro.
                                        adm.fanta = --adm.fanta;
                                        adm.controleFanta++;
                                        administrador.saldoFanta += administrador.valor;
                                    break;
                                    case 2 :
                                        //Devolve o dinheiro e sem produto.
                                    break;
                                }
                                break;
                            }
                        break;    
                        //Opção 2, Pedirá tudo o que se refere ao produto Pepsi.
                        case 2:    
                            //Imprime a escolha do usuário.
                            adm.pepsi();
                            //Inicia uma condição referente ao estoque, se o estoque de Pepsi for igual a Zero imprime a mensagem.
                            if (adm.pepsi == 0) {
                                System.out.println("* *       PRODUTO INDISPONÍVEL       * *");
                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                            break;
                            }
                            //O objeto administrador pedirá ao cliente para inserir o valor para compra do produto.
                            administrador.trocoPepsi();
                            //Variável do troco.
                            administrador.troco = administrador.valor - administrador.precoPepsi;
                            //Inicia uma condição, se o valor inserido pelo cliente for igual ao preço, imprime a mensagem.
                            if (administrador.valor == 3) {
                                System.out.println("* *   COMPRA REALIZADA COM SUCESSO ! * *");
                                System.out.println("*                                      *");                               
                                System.out.println("*           * * * * * * * * *          *");
                                System.out.println("*         *  |               *         *");
                                System.out.println("*         *  |    PEPSI      *         *");
                                System.out.println("*         *  |               *         *");
                                System.out.println("*           * * * * * * * * *          *");
                                System.out.println("*                                      *"); 
                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                //Contadores: do lucro, do estoque e da saída do produto.    
                                administrador.saldoPepsi += administrador.precoPepsi;
                                adm.pepsi = --adm.pepsi;
                                adm.controlePepsi++;
                            break;
                            }
                            /*Se o valor inserido pelo cliente for menor do que o preço, imprime a mensagem e
                            não sairá produto e nem será contado o valor inserido ( O valor será devolvido e sem produto ).*/
                            if (administrador.valor < 3) {
                                System.out.println("* *        VALOR INSUFICIENTE        * *");
                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                            break;
                            }
                            /*Se o valor inserido pelo cliente for maior do que o preço e menor do que o saldo final,
                            a compra será com sucesso e informará o troco*/
                            if (administrador.valor > 3 && administrador.troco <= administrador.saldoFinal) {
                                System.out.printf("* * * *       TROCO R$ %.2f       * * * *\n", administrador.troco);
                                System.out.println("* *   COMPRA REALIZADA COM SUCESSO ! * *");
                                System.out.println("*                                      *");                               
                                System.out.println("*           * * * * * * * * *          *");
                                System.out.println("*         *  |               *         *");
                                System.out.println("*         *  |    PEPSI      *         *");
                                System.out.println("*         *  |               *         *");
                                System.out.println("*           * * * * * * * * *          *");
                                System.out.println("*                                      *"); 
                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                //Contadores: do lucro e saldo para troco.    
                                administrador.saldoPepsi += administrador.precoPepsi;
                                administrador.saldoFinal -= administrador.troco;
                                //Contadores: do estoque e da saída do produto.    
                                adm.pepsi = --adm.pepsi;
                                adm.controlePepsi++;
                                    break;
                                }
                            /*Se o valor inserido pelo cliente for maior do que o saldo final não terá troco, 
                            a máquina perguntará se quer realizar a compra mesmo assim ou não. 
                            (Se sim libera o produto e fica com o troco, se não devolve o dinheiro).*/ 
                            if (administrador.saldoFinal < administrador.troco || administrador.saldoFinal == 0) {
                                do{
                                    System.out.println("* *         TROCO INSUFICIENTE       * *");
                                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                    System.out.println("* *    Deseja comprar mesmo assim?   * *");
                                    System.out.println("*              1 - SIM                 *");
                                    System.out.println("*              2 - NÃO                 *");
                                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                    ad = entrada.nextInt();
                                }while (ad <1 || ad > 2);  
                                switch (ad){
                                    case 1 :
                                        System.out.println("* *   COMPRA REALIZADA COM SUCESSO ! * *");
                                        System.out.println("*                                      *");                               
                                        System.out.println("*           * * * * * * * * *          *");
                                        System.out.println("*         *  |               *         *");
                                        System.out.println("*         *  |    PEPSI      *         *");
                                        System.out.println("*         *  |               *         *");
                                        System.out.println("*           * * * * * * * * *          *");
                                        System.out.println("*                                      *"); 
                                        System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                        //Contadores: do estoque, da saída do produto e lucro.
                                        adm.pepsi = --adm.pepsi;
                                        adm.controlePepsi++;
                                        administrador.saldoPepsi += administrador.valor;
                                        break;
                                    case 2 :
                                        //Devolve o dinheiro e sem produto.
                                        break;
                                }
                                break;
                            }
                        break;    
                        //Opção 3, Pedirá tudo o que se refere ao produto Sprite.
                        case 3:    
                            //Imprime a escolha do usuário.
                            adm.sprite();
                            //Inicia uma condição referente ao estoque, se o estoque de Sprite for igual a Zero imprime a mensagem.
                            if (adm.sprite == 0) {
                                System.out.println("* *       PRODUTO INDISPONÍVEL       * *");
                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                            break;
                            }
                            //O objeto administrador pedirá ao cliente para inserir o valor para compra do produto.
                            administrador.trocoSprite();
                            //Variável do troco.
                            administrador.troco = administrador.valor - administrador.precoSprite;
                            //Inicia uma condição, se o valor inserido pelo cliente for igual ao preço, imprime a mensagem.
                            if (administrador.valor == 2) {
                                System.out.println("* *   COMPRA REALIZADA COM SUCESSO ! * *");
                                System.out.println("*                                      *");                               
                                System.out.println("*           * * * * * * * * *          *");
                                System.out.println("*         *  |               *         *");
                                System.out.println("*         *  |    SPRITE     *         *");
                                System.out.println("*         *  |               *         *");
                                System.out.println("*           * * * * * * * * *          *");
                                System.out.println("*                                      *"); 
                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                //Contadores: do lucro, do estoque e da saída do produto.
                                administrador.saldoSprite += administrador.precoSprite;
                                adm.sprite = --adm.sprite;
                                adm.controleSprite++;
                            break;
                            }
                            /*Se o valor inserido pelo cliente for menor do que o preço, imprime a mensagem e
                            não sairá produto e nem será contado o valor inserido ( O valor será devolvido e sem produto ).*/
                            if (administrador.valor < 2) {
                                System.out.println("* *        VALOR INSUFICIENTE        * *");
                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                            break;
                            } 
                            /*Se o valor inserido pelo cliente for maior do que o preço e menor do que o saldo final,
                            a compra será com sucesso e informará o troco*/
                            if (administrador.valor > 2 && administrador.troco <= administrador.saldoFinal) {
                                System.out.printf("* * * *       TROCO R$ %.2f       * * * *\n", administrador.troco);
                                System.out.println("* *   COMPRA REALIZADA COM SUCESSO ! * *");
                                System.out.println("*                                      *");                               
                                System.out.println("*           * * * * * * * * *          *");
                                System.out.println("*         *  |               *         *");
                                System.out.println("*         *  |    SPRITE     *         *");
                                System.out.println("*         *  |               *         *");
                                System.out.println("*           * * * * * * * * *          *");
                                System.out.println("*                                      *"); 
                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                //Contadores: do lucro e saldo para troco.    
                                administrador.saldoSprite += administrador.precoSprite;
                                administrador.saldoFinal -= administrador.troco;
                                //Contadores: do estoque e da saída do produto.     
                                adm.sprite = --adm.sprite;
                                adm.controleSprite++;
                            break;
                            }
                            /*Se o valor inserido pelo cliente for maior do que o saldo final não terá troco, 
                            a máquina perguntará se quer realizar a compra mesmo assim ou não. 
                            (Se sim libera o produto e fica com o troco, se não devolve o dinheiro).*/  
                            if (administrador.saldoFinal < administrador.troco || administrador.saldoFinal == 0) {
                                do{
                                    System.out.println("* *         TROCO INSUFICIENTE       * *");
                                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                    System.out.println("* *    Deseja comprar mesmo assim?   * *");
                                    System.out.println("*              1 - SIM                 *");
                                    System.out.println("*              2 - NÃO                 *");
                                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                    ad = entrada.nextInt();
                                }while (ad <1 || ad > 2);
                                switch (ad){
                                    case 1 :
                                        System.out.println("* *   COMPRA REALIZADA COM SUCESSO ! * *");
                                        System.out.println("*                                      *");                               
                                        System.out.println("*           * * * * * * * * *          *");
                                        System.out.println("*         *  |               *         *");
                                        System.out.println("*         *  |    SPRITE     *         *");
                                        System.out.println("*         *  |               *         *");
                                        System.out.println("*           * * * * * * * * *          *");
                                        System.out.println("*                                      *"); 
                                        System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                        //Contadores: do estoque, da saída do produto e lucro.
                                        adm.sprite = --adm.sprite;
                                        adm.controleSprite++;
                                        administrador.saldoSprite += administrador.valor;
                                    break;
                                    case 2 :
                                        //Devolve o dinheiro e sem produto.
                                    break;
                                }
                                break;
                            }
                        break;    
                        //Opção 3, Pedirá tudo o que se refere ao produto Guarná Antarctica.
                        case 4:    
                            //Imprime a escolha do usuário.
                            adm.guarana();
                            //Inicia uma condição referente ao estoque, se o estoque de Guarná Antarctica for igual a Zero imprime a mensagem.
                            if (adm.guarana == 0) {
                                System.out.println("* *       PRODUTO INDISPONÍVEL       * *");
                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                            break;
                            }
                            //O objeto administrador pedirá ao cliente para inserir o valor para compra do produto.
                            administrador.trocoGuarana();
                            //Variável do troco.
                            administrador.troco = administrador.valor - administrador.precoGuarana;
                            //Inicia uma condição, se o valor inserido pelo cliente for igual ao preço, imprime a mensagem.
                            if (administrador.valor == 3) {
                                System.out.println("* *   COMPRA REALIZADA COM SUCESSO ! * *");
                                System.out.println("*                                      *");                               
                                System.out.println("*           * * * * * * * * *          *");
                                System.out.println("*         *  |               *         *");
                                System.out.println("*         *  |    GUARANÁ    *         *");
                                System.out.println("*         *  |               *         *");
                                System.out.println("*           * * * * * * * * *          *");
                                System.out.println("*                                      *"); 
                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                //Contadores: do lucro, do estoque e da saída do produto.    
                                administrador.saldoGuarana += administrador.precoGuarana;
                                adm.guarana = --adm.guarana;
                                adm.controleGuarana++;
                            break;
                            }
                            /*Se o valor inserido pelo cliente for menor do que o preço, imprime a mensagem e
                            não sairá produto e nem será contado o valor inserido ( O valor será devolvido e sem produto ).*/
                            if (administrador.valor < 3) {
                                System.out.println("* *        VALOR INSUFICIENTE        * *");
                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                            break;
                            } 
                            /*Se o valor inserido pelo cliente for maior do que o preço e menor do que o saldo final,
                            a compra será com sucesso e informará o troco*/
                            if (administrador.valor > 3 && administrador.troco <= administrador.saldoFinal) {
                                System.out.printf("* * * *       TROCO R$ %.2f       * * * *\n", administrador.troco);
                                System.out.println("* *   COMPRA REALIZADA COM SUCESSO ! * *");
                                System.out.println("*                                      *");                               
                                System.out.println("*           * * * * * * * * *          *");
                                System.out.println("*         *  |               *         *");
                                System.out.println("*         *  |    GUARANÁ    *         *");
                                System.out.println("*         *  |               *         *");
                                System.out.println("*           * * * * * * * * *          *");
                                System.out.println("*                                      *"); 
                                System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                //Contadores: do lucro e saldo para troco.     
                                administrador.saldoGuarana += administrador.precoGuarana;
                                administrador.saldoFinal -= administrador.troco;
                                //Contadores: do estoque e da saída do produto.
                                adm.guarana = --adm.guarana;
                                adm.controleGuarana++;
                            break;
                            }
                            /*Se o valor inserido pelo cliente for maior do que o saldo final não terá troco, 
                            a máquina perguntará se quer realizar a compra mesmo assim ou não. 
                            (Se sim libera o produto e fica com o troco, se não devolve o dinheiro).*/ 
                            if (administrador.saldoFinal < administrador.troco || administrador.saldoFinal == 0) {
                                do{
                                    System.out.println("* *         TROCO INSUFICIENTE       * *");
                                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                    System.out.println("* *    Deseja comprar mesmo assim?   * *");
                                    System.out.println("*              1 - SIM                 *");
                                    System.out.println("*              2 - NÃO                 *");
                                    System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                    ad = entrada.nextInt();
                                }while (ad <1 || ad > 2);
                                switch (ad){
                                    case 1 :
                                        System.out.println("* *   COMPRA REALIZADA COM SUCESSO ! * *");
                                        System.out.println("*                                      *");                               
                                        System.out.println("*           * * * * * * * * *          *");
                                        System.out.println("*         *  |               *         *");
                                        System.out.println("*         *  |    GUARANÁ    *         *");
                                        System.out.println("*         *  |               *         *");
                                        System.out.println("*           * * * * * * * * *          *");
                                        System.out.println("*                                      *"); 
                                        System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                                        //Contadores: do estoque, da saída do produto e lucro.
                                        adm.guarana = --adm.guarana;
                                        adm.controleGuarana++;
                                        administrador.saldoGuarana += administrador.valor;
                                    break;
                                    case 2 :
                                        //Devolve o dinheiro e sem produto.
                                    break;
                                }
                                break;
                            }
                        break; 
                        //Essa condição é para desligamento da máquina de refrigerante.    
                        case 9:
                            System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                            System.out.println("* *           OBRIGADO !             * *");
                            System.out.println("* * * * * * * * * ** * * * * * * * * * *");
                    }
                } while (produto != 0);
        }
    }

}
