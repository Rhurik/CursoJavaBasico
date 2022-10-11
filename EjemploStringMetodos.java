public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Alberto";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Alberto\") = " + nombre.equals("Alberto"));
        System.out.println("nombre.equals(\"Alberto\") = " + nombre.equals("alberto"));

    }
}
