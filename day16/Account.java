public class Account {
    private long acc_no;
    private String name, email;
    private float amount;

    public long getAcc() {
        return acc_no;
    }

    public void setAcc(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public static void main(String[] args) {
        Account acc = new Account();

        acc.setName("Papa GK");
        acc.setEmail("GK696902@gmail.com");
        acc.setAcc(123123);
        acc.setAmount(10000);

        System.out.println(acc.getName());
        System.out.println(acc.getEmail());
        System.out.println(acc.getAcc());
        System.out.println(acc.getAmount());
    }
}
