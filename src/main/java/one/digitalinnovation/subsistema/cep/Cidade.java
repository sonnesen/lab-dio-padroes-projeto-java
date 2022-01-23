package one.digitalinnovation.subsistema.cep;

public class Cidade {
    private String nome;
    private String uf;
    private String cep;

    public Cidade(String nome, String uf, String cep) {
        this.nome = nome;
        this.uf = uf;
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public String getUf() {
        return uf;
    }

    public String getCep() {
        return cep;
    }
}
