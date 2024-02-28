import javax.swing.JOptionPane;

public class Schaltjahr {


    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Bitte eine Jahreszahl eingeben:");       
        double Jahr = Integer.parseInt(input);
if (input.endsWith("00")) {
    System.out.println("Das ist kein Schaltjahr weil: Es ist ein Jahrhundert");
}
else {
        if ((Jahr / 4) % 1 == 0) {
            System.out.println((int)Jahr + " ist ein Schaltjahr!");
        }
        else {
            System.out.println((int) Jahr + " ist kein Schaltjahr!");
        }
        
        //System.out.println(Jahr);
    }
}   
}
