public class Traduccion {

    private String palabra;
    private String significado;

    
    public Traduccion(String palabra, String significado) {
        this.palabra = palabra;
        this.significado = significado;
    }

    public String verPalabra() {
        return this.palabra;
    }

    public String verSignificado() {
        return this.significado;
    }
}