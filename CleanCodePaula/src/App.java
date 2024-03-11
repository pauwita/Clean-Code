import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        // BLOQUE 4 : OBJETOS Y ESTRUCTURAS DE DATOS
        // 4.1 Diferencias entre objetos y estructuras de datos
        // EJEMPLO DE OBJETO
        class Persona {
            private int edad;
            private String nombre;

            public Persona(int edad, String nombre) {
                this.edad = edad;
                this.nombre = nombre;
            }

            public int obtenerEdad() {
                return this.edad;
            }

            public String obtenerNombre() {
                return this.nombre;
            }
        }
        // EJEMPLO DE ESTRUCTURA DE DATOS
        class Persona2 {
            public int edad;
            private String nombre;
        }
        Persona2 persona2 = new Persona2();
        persona2.edad = 18;
        persona2.nombre = "paula";

    }

    // BLOQUE 5 : MANEJO DE ERRORES
    // 5.1 Usa excepciones en lugar de código de retorno
    // EJEMPLO CON CÓDIGO DE RETORNO
    public static ArrayList<String> arrayListCodigoRetorno(String ejemploRetorno) {
        ArrayList<String> array = new ArrayList<>();
        // ...

        if (array.isEmpty()) {
            return new ArrayList<>();
        }
        return array;
    }

    // EJEMPLO CON EXCEPCIONES
    public static ArrayList<String> arrayListExcepcion(String ejemploExcepcion) throws EjemploExcepcion {
        ArrayList<String> array = new ArrayList<>();
        try {
            if (array.isEmpty()) {
                throw new EjemploExcepcion("Array vacío");
            }
        } catch (EjemploExcepcion e) {
            System.out.println(e.getMessage());
        }
        return array;
    }

    // Excepción
    public static class EjemploExcepcion extends Exception {
        public EjemploExcepcion(String message) {
            super(message);
        }
    }

    // 5.3 Usa excepciones unchecked
    // EJEMPLO CON UNCHECKED
    public class excepcionUnchecked extends RuntimeException {
        public excepcionUnchecked(String string) {
        }
    }

    public class Ejemplo {
        {
            try {
                lanzarExcepcion();
            } catch (excepcionUnchecked e) {
                System.out.println(e.getMessage());
            }
        }

        public void lanzarExcepcion() {
            throw new excepcionUnchecked("esta excepción es unchecked");
        }
    }
}
