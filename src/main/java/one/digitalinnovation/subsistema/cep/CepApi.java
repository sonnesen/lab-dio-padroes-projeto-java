package one.digitalinnovation.subsistema.cep;

import java.util.HashMap;
import java.util.Map;

public class CepApi {

    private static CepApi instancia = new CepApi();
    private Map<String, Cidade> cidades = new HashMap<>();

    private CepApi() {
        cidades.put("89220000", new Cidade("Joinville", "SC", "89220000"));
        cidades.put("02801000", new Cidade("São Paulo", "SP", "02801000"));
        cidades.put("49082650", new Cidade("Aracaju", "SE", "49082650"));
    }

    public static CepApi getInstance() {
        return instancia;
    }

    public String getCidadeByCep(String cep) {
        return cidades.get(cep).getNome();
    }

    public String getEstadoByCep(String cep) {
        return cidades.get(cep).getUf();
    }
}
