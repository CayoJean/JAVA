public class CalcularPromedio {
    public static void main(String[] args) {
        // Definir un array de float con 20 elementos e inicializarlo con valores
        float[] numeros = {1.2f, 2.3f, 3.4f, 4.5f, 5.6f, 6.7f, 7.8f, 8.9f, 9.1f, 10.2f,
                            11.3f, 12.4f, 13.5f, 14.6f, 15.7f, 16.8f, 17.9f, 18.1f, 19.2f, 20.3f};

        // Inicializar la suma
        float suma = 0.0f;

        // Sumar todos los elementos del array utilizando la sintaxis de for-each
        for (float numero : numeros) {
            suma += numero;
        }

        // Calcular el promedio
        float promedio = suma / numeros.length;

        // Mostrar la suma y el promedio en la consola
        System.out.println("\n" +
                        "La suma de los elementos es: " + suma);
        System.out.println("El promedio de los elementos es: " + promedio);
    }
}
