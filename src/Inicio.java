
import javax.swing.JOptionPane;

public class Inicio {

    String[][] factura;
    int valorTotal = 0;

    public Inicio() {
        cantidadPizzas();
    }

    public void cantidadPizzas() {

        int nPizzas = Integer.parseInt(JOptionPane.showInputDialog("¡BIENVENIDO A LA PIZZERIA CARLO!\n"
                + "\n¿Cuantas pizzas desea llevar?"));
        factura = new String[nPizzas][6];

        if (nPizzas >= 5) {
            JOptionPane.showInternalMessageDialog(null, "No puede llevar mas de 5 pizzas");
            cantidadPizzas();
        } else {
            menu();
        }
    }

    public void menu() {


        for (int i = 0; i < factura.length; i++) {
            boolean control = true;
            int topping = 1, cerrar = 0;
            int total = 5000;
            factura[i][0] = Integer.toString(i + 1);

            while (control) {

                String sms = "Bienvenido a la pizzeeria CARLO\n\n Pizza N° " + (i + 1) + "\n\n";
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
                    factura[i][topping] = "Jamon";
                    total += 500;
                    factura[i][5] = Integer.toString(total);
                    topping++;
                    cerrar++;

                } else if (opcion == 2) {
                    factura[i][topping] = "Peperoni";
                    total += 900;
                    factura[i][5] = Integer.toString(total);
                    topping++;
                    cerrar++;

                } else if (opcion == 3) {
                    factura[i][topping] = "Pollo";
                    factura[i][topping] = "Pollo";
                    total += 700;
                    factura[i][5] = Integer.toString(total);
                    topping++;
                    cerrar++;

                } else if (opcion == 4) {
                    factura[i][topping] = "Tomate";
                    total += 300;
                    factura[i][5] = Integer.toString(total);
                    topping++;
                    cerrar++;

                } else if (opcion == 5) {
                    factura[i][topping] = "Atun";
                    total += 1200;
                    factura[i][5] = Integer.toString(total);
                    topping++;
                    cerrar++;

                } else if (opcion == 6) {
                    factura[i][topping] = "Albaca";
                    total += 400;
                    factura[i][5] = Integer.toString(total);
                    topping++;
                    cerrar++;

                } else if (opcion == 7) {
                    factura[i][topping] = "Champiniones";
                    total += 800;
                    factura[i][5] = Integer.toString(total);
                    topping++;
                    cerrar++;

                } else if (opcion == 8) {
                    control = false;

                } else {
                    JOptionPane.showInternalMessageDialog(null, "La opcion que ingreso no existe");
                    menu();
                }
                if (cerrar >= 4) {
                    control = false;

                }

            }
            valorTotal += total;
        }
        mostrar();
    }

    public void mostrar() {

        for (int i = 0; i < factura.length; i++) {

            for (int j = 0; j < factura[i].length; j++) {
                System.out.print(factura[i][j] + " - ");
            }
            System.out.println("");
        }
        System.out.println("Valor a Pagar: " + valorTotal);
    }

    public static void main(String[] args) {
        new Inicio();
    }

}
