package calculator;

public class CalculatorPrototype implements CalculatorIF {

    public int sum(int m, int n){
        for(int i=0;i<n;i++){
            m++;
        }
        return m;
    }

    public int mult(int m, int n){
        int r=0;
        for(int i=0;i<n;i++){
            r = r+m ;
        }
        return r;
    }

    public int divide(int m, int n){
        int r=0;
        while(m>=n){
            m = m-n;
            r++;
        }
        return r;
    }
}
