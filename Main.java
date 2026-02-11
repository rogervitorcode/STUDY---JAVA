import java.util.Scanner;
import java.util.ArrayList;


//todo programa JAVA precisa começar com um class ( detalhe:
/* se eu quiser uma class Carro, preciso criar um arquivo class pra Carro*/
public class Main {
    /*
   ATENÇÃO NAS CHAVES E NO STATIC VOID .
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        -----ESTRUTURA DE LER E RECEBER RESPOSTA-----------

       System.out.println(); => Dentro de uma public static
       Função => Imprime o que pedir.

       Para ler, precisa ser importado no topo
       : import java.util.Scanner;
       e dentro do public static
       : Scanner sc = new Scanner(System.in);

       Dessa forma.

       String nome = sc.nextLine(); ( resposta em texto)
       int idade = sc.nextInt(); ( resposta em numero inteiro )
       double decimal = sc.nextDouble(); ( resposta em numero decimal )
       boolean boll = sc.nextBoolean(); ( verdadeiro ou falso)

        PODEMOS DECLARAR VARIAVEL COM:
       -------------- NUMEROS INTEIROS----------------*
        byte => 8 bites ( util quando utilizar numeros pequenos => -128 a 127;
        short => 16 bits ( mesma ideia do byte, porem com um armazenamento maior => -32.768 a 32.767;
        int => 32 bits ( mais comum e armazena a maioria dos numeros que exigimos => 2.147.483.648 a 2.147.483.647;
        long => 64 bits (NUMEROS GIGANTES => -9.223.372.836.854.775.808 a 9.223.373.036.854.775.807;
        ex:
         int Idade = 18;( ISSO INDICA UM NUMERO INTEIRO)
        -----------------------------------------------
        --------------- NUMEROS DECIMAIS------------
        float => 32 bits ( para precisão simples )=> 39.23
        double => 64 bits( precisao dupla )

        ----------------CARACTERE------------------
        String => representar palavras e frases
        char => APenas uma palavra

        --------------BOOLEAN -----------------
        boolean => true ou false

        --------------- DECLARANDO O ENSINADO COM EXEMPLOS---------------------
        byte b = 100;
        short s = 10000;
        int i = 1000000;
        long l = 1000000;
        float f = 10.5f;
        double d = 20.5;
        char c = 'a';
        String s = "Roger";
        boolean bool = true;
        ------------------------------------------------------------
        E TAMBEM PODEMOS CRIAR VARIAVEIS COM (VAR):
        var Idade = 18; ( O PROPRIO COMPUTADOR VAI ENTENDER QUAL O TIPO SOZINHO)
         */
       /*
        boolean boll = true;
        if(boll != true){
            System.out.println("Verdadeiro");
        }
        else{
            System.out.println("Falso");
        }
        /*
        ----------------- IF ELSE ---------------------------
        LEMBRANDO DA MESMA ESTRUTURA DE C#
        ==(igualdade)
        =(definir valor)
        !=(diferente)
        > maior
        < menor
        <= menor igual
        >= maior igual
        ------------------------------
        PARA UTILIZAR STRING NO IF
        if(str.equals()) => IGUAL
        if(str.isBlank()) => VAZIO
        -------------------------------
        if() {
            System.out.println ("Verdadeiro");
        }
        else {
            System.out.println ("Falso");
        }

        ---------VETORES/ ARRAYS--------------
        O que é: VETOR E ARRAY É UMA ESTRUTURA DE DADOS QUE USAMOS PARA ARMAZENAR UMA COLEÇÃO DE VALORESDO MESMO TIPO
        ex: int i = 100; => so tem apenas um dado armazenado

        PARA USAR O VETOR

        int[] colecaoDeInteiros = {1, 2, 3, 4, 5};

        int[] colecaoDeInteiros = {1, 2, 3, 4 ,5 };
        System.out.println(colecaoDeInteiros[4]);

        DETALHE: SEMPRE ! SEMPRE O primeiro valor é acessado com [0]
        o computador reconhece o 0 como número inicial, então
        o [1] passa a ser o valor 2.

        E para saber o tamanho do meu array ( quantas unidades tem ),posso obter com
        System.out.printl(colecaoDeInteiros.length);

        ----------------ARRAY LIST ----------------------------
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Fernanda");

        // importa NO TOPO DO CODIGO

        import java.util.ArrayList;

        PARA CHAMAR devemos usar o comando .get
        System.out.println(nomes.get(0));
         */
        /*
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Fernanda");
        nomes.add("Julio");
        nomes.add("Jorge");
        nomes.add("Thor");
        System.out.println(nomes.get(2));
        */
        System.out.println("Digite seu nome");
        String nome = sc.nextLine();
        System.out.println("Olá, "+nome+"! Agora digite sua idade");
        int idade = sc.nextInt();
        System.out.println("Voce tem "+idade+" anos ");
        if ( idade>= 18) {
            System.out.println("Voce é de maior");
        }
        else {
            System.out.println("Voce é de menor");
        }
        // ESSA é a estrutura Imprime e Responde.
    }
    }

