public class TowerOfHanoi {
    public static void main(String[] args) {
        int plate = 3;
        solve(plate,1,3,2);
    }

    // if just needs no. of moves then just return ((int)Math.pow(2,n)-1;)
    public static void solve(int n, int source, int destination, int helper){
        if (n<=1){
            System.out.println("Moving plate "+n+" from "+ "source: " +source+" to "+"destination: "+destination);
            return;
        }
        solve(n-1, source, helper,destination);
        System.out.println("Moving plate "+n+" from "+ "source: "+source +" to "+"destination: "+destination);
        solve(n-1,helper,destination, source);


    }
}
