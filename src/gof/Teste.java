package gof;

import gof.facade.Facade;
import gof.singleton.SingletonEager;
import gof.singleton.SingletonLazy;
import gof.singleton.SingletonLazyHolder;
import gof.strategy.*;

public class Teste {
    public static void main(String[] args) {

        System.out.println("Teste de Design Pattern Singleton");
        System.out.println("-------eager-----------");
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        System.out.println("---------lazy---------");
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        System.out.println("---------holder---------");
        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);


        System.out.println("Teste de Design Pattern Strategy");

        Comportamento comportamentoNormal = new ComportamentoNormal();
        Comportamento comportamentoDefensivo = new ComportamentoDefensivo();
        Comportamento comportamentoAgressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(comportamentoNormal);
        robo.mover();
        robo.mover();

        robo.setComportamento(comportamentoAgressivo);
        robo.mover();
        robo.mover();


        System.out.println(" Facade");
        Facade facade = new Facade();
        facade.migrarCliente("João", "12345678");


    }

}
