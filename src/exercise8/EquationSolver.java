package exercise8;

import exercise6.Rat;

public class EquationSolver {

    public static void swapLines(Rat[][] _Matrix, int l1, int l2) {
        Rat buffer;
        for (int x = 0; x < _Matrix[0].length; ++x) {
            buffer = _Matrix[l1][x];
            _Matrix[l1][x] = _Matrix[l2][x];
            _Matrix[l2][x] = buffer;
        }
    }

    public static Rat[] solve(Rat[][] _A, Rat[] _b) {
        if (_A.length != _A[0].length)
            return null;
        if (_A.length != _b.length)
            return null;
        Rat[][] a = new Rat[_A.length][];
        for(int i=0; i<_A.length; i++)
            a[i] = _A[i].clone();
        Rat[] b = _b.clone();
        for(int i=0; i<a.length; i++){
            checkzero(i, a, b);
            if(a[i][i].compareTo(new Rat())==0) return null;
            makeione(i, a, b);
            subFromAll(i, a, b);
        }
        return b;
    }
    
    public static void checkzero(int i, Rat[][] a, Rat[] b){
        if(a[i][i].compareTo(new Rat()) == 0) {
            int l = i;
            while(l<a.length && a[l][i].compareTo(new Rat()) == 0) l++;
            if(l < a.length)
            {
                swapLines(a, i, l);
                Rat temp;
                temp = b[i];
                b[i] = b[l];
                b[l] = temp;
            }
        }
    }

    public static void makeione(int i, Rat[][] a, Rat[] b){
        if(a[i][i].compareTo(new Rat(1,1)) != 0){
            if(b[i].compareTo(new Rat())!=0)
                b[i] = b[i].div(a[i][i]);
            makediv(a[i], a[i][i]);
        }
     }
    
    public static void subFromAll(int i, Rat[][] a, Rat[] b){
        for(int y=0; y<a.length; y++){
            if(y != i){
                Rat[] temp = a[i].clone();
                Rat tempb = b[i];
                makemult(temp, a[y][i]);
                tempb = tempb.mult(a[y][i]);
                makesub(a[y], temp);
                b[y] = b[y].sub(tempb);
            }
        }
    }
    
    public static void makesub(Rat[] a, Rat[] temp){
        for(int i=0; i<a.length; i++)
            a[i] = a[i].sub(temp[i]);
    }

    public static void makemult(Rat[] a, Rat mult){
        for(int i=0; i<a.length; i++)
            a[i] = a[i].mult(mult);
    }

    public static void makediv(Rat[] a, Rat mult){
        for(int i=0; i<a.length; i++)
            if(a[i].compareTo(new Rat()) != 0)a[i] = a[i].div(mult);
    }
    
    public static boolean proof(Rat[][] _A, Rat[] _x, Rat[] _b) {
        for (int y = 0; y < _A.length; ++y) {
            Rat sum = new Rat();
            for (int x = 0; x < _A.length; ++x)
                sum = sum.add(_A[y][x].mult(_x[x]));
            if (sum.compareTo(_b[y]) != 0)
                return false;
        }
        return true;
    }

    public static void print(String output, Rat[][] a, Rat[] b){
        System.out.println(output);
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                System.out.print(a[i][j].toString() + " ");
            }
        System.out.println("= " + b[i]);
        }
    }

    public static void print(String output, Rat[] a, Rat b){
        System.out.println(output);
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i].toString() + " ");
        }
        System.out.println("= " + b);
    }
    
    public static void main(String[] args) {
        Rat[][] a = { {new Rat(2), new Rat(-3), new Rat(1)},
                      {new Rat(1), new Rat(-4), new Rat(-1)},
                      {new Rat(-3), new Rat(9, 2), new Rat(-2)}  };
        Rat[] b = {new Rat(4), new Rat(2), new Rat(-3)};
        print("start: ", a, b);
        print("Result:", solve(a, b), new Rat());
    }
}
