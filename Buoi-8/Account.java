import java.util.Scanner;

public class Account implements IAccount {
    private String name ;
    private int accountNumber;
    private String email;
    private double accountBlance;
    private double recharge;
    private double accontBalanceAfterRecharge ;
    private String newEmail;


    
    ////             getter - setter

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return int return the accountBlance
     */
    public double getAccountBlance() {
        return accountBlance;
    }

    /**
     * @param accountBlance the accountBlance to set
     */
    public void setAccountBlance(double accountBlance) {
        this.accountBlance = accountBlance;
    }

    
     /**
     * @return double return the recharge
     */
    public double getRecharge() {
        return recharge;
    }

    /**
     * @param recharge the recharge to set
     */
    public void setRecharge(double recharge) {
        this.recharge = recharge;
    }

    /**
     * @return double return the accontBalanceAfterRecharge
     */
    public double getAccontBalanceAfterRecharge() {
        return accontBalanceAfterRecharge;
    }

    /**
     * @param accontBalanceAfterRecharge the accontBalanceAfterRecharge to set
     */
    public void setAccontBalanceAfterRecharge(double accontBalanceAfterRecharge) {
        this.accontBalanceAfterRecharge = accontBalanceAfterRecharge;
    }


    /////////////////   end getter setter




    @Override
    public void displayInfo() {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("        Infor about account: " + "         Name: " + name + "      Accont number: " + accountNumber + "      Email: " + email +"     Account balance:  " + accountBlance );
        
    }

    @Override
    public void recharge() {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap vao so tien can nap");
        double recharge = sc.nextDouble();
        accontBalanceAfterRecharge = recharge + accountBlance ;

        System.out.println( " So tien sau khi nap:  " + accontBalanceAfterRecharge);
        System.out.println(" Infor about account after recharge: " + "      Name: " + name + "      Accont number: " + accountNumber + "        Email: " + email +"     Account balance:  " + accontBalanceAfterRecharge);



        
    }

    @Override
    public void changeEmail() {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao email moi: ");
        String newEmail = sc.nextLine();
        
        System.out.println(" Infor about account after change email: " + "      Name: " + name + "      Accont number: " + accountNumber + "        Email: " + newEmail +"      Account balance:  " + accontBalanceAfterRecharge);


        
    }
}
