package onedigitalinnovation.subsistema2.cep;

import onedigitalinnovation.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instaciaSingleton = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return instaciaSingleton;
    }

    public String recuperarCidade(String cep){
        return "Santarém";
    }

    public String recuperarEstado(String cep){
        return "PA";
    }
}
