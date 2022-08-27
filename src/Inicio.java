
import javax.swing.JOptionPane;

public class Inicio {

    String[][] factura;

    public Inicio() {
        cantidadPizzas();
    }

    public void cantidadPizzas() {

        int nPizzas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas pizzas desea llevar?"));
        factura = new String[nPizzas][8];

        if (nPizzas >= 5) {
            JOptionPane.showInternalMessageDialog(null, "No puede llevar mas de 5 pizzas");
        } else {
            menu();
        }
    }

    public void menu() {

        String sms = "Bienvenido a la pizzeeria CARLO\n\n";
        sms += "1. Añadir Pizza\n";
        sms += "2. Consultar Pizza\n";
        sms += "0. Salir del Programa\n";

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(sms));

        if (opcion == 1) {
            menuSecundario();

        } else if (opcion == 2) {
            mostrar();

        } else if (opcion == 0) {
            System.exit(0);

        } else {
            JOptionPane.showInternalMessageDialog(null, "La opcion que ingreso no existe");
        }
    }

    public void menuSecundario() {

        int topping = 0;
        int total = 5000;
        boolean control = true;

        while (control) {
            for (int i = 0; i < factura.length; i++) {

                String sms = "Bienvenido a la pizzeeria CARLO\n\n";
                sms += "Toppings:\n";
                sms += "1. $500 - Jamon\n";
                sms += "2. $900 - Peperoni\n";
                sms += "3. $700 - Pollo\n";
                sms += "4. $300 - Tomate\n";
                sms += "5. $1200 - Atun\n";
                sms += "6. $400 - Albaca\n";
                sms += "7. $800 - Champiñones\n";
                sms += "8. No mas toppings\n";

                int opcion = Integer.parseInt(JOptionPane.showInputDialog(sms));

                if (opcion == 1) {
                    factura[i][0] = "Jamon";
                    total += 500;
                    factura[i][7] = Integer.toString(total);
                    topping++;

                } else if (opcion == 2) {
                    factura[i][1] = "Peperoni";
                    total += 900;
                    factura[i][7] = Integer.toString(total);
                    topping++;

                } else if (opcion == 3) {
                    factura[i][2] = "Pollo";
                    total += 700;
                    factura[i][7] = Integer.toString(total);
                    topping++;

                } else if (opcion == 4) {
                    factura[i][3] = "Tomate";
                    total += 300;
                    factura[i][7] = Integer.toString(total);
                    topping++;

                } else if (opcion == 5) {
                    factura[i][4] = "Atun";
                    total = +1200;
                    factura[i][7] = Integer.toString(total);
                    topping++;

                } else if (opcion == 6) {
                    factura[i][5] = "Albaca";
                    total += 400;
                    factura[i][7] = Integer.toString(total);
                    topping++;

                } else if (opcion == 7) {
                    factura[i][6] = "Champiñones";
                    total += 800;
                    factura[i][7] = Integer.toString(total);
                    topping++;

                } else if (opcion == 8) {
                    menu();

                } else {
                    JOptionPane.showInternalMessageDialog(null, "La opcion que ingreso no existe");
                    menu();
                }
                if (topping > 4) {
                    control = false;
                    menu();
                }

            }
        }
    }

    public void mostrar() {

        System.out.print("Ingre1 | Ingre2 | Ingre3 | Ingre4 | Ingre5 | Ingre6 | Ingre7 | Total\n");

        for (int i = 0; i < factura.length; i++) {

            for (int j = 0; j < factura[i].length; j++) {
                System.out.print(factura[i][j] + " - ");
            }
            System.out.println("|");
        }
    }

    public static void main(String[] args) {
        new Inicio();
    }

}
