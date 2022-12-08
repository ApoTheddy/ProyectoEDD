package Controlador;

import Modelo.Cliente.Cliente;
import Modelo.Cliente.ListaDobleCliente;
import Modelo.Empleado.ListaDobleEmpleado;
import Modelo.Empleado.Empleado;
import Modelo.Progreso;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ManejadorArchivo {

    private final File dataClientes = new File("clientes_data.txt");
    private final File dataEmpleados = new File("empleados_data.txt");

    public ManejadorArchivo() {
        crearTxts();
    }

    public void crearTxts() {
        try {
            if (!dataClientes.exists()) {
                new FileWriter(dataClientes, true).close();
            }
        } catch (IOException ioex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error, " + ioex.getMessage());
        }
        try {
            if (!dataEmpleados.exists()) {
                new FileWriter(dataEmpleados, true).close();
            }
        } catch (IOException ioex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error, " + ioex.getMessage());
        }

    }

    public void guardarDatosCliente(Cliente cliente) {
        try {
            var fw = new FileWriter(dataClientes, true);
            String datos = cliente.getNombres() + "-" + cliente.getApellidos() + "-" + cliente.getEdad() + "-" + cliente.getDNI() + "-" + cliente.getPeso() + "-" + cliente.getAltura()
               + "-" + cliente.getFechaInscripcion() + "-" + cliente.getFechaFinalizacion() + "\n";
            fw.append(datos);
            fw.close();

        } catch (IOException ioex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error, " + ioex.getMessage());

        }

    }

    public void guardarDatosEmpleado(Empleado empleado) {
        try {
            var fw = new FileWriter(dataEmpleados, true);
            String datos = empleado.getNombres() + "-" + empleado.getApellidos() + "-" + empleado.getEdad() + "-" + empleado.getDNI() + "-" + empleado.getNumeroInscritos()
               + "-" + empleado.getSueldoBase() + "\n";
            fw.append(datos);
            fw.close();
        } catch (IOException ioex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error, " + ioex.getMessage());

        }
    }

    public ListaDobleEmpleado obtenerDatosEmpleados() {
        ListaDobleEmpleado empleados = new ListaDobleEmpleado();

        try ( BufferedReader bf = new BufferedReader(new FileReader(dataEmpleados))) {
            String linea;

            while ((linea = bf.readLine()) != null) {
                StringTokenizer tk = new StringTokenizer(linea, "-");
                String nombres = tk.nextToken();
                String apellidos = tk.nextToken();
                int edad = Integer.parseInt(tk.nextToken());
                String dni = tk.nextToken();
                int numeroInscritos = Integer.parseInt(tk.nextToken());
                double sueldoBase = Double.parseDouble(tk.nextToken());

                empleados.agregarInicio(new Empleado(nombres, apellidos, edad, dni, "empleado", numeroInscritos, sueldoBase));
            }
        } catch (IOException ioex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error, " + ioex.getMessage());
        }

        return empleados;
    }

    public ListaDobleCliente obtenerDatosClientes() {
        ListaDobleCliente clientes = new ListaDobleCliente();
        try ( BufferedReader bf = new BufferedReader(new FileReader(dataClientes))) {
            String linea;

            while ((linea = bf.readLine()) != null) {
                StringTokenizer tk = new StringTokenizer(linea, "-");
                String nombres = tk.nextToken();
                String apellidos = tk.nextToken();
                int edad = Integer.parseInt(tk.nextToken());
                String dni = tk.nextToken();
                double peso = Double.parseDouble(tk.nextToken());
                double altura = Double.parseDouble(tk.nextToken());
                String fechaInscripcion = tk.nextToken();
                String fechaFinalizacion = tk.nextToken();

                clientes.agregarInicio(new Cliente(nombres, apellidos, edad, dni, peso, altura, fechaInscripcion, fechaFinalizacion));
            }
        } catch (IOException ioex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error, " + ioex.getMessage());
        }
        return clientes;
    }

    public void actualizarEmpleado(ListaDobleEmpleado empleados) {
        try {
            var fw = new FileWriter(dataEmpleados);
            fw.write("");

            fw = new FileWriter(dataEmpleados, true);
            for (int i = 0; i < empleados.getTamanio(); ++i) {
                String datos = empleados.getEmpleado(i).getNombres() + "-" + empleados.getEmpleado(i).getApellidos() + "-" + empleados.getEmpleado(i).getEdad() + "-" + empleados.getEmpleado(i).getDNI() + "-" + empleados.getEmpleado(i).getNumeroInscritos()
                   + "-" + empleados.getEmpleado(i).getSueldoBase() + "\n";
                fw.append(datos);
            }
            fw.close();
        } catch (IOException ioex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error, " + ioex.getMessage());
        }
    }

    public void actualizarCliente(ListaDobleCliente clientes) {
        try {
            var fw = new FileWriter(dataClientes, true);
            fw.write("");

            for (int i = 0; i < clientes.getTamanio(); ++i) {
                String datos = clientes.getCliente(i).getNombres() + "-" + clientes.getCliente(i).getApellidos() + "-" + clientes.getCliente(i).getEdad() + "-" + clientes.getCliente(i).getDNI() + "-" + clientes.getCliente(i).getPeso() + "-" + clientes.getCliente(i).getAltura()
                   + "-" + clientes.getCliente(i).getFechaInscripcion() + "-" + clientes.getCliente(i).getFechaFinalizacion() + "\n";
                fw.append(datos);
            }
            fw.close();
        } catch (IOException ioex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error, " + ioex.getMessage());
        }
    }

    public ArrayList<Progreso> obtenerProgresos(File ruta) {
        ArrayList<Progreso> progresos = new ArrayList<>();
        try {
            var bf = new BufferedReader(new FileReader(ruta));

            String linea;
            while ((linea = bf.readLine()) != null) {
                StringTokenizer tk = new StringTokenizer(linea, "-");
                double peso = Double.parseDouble(tk.nextToken());
                double imc = Double.parseDouble(tk.nextToken());
                String fecha = tk.nextToken();

                progresos.add(new Progreso(peso, imc, fecha));
            }
        } catch (IOException ioex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error, " + ioex.getMessage());
        }
        return progresos;
    }

    public void agregarProgreso(File ruta, Progreso progreso) {
        try {
            FileWriter fw = new FileWriter(ruta, true);
            DecimalFormat df = new DecimalFormat("00.00");

            String datos = progreso.getPeso() + "-" + df.format(progreso.getImc()) + "-" + progreso.getFecha() + "\n";
            fw.append(datos);
            fw.close();
        } catch (IOException ioex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error, " + ioex.getMessage());
        }
    }

    public void eliminarProgreso(File ruta, ArrayList<Progreso> progresos) {
        try {
            FileWriter fw = new FileWriter(ruta);
            fw.write("");
            fw = new FileWriter(ruta, true);

            for (int i = 0; i < progresos.size(); ++i) {
                String datos = progresos.get(i).getPeso() + "-" + progresos.get(i).getImc() + "-" + progresos.get(i).getFecha() + "\n";
                fw.append(datos);
            }
            fw.close();
        } catch (IOException ioex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error, " + ioex.getMessage());
        }

    }
}
