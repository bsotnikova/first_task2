public class Main {
    public static void main(String[] args){
        int check = 100;
        int enrollment = 1100;
        int total=0;
        int bonus = 0;
        if (enrollment >= 1000){
            bonus = enrollment / 100;
        }
        total = check + enrollment + bonus;
        System.out.println(total);
    }
}
