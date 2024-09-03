public class SomaIndice {
    public static void main(String[] args) {
        int INDICE = 13, SOMA = 0, K = 1;
        
        while (K <= INDICE) { 
            SOMA = SOMA + K;
            K = K + 1;
        }
        
        System.out.println("SOMA: " + SOMA);  //91
    }
}