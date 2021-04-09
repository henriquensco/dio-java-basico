package POO.Exercicio01;

import POO.Exercicio01.Carro;

public class PassarCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setMarca("Volkswagen");
        carro.setModelo("Gol");
        carro.setAno(2020);
        carro.setVariante(carro.getMarca() + " " + carro.getModelo() + " " + carro.getAno());

        System.out.println(carro.getVariante());
    }
}
