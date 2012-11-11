package exercise6;

public class Rat implements Comparable<Rat> {
    private int num;
    private int denom;

    public Rat(){
        num = 0;
        denom = 1;
    }
    public Rat(int num) {
        this.num = num;
        this.denom = 1;
    }
    public Rat(int num, int denom) throws RuntimeException {
        if (denom == 0)
            throw new RuntimeException("divisor zero");
        this.num = num;
        this.denom = denom;
        normal();
    }

    private void normal() {
        int ggTn = ggT(num, denom);
        num /= ggTn;
        denom /= ggTn;
        if (denom < 0) {
            num *= -1;
            denom *= -1;
        }
    }

    public int ggT(int num, int denom) {
        int temp;
        while(denom != 0) 
        { 
            temp = denom; 
            denom = num % denom; 
            num = temp; 
        }
        return num;
    }

    public int getNum() {
        return num;
    }

    public int getDenom() {
        return denom;
    }

    public int compareTo(Rat n) {
        int x = n.denom != 0 ? num * n.denom : num;
        int y = denom != 0 ? n.num * denom : n.num;
        if (x > y)
            return 1;
        else if (y > x)
            return -1;
        else
            return 0;

    }

    public Rat add(Rat r) {
        int n = num * r.denom + denom * r.num;
        int d = denom * r.denom;
        Rat Number = new Rat(n, d);
        return Number;
    }

    public Rat sub(Rat r) {
        int n = num * r.denom - denom * r.num;
        int d = denom * r.denom;
        return new Rat(n, d);
    }

    public Rat mult(Rat r) {
        int n = num * r.num;
        int d = denom * r.denom;
        return new Rat(n, d);
    }

    public Rat div(Rat r) {
        int n = num * r.denom;
        int d = denom * r.num;
        return new Rat(n, d);
    }

    public String toString() {
        return denom != 1 ? num + "/" + denom : Integer.toString(num);
    }

    public void show() {
        System.out.println(toString());
    }

    public static void main(String[] args) {
            Rat r1 = new Rat(6, 8);
            Rat r2 = new Rat(3, 6);
            System.out.println("Erster Bruch: " + r1.toString());
            System.out.println("Zweiter Bruch: " + r2.toString());
            System.out.println();
            System.out.print("Addition: ");
            (r1.add(r2)).show();
            System.out.print("Subtraktion: ");
            (r1.sub(r2)).show();
            System.out.print("Multiplikation: ");
            (r1.mult(r2)).show();
            System.out.print("Division: ");
            (r1.div(r2)).show();
            Rat[] randomArray = new Rat[15];
            for (int i = 0; i < randomArray.length; i++)
                randomArray[i] = new Rat((int) (20 * Math.random()),
                        (int) (30 * Math.random()+1));
            java.util.Arrays.sort(randomArray);
            for (int i = 0; i < randomArray.length; i++)
                randomArray[i].show();
    }
}
