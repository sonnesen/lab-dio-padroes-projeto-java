package one.digitalinnovation.facade;

import one.digitalinnovation.subsistema.cep.CepApi;
import one.digitalinnovation.subsistema.crm.CRMService;

public class ClienteFacade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstance().getCidadeByCep(cep);
        String uf = CepApi.getInstance().getEstadoByCep(cep);
        CRMService.gravarCliente(nome, cep, cidade, uf);
    }
}
