public class App {

    static int valueData = 404;

    public static void main(String[] args) throws Exception {
        final double conversion = 6.55957; // constante
        int priceFrancs = 45; // entier
        double priceEuros = priceFrancs / conversion;

        System.out.println("Hello, World!");
        System.out.println("Prix en francs : " + priceFrancs + "F");
        System.out.println("Prix en euros : " + priceEuros + "€");

        // ------------ //

        boolean isTrue = true;

        if (isTrue) {
            System.out.println("La phrase est vraie");
        } else {
            System.out.println("La phrase est incorrecte et est donc fausse !");
        }

        // ------------ //

        System.out.println("Code erreur " + valueData + " - Portée globale de la variable");

        // ------------ //

        for (int i = 1; i <= 10; i++) {
            System.out.println("La valeur de la variable i est égale à " + i + ".");
        }
    }
}
