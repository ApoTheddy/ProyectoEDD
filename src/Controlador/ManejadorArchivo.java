package Controlador;

import Modelo.Cliente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ManejadorArchivo {

    private final File dataClientes = new File("clientes_data.txt");

    public void obtenerDatosClientes() {
        ArrayList<Cliente> clientes = new ArrayList<>();

        try ( BufferedReader bf = new BufferedReader(new FileReader(dataClientes))) {
            String linea;

            while ((linea = bf.readLine()) != null) {
                StringTokenizer tk = new StringTokenizer(linea, "|");
                String nombres = tk.nextToken();
                String apellidos = tk.nextToken();
                int edad = Integer.parseInt(tk.nextToken());
                String dni = tk.nextToken();
                double peso = Double.parseDouble(tk.nextToken());
                double altura = Double.parseDouble(tk.nextToken());
                String fechaInscripcion = tk.nextToken();
                String fechaFinalizacion = tk.nextToken();

                clientes.add(new Cliente(nombres, apellidos, edad, dni, peso, altura, fechaInscripcion, fechaFinalizacion));
            }
        } catch (IOException ioex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error, " + ioex.getMessage());
        }
    }
}
