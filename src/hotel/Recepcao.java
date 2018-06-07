package hotel;

import java.util.HashMap;

public class Recepcao {
    private HashMap<String, Estadia> estadias;

    public Recepcao(){
        this.estadias = new HashMap<>();
    }

    public void checkIn(String nome, String tipo, int idade, int dias, double valor){
        Estadia estadia = new Estadia(nome, tipo, idade, dias, valor);
        if (!estadias.containsKey(nome)) estadias.put(nome, estadia);
    }

    public void checkOut(String nome){
        estadias.remove(nome);
    }

    public int getNumDeHospedes(){
        return estadias.size();
    }

    public double getLucroTotal(){
        double lucroTotal = 0;

        for(String nome : this.estadias.keySet()) {
            lucroTotal += estadias.get(nome).getValor();

        }

        return  lucroTotal;
    }

    public String toString(){
        String saida = "";

        for(String nome : this.estadias.keySet()) {
            saida += String.format("%s (%s): %d dias com o preço de R$ %f" + System.lineSeparator(),
                    estadias.get(nome).getNome(), estadias.get(nome).getTipo(),
                    estadias.get(nome).getDias(), estadias.get(nome).getValor());
        }

        return saida;
    }
}
