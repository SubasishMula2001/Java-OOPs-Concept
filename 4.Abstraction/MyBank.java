interface MyBank {
    void write();
    void read();
    // declares only
}

class SBI implements MyBank {
    @Override
    public void write() {
        System.out.println("Sbi write");
    }
    @Override
    public void read() {
        System.out.println("Sbi read");
    }
}
