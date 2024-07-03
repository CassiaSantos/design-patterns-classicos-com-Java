package onedigitalinnovation.gof.singleton;
/*
* Singleton "preguiçoso"
* @author CassiaSantos - https://github.com/CassiaSantos
* */
public class SingletonLazy {
    private static SingletonLazy instaciaSingleton;

    private SingletonLazy (){
        super();
    }

    public static SingletonLazy getInstance(){
        if (instaciaSingleton == null){
            instaciaSingleton = new SingletonLazy();
        }
        return instaciaSingleton;
    }
}
