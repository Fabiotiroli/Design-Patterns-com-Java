package gof.subsistema2.cep;

public class CepApi {

    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String recuperarCidadeEEstado(String cep) {
        System.out.println("Recuperando cidade e estado para o CEP: " + cep);
        // Simulação de recuperação de dados
        System.out.println("Cidade: São Paulo");
        System.out.println("Estado: SP");
        return "São Paulo, SP";
    }

    public String recuperarEstado(String cep) {
        System.out.println("Recuperando cidade e estado para o CEP: " + cep);
        // Simulação de recuperação de dados
        String estado = "SP";
        System.out.println("Estado: SP");
        return estado;
    }

    public String recuperarCidade(String cep) {
        System.out.println("Recuperando cidade para o CEP: " + cep);
        // Simulação de recuperação de dados
        String cidade = "São Paulo";
        System.out.println("Cidade: " + cidade);
        return cidade;
    }

}
