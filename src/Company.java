public class Company {
    String BrandName;
    Company(){
        BrandName = "Apple";
    }

    public static void main(String[] args) {
        Company B = new Company();
        System.out.println(B.BrandName);
    }
}
