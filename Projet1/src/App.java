public class App {
    public static void main(String[] args) throws Exception {
        final double conversion = 6.55957; // constante
        int priceFrancs = 45; // entier
        double priceEuros = priceFrancs / conversion;

        boolean isTrue = true;

        System.out.println("Hello, World!");
        System.out.println("Prix en francs : " + priceFrancs + "F");
        System.out.println("Prix en euros : " + priceEuros + "€");

        if (isTrue) {
            System.out.println("La phrase est vraie");
        } else {
            System.out.println("La phrase est incorrecte et est donc fausse !");
        }

    }
}
