public class Main801 {
    public static void main(String[] arg) {
        Account account = new Account();
        account.setName("nguyen thanh tung");
        account.setAccountNumber(123456789);
        account.setEmail("tngthanh62@gmail.com");
        account.setAccountBlance(12000);

        account.displayInfo();
        account.recharge();
        account.changeEmail();


    }
}
