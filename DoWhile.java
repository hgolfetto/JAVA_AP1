public class DoWhile {
    public static void main(String[] args) {
        int n = 8, c = 1, m = n;

        System.out.println("Os multiplos de " + n + "são: ");
        
        do{ // pelo menos uma vez será executada
            System.out.println(m);
            c++;
            m = n * c;
        } while (m < 100); //Se a condição for falsa, acaba o programa
    }
}
