package student;

public class Sabiranje {

    int x;
    int y;
    int sum = 100;

    public void saberiDvaBroja(int x, int y){
        System.out.println(this.x + y);
    }

    public int saberiDvaBroja2(String x, String y){
        int sum = Integer.parseInt(x) + Integer.parseInt(y);
        return sum;
    }

    public int saberiBrojeve(int...arg) {
        int sum = 0;
        for (int i = 0; i < arg.length; i++) {
            sum += arg[i];
        }
        return sum;
    }






}
