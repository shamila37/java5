class Company {
    String name;

    public void run(){
        System.out.println("Company!");
    }
}

class CFC extends Company{
    String slogan;

    @Override
    public void run() {
        System.out.println("Cargils Food City!");
    }
}

class Test3{
    public static void main(String[] args) {
        Company c = new CFC();
        c.name = "Cargills pvt ltd.!";
        CFC cfc = (CFC)c;
        cfc.name = "Goldi!";
        cfc.slogan = "Gedara yana gaman!";
        System.out.println(c.name);
        c.run();
        System.out.println(cfc.name);
        System.out.println(cfc.slogan);
        cfc.run();
    }
}
