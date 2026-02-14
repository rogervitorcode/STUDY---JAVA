package javac;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("fusca");
        Car myCar1 = new Car("Sandero");
        Car myCar2 = new Car("BMW");

        myCar1.acelerar();
        myCar2.acelerar();
        myCar.acelerar();
        Abstract meuHumano = new Humano();
        meuHumano.respira();
    }
}
class Car {
    String modelo;
    public Car(String modelo) {
       this.modelo = modelo;
    }
    public void acelerar() {
        System.out.println("Acelerando o carro a 38km "+this.modelo);
    }

}
