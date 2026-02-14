package atividades;
public class Main {

    public static void main(String[] args) {
        Carro meuCarro = new Carro(); // cria um objeto da classe Carro

        // atribuindo valores aos atributos
        meuCarro.marca = "Toyota";
        meuCarro.ano = 2022;

        // chamando o método para mostrar informações
        meuCarro.mostrarInfo();
    }
}
