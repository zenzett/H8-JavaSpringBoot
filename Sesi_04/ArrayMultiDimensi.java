public class ArrayMultiDimensi {
    public static void main(String[] args) {
        String[][] framework = {{"Java", "Kotlin"}, {"React", "Reactjs"}, {"PHP", "Laravel"}};

        for (int x=0; x < framework.length; x++){
            System.out.println("Bahasa: " + framework[x][0]);
            System.out.println("Framework: " + framework[x][1]);
            System.out.println("-------------------------");
        }
    }
}