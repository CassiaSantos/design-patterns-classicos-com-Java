package onedigitalinnovation.gof.singleton;

public class SingletonLazyHolder {

    //Criação da instancia:
    private static class IbstanceHolder {
        public static SingletonLazyHolder singletonInstance = new SingletonLazyHolder();
    }

    //método construtor:
    private SingletonLazyHolder(){
        super();
    }

    // Método para retornar instancia:
    public static SingletonLazyHolder getInstance(){
        return IbstanceHolder.singletonInstance;
    }
}
