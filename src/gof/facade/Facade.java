package gof.facade;

import gof.subsistema1.crm.CrmService;
import gof.subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep) {

        // Lógica simplificada para migrar um cliente
        System.out.println("Migrando cliente: " + nome + " para o CEP: " + cep);
        // Aqui poderiam ser chamadas várias subsistemas para completar a migração

        CepApi.getInstance().recuperarCidade(cep);
        CepApi.getInstance().recuperarEstado(cep);
        CrmService.salvarCliente("Nome Exemplo", cep, "Cidade Exemplo", "Estado Exemplo");


    }

}
