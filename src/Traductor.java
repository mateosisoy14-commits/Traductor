public class Traductor {
   
    private Traduccion[] diccionarioEsEng;
    private int totalPalabras;

   
    public Traductor(int size) {
        this.diccionarioEsEng = new Traduccion[size];
        this.totalPalabras = 0; 
    }

    public Boolean agregarPalabra(Traduccion palabra) {
        if (totalPalabras < diccionarioEsEng.length) {
            diccionarioEsEng[totalPalabras] = palabra;
            totalPalabras++;
            return true;
        }
        return false; 
    }

    
    public String verSignificado(String palabra) {
        for (int i = 0; i < totalPalabras; i++) {
            if (diccionarioEsEng[i].verPalabra().equalsIgnoreCase(palabra)) {
                return diccionarioEsEng[i].verSignificado();
            }
        }
        return "Palabra no encontrada"; 
    }

    
    public int verTotalPalabras() {
        return this.totalPalabras;
    }
}