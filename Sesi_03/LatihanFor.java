public class LatihanFor {
    public static void main(String[] args) {

        int a;
        for (a = 1; a <= 6; a++) {
            System.out.println("*****");
        }
        System.out.println(" ");

        int b;
        for (b = 0; b <= 10; b++) {
            System.out.print(b + " ");
        }
        System.out.println(" ");
        System.out.println(" ");


        int ganjil;
        for(ganjil = 1; ganjil <= 20; ganjil++){
            if(ganjil % 2==1){
                System.out.print(ganjil + " ");
            }
        }
    }
}