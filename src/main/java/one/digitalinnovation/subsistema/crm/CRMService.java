package one.digitalinnovation.subsistema.crm;

public class CRMService {

    private CRMService() {

    }

    public static void gravarCliente(String nome, String cep, String cidade, String uf) {
        System.out.println(String.format("Cliente %s salvo no sistema de CRM", nome));
    }
}
