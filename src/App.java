public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

/*
 * 
 * interesSimple = monto * (interes/100) * tiempo
 * interesCompuesto = monto * ( (1+ (interes/100))^tiempo - 1 )
 * compararInversion = interesCompuesto - interesSimple
 * 
 * 1) Crear clase 'BecaUniversitaria'
 * 2) Crear método compararInversion -> Sobrecar de métodos con parámetros y sin parámetros
 *      parámetros:
 *          * tiempo
 *          * monto
 *          * interes
 *      Retornar un String:
 *       *"La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia
 *      En el caso de que no se envien datos o se instancie con el constructor sin parámetros:
 *       *"No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada."
 */
