package one.digitalinnovation.facade;

public class App {

    public static void main(String[] args) {
        ClienteFacade clienteFacade = new ClienteFacade();
        clienteFacade.migrarCliente("Thiago Rocha Candido Bonimo", "49082650");
    }
}
