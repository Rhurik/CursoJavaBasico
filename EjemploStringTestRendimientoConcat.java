public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
           // c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1k => 3ms, 10k => 97ms, 100k => 5393ms
           // c += a + b + "\n"; // 500 => 12ms, 1k => 13ms, 10k => 58ms, 100k => 1973ms
            sb.append(a).append(b).append("\n"); // 500 => 0ms, 1k => 0ms, 10k => 2ms, 100k => 10ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

    }
}
