package reporteventas;

/**
 *
 * @author SARANGO
 */
public class Reporteventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables a utilizar.
        String[] meses = {"Agosto", "Octubre", "Diciembre"};
        String[] sucursales = {"sucursal 1", "sucursal 2", "sucursal 3", "sucursal 4"};
        String reporte;
        double[] ventas_mes_1 = {4500.2, 5500.2, 6500.2, 2500.1};
        double[] ventas_mes_2 = {1500.2, 2500.2, 3500.2, 1500.1};
        double[] ventas_mes_3 = {2300.2, 1200.2, 4700.2, 3200.1};

        double[] venta_total_sucursal = new double[4];
        double[] venta_promedio_sucursal = new double[4];
        double total_suma, total_promedio, final_total = 0;

        reporte = String.format("Reporte\n\n%-18s%-18s%-18s%-18s%-18s%-18s\n\n", "", meses[0], meses[1], meses[2], "Total", "Promedio");

        //Este for recorre ,  suma e imprime los valores de nuestra lista.
        for (int contador = 0; contador < venta_total_sucursal.length; contador++) {
            total_suma = ventas_mes_1[contador] + ventas_mes_2[contador] + ventas_mes_3[contador];
            total_promedio = total_suma / meses.length;
            venta_total_sucursal[contador] = total_suma;
            venta_promedio_sucursal[contador] = total_promedio;

            //Creación de linea de reporte que guenera nuestro reporte.
            reporte = reporte + String.format("%-18s%-18.2f%-18.2f%-18.2f%-18.2f%-18.2f\n", sucursales[contador], ventas_mes_1[contador], ventas_mes_2[contador], ventas_mes_3[contador], venta_total_sucursal[contador], venta_promedio_sucursal[contador]);
        }
        //Este for es para obtener el total de ventas de las sucursales.
        for (int contador = 0; contador < venta_total_sucursal.length; contador++) {
            final_total = venta_total_sucursal[contador] + final_total;
        }

        reporte = reporte + String.format("\n\nTotales de ventas de todas la sucursales es: %.2f", final_total);
        System.out.println(reporte);
    }

}
