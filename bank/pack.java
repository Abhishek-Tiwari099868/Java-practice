package bank;

class Account{
    public String name;
    protected String email;
    private String password;
     //to access password we need to create getter and setter methods
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
}

public class pack {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.name = "Savings Account";
        acc1.email = "savings@example.com";
        acc1.setPassword("abcd");
        System.out.println(acc1.getPassword());
       

        
    }
    
}
