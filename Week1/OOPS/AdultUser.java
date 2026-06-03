package Week1.OOPS;

public class AdultUser {
    int age;
    String bookType;

    public void registerAccount(){
        if(age>12){
            System.out.println("Successfully registered !!!");
        }
        else{
            System.out.println("Invalid Age....It must be more than 12");
        }
    }
    public void requestBook(){
        if(bookType.equals("Fiction")){
            System.out.println("Book Issued successfully, plz return the book within 7 days");
        }
        else{
            System.out.println("Sorry..you are allowed to take only adult Fiction books");
        }
    }

}
