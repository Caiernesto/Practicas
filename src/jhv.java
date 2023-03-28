public class jhv {
    private static void main(String[] args) {
        class Punto {
            int x;
            int y;

            public Punto(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }
        Punto pto1= new Punto(3, 5);
        System.out.println(pto1.x);

    }
}
