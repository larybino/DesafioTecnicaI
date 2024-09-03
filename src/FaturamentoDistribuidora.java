import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FaturamentoDistribuidora {
    public static void main(String[] args) throws Exception {
        String content = new String(Files.readAllBytes(Paths.get("faturamento.json")));
        JSONArray faturamento = new JSONArray(content);

        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double soma = 0;
        int diasComFaturamento = 0;

        for (int i = 0; i < faturamento.length(); i++) {
            JSONObject dia = faturamento.getJSONObject(i);
            double valor = dia.getDouble("valor");

            if (valor > 0) {
                if (valor < menor) menor = valor;
                if (valor > maior) maior = valor;
                soma += valor;
                diasComFaturamento++;
            }
        }

        double media = soma / diasComFaturamento;
        int diasAcimaDaMedia = 0;

        for (int i = 0; i < faturamento.length(); i++) {
            JSONObject dia = faturamento.getJSONObject(i);
            double valor = dia.getDouble("valor");

            if (valor > media) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}
