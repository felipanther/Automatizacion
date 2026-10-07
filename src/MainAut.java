public class MainAut {
    static void main(String[] args) {
        Sensor sensor1 = new Sensor();
        Sensor sensor2 = new Sensor();

        sensor1.nombre = "sala";
        sensor2.nombre = "cocina";
        sensor1.tipo = "Infrarojo";
        sensor2.tipo = "Catalico";
        sensor1.lectura = 100;
        sensor2.lectura = 200;

        sensor1.mostrarLectura();
        sensor1.mostrarNombre();
        sensor1.mostrarTipo();
        sensor2.mostrarLectura();
        sensor2.mostrarNombre();
        sensor2.mostrarTipo();

    }
}
