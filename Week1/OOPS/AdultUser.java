package Week1.OOPS;

public class AdultUser implements LibraryUser{
    int age;
    String bookType;
    public void registerAccount(){
        if(age >= 12){
            System.out.println("Account has been Successfully registered under Adult category.");

        }
        else{
            System.out.println("Invalid age !! Age should not be less than 12 yrs.");
        }
    }
    public void requestBook(){
        if(bookType.equals("Fiction")){
            System.out.println("Your account has been registered under Adult Category.");
        }
        else{
            System.out.println("Sorry, you are not allowed take this Category.");
        }
    }
}
