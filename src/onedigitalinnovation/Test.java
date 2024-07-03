package onedigitalinnovation;

import onedigitalinnovation.gof.facade.Facade;
import onedigitalinnovation.gof.singleton.SingletonEager;
import onedigitalinnovation.gof.singleton.SingletonLazy;
import onedigitalinnovation.gof.singleton.SingletonLazyHolder;
import onedigitalinnovation.gof.strategy.ComportamentoDefensivo;
import onedigitalinnovation.gof.strategy.ComportamentoNormal;
import onedigitalinnovation.gof.strategy.ComportamentoOfensivo;
import onedigitalinnovation.gof.strategy.Robo;

public class Test {
    public static void main(String[] args) {

        //Testes relacionados ao design pattern com Java Puro:

        // Singleton:
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        //Strategy:
        ComportamentoNormal comportamentoNormal = new ComportamentoNormal();
        ComportamentoDefensivo comportamentoDefensivo = new ComportamentoDefensivo();
        ComportamentoOfensivo comportamentoOfensivo = new ComportamentoOfensivo();
        Robo robo = new Robo();
        robo.setComportamentoRobo(comportamentoNormal);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.setComportamentoRobo(comportamentoDefensivo);
        robo.mover();
        robo.mover();
        robo.setComportamentoRobo(comportamentoOfensivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.mover();

        //Facede:
        Facade facade = new Facade();
        facade.migrarCliente("Cássia Santos", "68022100");
    }
}
