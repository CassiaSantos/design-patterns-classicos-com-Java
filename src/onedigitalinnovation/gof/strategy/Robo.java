package onedigitalinnovation.gof.strategy;
//o robo é o contexto
public class Robo {
    private Comportamento comportamentoRobo;

    //método set para mudar comportamento do robô:

    public void setComportamentoRobo(Comportamento comportamentoRobo) {
        this.comportamentoRobo = comportamentoRobo;
    }

    public void mover(){
        comportamentoRobo.mover();
    }
}
