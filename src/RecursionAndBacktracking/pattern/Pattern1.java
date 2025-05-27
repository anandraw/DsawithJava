package RecursionAndBacktracking.pattern;

// **** *** ** *
public class Pattern1 {
    public static void main(String[] args) {
       // traingle1(4,0);
        traingle2(4,0);

    }
    static void traingle1(int r,int c){
        if (r==0){
            return;
        }
        if (c<r){
            System.out.print(" * ");
            traingle1(r,c+1);
        }else{
            System.out.println();
            traingle1(r-1,0);
        }
    }
    static void traingle2(int r,int c){
        if (r==0){
            return;
        }
        if (c<r){
            traingle2(r,c+1);
            System.out.print(" * ");
        }else{
            traingle2(r-1,0);
            System.out.println();
        }
    }


}
