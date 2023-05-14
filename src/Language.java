public class Language {
    String languages;

    Language(String a){
        languages = a;
        System.out.println("Language is "+languages);
    }

    public static void main(String[] args) {

        Language var1 = new Language("Sinhala");
        Language var2 = new Language("English");
        Language var3 = new Language("Tamil");
    }
}
