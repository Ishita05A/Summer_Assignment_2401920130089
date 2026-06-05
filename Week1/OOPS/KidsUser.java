package Week1.OOPS;

public class KidsUser implements LibraryUser  {
    int age;
    String bookType;
    @Override
    public void registerAccount(){
        if(age <12){
            System.out.println("Your account has been registered under Kids Category.");
        }
        else{
            System.out.println("Invalid age for Kids Category, Age should be less than 12 yrs");
        }
    }
    public void requestBook(){
        if(bookType.equalsIgnoreCase("Kids")){
            System.out.println("Book issued successfully, plz return it within 10 days.");
        }
        else{
            System.out.println("Sorry, you are not allowed take this Category.");
        }
    }

}
