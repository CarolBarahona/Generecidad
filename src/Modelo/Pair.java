package Modelo;
/**
 *
 * @author barah
 */
public class Pair<T, U> {
    private T first;
    private U second;

    // Constructor
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Método para obtener el primer elemento
    public T getFirst() {
        return first;
    }

    // Método para obtener el segundo elemento
    public U getSecond() {
        return second;
    }

    // Método para representar el par como una cadena
    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}



