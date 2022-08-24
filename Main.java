import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    Scanner sc = new Scanner(System.in);
    private static void menu() {
        System.out.println("1 - thay doi username");
        System.out.println("2 - thay doi email");
        System.out.println("3 - thay doi mat khau");
        System.out.println("4 - dang xuat ");
        System.out.println("0 - thoat ");
    }
    public static boolean Password(String password){
        String PASSWPRD = "^(?=.*[A-Z])(?=.*[.,_;-]).{7,15}$";
        boolean result = Pattern.matches(PASSWPRD, password);
        return result;
    }
    public static boolean Email(String email){
        String EMAIL = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        boolean result = Pattern.matches(EMAIL, email);
        return result;
    }

    // static void register(List<User> users) {
    //     Scanner scan = new Scanner(System.in);


    //     System.out.println("----Dang ky----");
    //     System.out.println();
    //     System.out.print("Nhap username: ");
    //     String username = scan.nextLine();
    //     System.out.println();
    //     System.out.print("Nhap email: ");
    //     String email = scan.nextLine();
    //     System.out.println();
    //     System.out.print("Nhap password: ");
    //     String pass = scan.nextLine();

    //     boolean check = true;
    //     for (User user : users) {
    //         if (username.equals(user.getUserName())) {
    //             System.out.println("Username da ton tai !!!");
    //             check = false;
    //             register(users);
    //             break;
    //         }

    //         if (!checkEmail(email, users)) {
    //             System.out.println("Email da ton tai hoac khong dung dinh dang !!!");
    //             check = false;
    //             register(users);
    //             break;
    //         }

    //         if (!checkPass(pass)) {
    //             System.out.println("Mat khau khong dung dinh dang !!!");
    //             check = false;
    //             register(users);
    //             break;
    //         }
    //     }
    //     if (check) {
    //         System.out.println("Dang ky tai khoan thanh cong");
    //         users.add(new User(username, pass, email));
            
    //     }


    // }

    
   public static void main(String[] args) {
    String username = "thanhtung";
    String password = "Tung@1234";
    String email = "tung@gmail.com";

    List<User> users = new ArrayList<>();
    users.add(new User("thanhtung", "Tung@1234", "tung@gmail.com"));

    

    
 

    


    System.out.println("Moi ban chon: ");
    System.out.println("1, Dang nhap : ");
    System.out.println("2, Danng ki:  ");
    

    Scanner sc = new Scanner(System.in);
    System.out.println("chon chuong trinh: ");
    int pick = sc.nextInt();
   
    if (pick == 1 ) {
        System.out.println(" username:  ");
        sc.next();
        String tk = sc.nextLine();
        System.out.println(" password: ");
        String mk = sc.nextLine();
        if (users.equals(tk) || users.equals(mk)) {
            System.out.println(" chao mung " + users + " ban co the thuc hien cac cong viec sau: ");
            
            menu();

            System.out.println("Chon cong viec: ");
            int menu = sc.nextInt();
            
            switch (menu) {
        case 1:{
            System.out.println("nhap username moi: ");
            sc.next();
            String newusername = sc.nextLine();

            
            
            break; 
        }
        

        case 2:{
            System.out.println("nhap email moi: ");
            String newEmail = sc.nextLine(); 
            break;
        }
        case 3:{
            System.out.println("Nhap password moi: ");
            String passwordNew = sc.nextLine();

            

        }
        case 4: {
            System.out.println("Dang xuat");

        }
        case 5:{
            System.out.println("thoat chuong trinh");

        }
        default:
            break;

    }
        }else if(username != tk){
            System.out.println("Kiem tra lai tai khoan: ");
            System.out.println("user name: ");
            tk = sc.nextLine();
            
            



            System.out.println("Dang nhap lai");
            System.out.println("Quen mat khau");
            System.out.println(" nhap lai email: ");
            String Emailcomeback = sc.nextLine();
            if( Emailcomeback.equals(email)){
                System.out.println("Email dung");
            }
        }


        
    }else if (pick == 2) {
       
        

        
            System.out.println("Tao tai khoan moi: ");
            System.out.println("Nhap ten tai khoan: ");
            sc.next();
            String newTk = sc.nextLine();


            System.out.println("Nhap vao email: "  );
            String newEmail = sc.nextLine();
            

            System.out.println("Nhap mat khau cua ban: ");
            String newMk = sc.nextLine();
            


        

        
    }


   
} 
static boolean checkEmail(String email, List<User> users) {
    boolean checkExistEmail = false;
    for (User user : users) {
        if (email.equals(user.getEmail())) {
            checkExistEmail = true;
        }
    }
    return Email(email);
}
    static boolean checkPass(String pass) {
    return Password(pass);
}
}


 

