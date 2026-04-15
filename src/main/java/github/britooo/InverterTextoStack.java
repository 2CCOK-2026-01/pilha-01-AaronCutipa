package github.britooo;

public class InverterTextoStack {
    public static String inverter(String input) {

        Pilha<String> pilha = new Pilha<>(input.length());

        for (int i = 0; i < input.length(); i++) {
            pilha.push(String.valueOf(input.charAt(i)));
        }

        String elemento = "";
        for (int i = pilha.size(); i > 0; i--) {
            elemento += pilha.pop();
        }

        /*
            É óbvio que não precisamos de uma pilha para resolver esse
            problema, porém, precisamos desenvolver nosso raciocínio lógico!

            Então, não fique pilhado, use a classe Pilha.
        */
        return elemento;
    }
}
