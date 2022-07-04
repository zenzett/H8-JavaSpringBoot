abstract class Manusia {
    
    //deklarasi class dan method tipe abstract
    protected abstract void nyanyiLagu();    
}

class Cowok extends Manusia {

    //menggunakan method dari class abstract manusia
    @Override
    protected void nyanyiLagu(){
        System.out.println("du di du di dam dam");
        //statement dari perilaku yang menampilkan output pesan text yang berbeda dari class manusia
    }
}

class Cewek extends Manusia {

    //menggunakan method dari class abstract manusia
    @Override
    protected void nyanyiLagu(){
        System.out.println("du ri du ri dam ram");
        //statement dari perilaku yang menampilkan output pesan text yang berbeda dari class manusia
    }
}

public class Cetak {

    public static void main(String[] args){

        //Buat Object referensi class manusia, dengan cons cowok
        Manusia cowok = new Cowok();

        //Menampilkan output pada method yang ada di class cowok
        cowok.nyanyiLagu();

        //Buat Object referensi class manusia, dengan cons cewek
        Manusia cewek = new Cewek();

        //Menampilkan output pada method yang ada di class cewek
        cewek.nyanyiLagu();
    }
}