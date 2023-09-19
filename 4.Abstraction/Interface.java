interface Bank { // by default public static final hota hai
    void sbi(); // abstract and public 
    void pnb();
}
public class Loan implements Bank{
    public void sbi() {
        System.out.println("SBI Loan");
    }
    public void pnb() {
        System.out.println("PNB Loan");
    }
    public static void main(String []args) {
        Loan l = new Loan();
        l.sbi();
        l.pnb();
    }
}
