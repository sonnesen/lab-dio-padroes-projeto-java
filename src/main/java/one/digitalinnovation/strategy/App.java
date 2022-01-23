package one.digitalinnovation.strategy;

public class App {

    public static void main(String[] args) {

        ComportamentoNormal comportamentoNormal = new ComportamentoNormal();
        ComportamentoAgressivo comportamentoAgressivo = new ComportamentoAgressivo();
        ComportamentoDefensivo comportamentoDefensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(comportamentoNormal);
        robo.mover();
        robo.mover();

        robo.setComportamento(comportamentoAgressivo);
        robo.mover();

        robo.setComportamento(comportamentoDefensivo);
        robo.mover();
    }
}
