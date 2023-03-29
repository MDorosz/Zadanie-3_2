import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);
        
        System.out.print("Podaj tekst: ");
        String tekst = scanner.nextLine();
        
        System.out.print("Wybierz opcję konwersji (1 - małe litery na duże, 2 - duże litery na małe): ");
        int opcja = scanner.nextInt();

        int lbzmian=0;
        String konwersja = "";
        
      for (int i = 0; i < tekst.length(); i++) {
            char c = tekst.charAt(i);
          
            if (opcja == 1 && Character.isLowerCase(c)) {
                c = Character.toUpperCase(c); 
                lbzmian++;
            } 
            else if (opcja == 2 && Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
                lbzmian++;
            }
        
            konwersja += c;
        }

        System.out.println("Tekst po konwersji: " + konwersja);
        System.out.println("Liczba zmian: " + lbzmian);
    }
}