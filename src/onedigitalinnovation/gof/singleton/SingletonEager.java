package onedigitalinnovation.gof.singleton;
/*
 * Singleton "apressado"
 * @author CassiaSantos - https://github.com/CassiaSantos
 * */

public class SingletonEager {
    private static SingletonEager instaciaSingleton = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instaciaSingleton;
    }
}
