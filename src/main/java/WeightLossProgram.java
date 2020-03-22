public class WeightLossProgram {
    public static void main(String[] args) {
        final int calories = 1151;
        final int chocolate = 340;
        final int porridge = 250;
        final int lard = 500;
        final boolean dinner = calories <= 1400;
        final boolean dinnerChocolate = (calories + chocolate) <= 1400;
        final boolean dinnerPorridge = (calories + porridge) <= 1400;
        final boolean dinnerLard = (calories + lard) <= 1400;
        final boolean dinnerComboChocolatePorridge = (calories + chocolate + porridge) <= 1400;
        final boolean dinnerComboChocolateLard = (calories + chocolate + lard) <= 1400;
        final boolean dinnerComboPorridgeLard = (calories + porridge + lard) <= 1400;
        final boolean dinnerComboChocolatePorridgeLard = (calories + chocolate + porridge + lard) <= 1400;
        System.out.println("За сегодня съел на " + calories + " калорий.");
        if (dinner) {
            if (dinnerChocolate) {
                System.out.println("Можно съесть только шоколадку, будет " + (calories + chocolate) +" калорий.");
            }
            if (dinnerPorridge) {
                System.out.println("Можно съесть только кашу, будет " + (calories + porridge) +" калорий.");
            }
            if (dinnerLard) {
                System.out.println("Можно съесть только сало, будет " + (calories + lard) +" калорий.");
            }
            if (dinnerComboChocolatePorridge) {
                System.out.println("Можно съесть только шоколадку и кашу, будет " + (calories + chocolate + porridge) +" калорий.");
            }
            if (dinnerComboChocolateLard) {
                System.out.println("Можно съесть только шоколадку и сало, будет " + (calories + chocolate + lard) +" калорий.");
            }
            if (dinnerComboPorridgeLard) {
                System.out.println("Можно съесть только кашу и сало, будет " + (calories + porridge + lard) +" калорий.");
            }
            if (dinnerComboChocolatePorridgeLard) {
                System.out.println("Можно съесть только шоколадку, кашу и сало, будет " + (calories + chocolate + porridge + lard) +" калорий.");
            }
        } else {
            System.out.println("Не ешь, выпей воды.");
        }
    }
}