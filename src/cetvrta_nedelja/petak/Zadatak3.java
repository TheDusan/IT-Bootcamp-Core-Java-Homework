package cetvrta_nedelja.petak;

public class Zadatak3 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        String input = "123";
        int[] input_niz = new int [input.length()];
        for (int i = 0; i < input.length(); i++) {
            input_niz[i] = Integer.valueOf(input.charAt(i) - '0');
        }

        int [] povecan_niz = povecavac(input_niz);
        stampac(povecan_niz);

    }
    public static int[] povecavac(int[] x) {
        int[] xx = new int[x.length];
        for (int i = 0; i < x.length; i++){
            xx[i] = x[i] + 1;
        }
        return xx;
    }

    public static void stampac(int[] x){
        for (int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }
    }
}
