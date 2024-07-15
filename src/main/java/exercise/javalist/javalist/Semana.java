package exercise.javalist.javalist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Semana {
    private List<String> dias;

    public Semana() {
        this.dias = new ArrayList<>();
    }

    public void crearListaDias() {
        dias.clear();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miércoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sábado");
        dias.add("Domingo");
    }

    public List<String> obtenerDias() {
        return new ArrayList<>(dias);
    }

    public int largoLista() {
        return dias.size();
    }

    public void eliminarDia(String dia) {
        dias.remove(dia);
    }

    public String obtenerDia(int indice) {
        if (indice >= 0 && indice < dias.size()) {
            return dias.get(indice);
        }
        return null;
    }

    public boolean existeDia(String dia) {
        return dias.contains(dia);
    }

    public void ordenarDiasAlfabeticamente() {
        Collections.sort(dias);
    }

    public void vaciarLista() {
        dias.clear();
    }
}