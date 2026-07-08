public class Traductor {
    // Atributos privados
    private Traduccion[] diccionarioEsEng;
    private int totalPalabras;

    // Constructor que define el tamaño máximo del diccionario
    public Traductor(int size) {
        this.diccionarioEsEng = new Traduccion[size];
        this.totalPalabras = 0; // Inicializa el contador en 0
    }

    // Agrega una palabra al arreglo si hay espacio disponible
    public Boolean agregarPalabra(Traduccion palabra) {
        if (totalPalabras < diccionarioEsEng.length) {
            diccionarioEsEng[totalPalabras] = palabra;
            totalPalabras++;
            return true;
        }
        return false; // Diccionario lleno
    }

    // Busca el significado de una palabra (ignora mayúsculas/minúsculas)
    public String verSignificado(String palabra) {
        for (int i = 0; i < totalPalabras; i++) {
            if (diccionarioEsEng[i].verPalabra().equalsIgnoreCase(palabra)) {
                return diccionarioEsEng[i].verSignificado();
            }
        }
        return "Palabra no encontrada"; // Retorno por defecto si no existe
    }

    // Devuelve la cantidad de palabras actualmente registradas
    public int verTotalPalabras() {
        return this.totalPalabras;
    }
}