import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Sammy’s makes it fun in the sun");
        System.out.println("Introduceti perioada de inchiriere:");
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        System.out.println("Introduceti timpul extra:");
        int time = sc.nextInt();
        int price_per_hour = 40;
        int price_per_minute = 1;
        int total = (hours * price_per_hour) + (time * price_per_minute);
        System.out.println("Ore: " + hours + ", minute: " + time + ",pret total: " + total);
    }
}