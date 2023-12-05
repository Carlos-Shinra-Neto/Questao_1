// Classe base Empresa
class Empresa {
    protected String nomeEmpresa;
    protected String cnpj;

    public Empresa(String nomeEmpresa, String cnpj) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nomeEmpresa + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}