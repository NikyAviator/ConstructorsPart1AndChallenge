public class Main {
    public static void main(String[] args) {

        //Account nikysAccount = new Account();//"12345", 0.00, "Niky K", "myemail@niky.com", "0765714566");

        /*System.out.println(nikysAccount.getNumber());
        System.out.println(nikysAccount.getBalance());

        nikysAccount.withdrawal(100);
        nikysAccount.deposit(50);
        nikysAccount.withdrawal(100);
        nikysAccount.deposit(51.50);
        nikysAccount.withdrawal(100);
        System.out.println(nikysAccount.getBalance());

        Account simonsAccount = new Account("Simon", "simon@email.com", "12345");
        System.out.println(simonsAccount.getNumber() + " name " + simonsAccount.getCustomerName());*/

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob",250000);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Niky", 500.00, "niky@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());
    }
}
