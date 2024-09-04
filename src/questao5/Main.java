package questao5;

public class Main {

    public static void main(String[] args) {
        String string = "Eu mereco uma chance";
        String stringInvertida =  "";

        for (int i = string.length() - 1; i >= 0 ; i -- ){

            stringInvertida += string.charAt(i);
        }

        System.out.println(stringInvertida);
    }
}
