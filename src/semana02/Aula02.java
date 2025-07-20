public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        c1.ponta = 0.7f;
        c1.carga = 90;
        c1.tampada = true;

        System.out.println("--- Informações da Caneta 1 ---");
        c1.status();

        Caneta c2 = new Caneta();
        c2.modelo = "Faber-Castell";
        c2.cor = "Vermelha";
        c2.ponta = 1.0f;
        c2.carga = 50;
        c2.tampada = false;

        System.out.println("\n--- Informações da Caneta 2 ---");
        c2.status();

        System.out.println("\n--- Interagindo com as canetas ---");
        System.out.println("Tentando usar a caneta c1 (tampada):");
        c1.rabiscar();

        System.out.println("\nTentando usar caneta c2 (destampada):");
        c2.rabiscar();

        System.out.println("\nStatus da c2 depois de rabiscar:");
        c2.status();
    }
}
