public class ConditionalLogic {

    public static void main(String[] args) {
    int x = 5;
    int y = 10;
    boolean hasil;
    hasil = x < y; //true
    hasil = x > y; //false
    hasil = x <= 5; //x lebih kecil atau samadengan 5 - true
    hasil = y >= 11; //y lebih besar atau samadengan 11 - false
    hasil = x == y; //x samadengan y - false
    hasil = x != y; //x tidak samadengan y - true
    hasil = x > y || x < y; //Logika or - true
    hasil = 3 < x && x < 6; //Logika and - true
    hasil = !hasil; //Logika not - false
    }
}