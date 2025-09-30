import java.util.Locale;

public class Imc {

    private static double calculateImc(double weight, double height) {
        return weight / Math.pow(height, 2);
    }

    private static String decideImcClassification(double weight, double height, String gender) {

        double imc = calculateImc(weight, height);

        String genderLowerCase = gender.toLowerCase();

        if(( weight > 0 && height > 0 ) && (genderLowerCase.equals("m") || genderLowerCase.equals("f"))){
            if (gender.equals("m")) {
                if (imc < 20.7) {
                    return "Abaixo do peso";
                } else if (imc < 26.4) {
                    return "No peso normal";
                } else if (imc < 27.8) {
                    return "Marginalmente acima do peso ideal";
                } else if (imc < 31.1) {
                    return "Acima do peso ideal";
                }
                return "Obeso";

            } else {
                if (imc < 19.1) {
                    return "Abaixo do peso";
                } else if (imc < 25.8) {
                    return "No peso normal";
                } else if (imc < 27.3) {
                    return "Marginalmente acima do peso ideal";
                } else if (imc < 32.3) {
                    return "Acima do peso ideal";
                }
                return "Obesa";
            }
        }
        return "Insira dados coerentes";
    }

    public static void main(String[] args) {
        System.out.println(decideImcClassification(63, 1.75, "f"));
        System.out.println(decideImcClassification(63, 1.75, "m"));
    }
}
