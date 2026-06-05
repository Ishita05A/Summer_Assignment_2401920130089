package Week1.OOPS;

public class Main {
    public static void main(String[] args) {
        KidsUser kid = new KidsUser();
        kid.age = 10;
        kid.registerAccount();

        kid.age = 18;
        kid.registerAccount();

        kid.bookType = "Fiction";
        kid.requestBook();

        kid.bookType = "Kids";
        kid.requestBook();

        System.out.println(); 

        AdultUser adult = new AdultUser();
        adult.age = 5;
        adult.registerAccount();

        adult.age = 20;
        adult.registerAccount();

        adult.bookType = "Kids";
        adult.requestBook();

        adult.bookType = "Fiction";
        adult.requestBook();

    }
    
}
