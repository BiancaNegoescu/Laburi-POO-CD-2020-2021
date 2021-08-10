public class PasswordMaker {
    private final int MAGIC_NUMBER = 9;
    RandomStringGenerator RandStringGen;
    private final String MAGIC_STRING = "abdhofhglt";
    private String name ;

    public PasswordMaker(String name){
        this.name = name;
    }

    public String getPassword(){
        RandStringGen = new RandomStringGenerator(MAGIC_NUMBER, MAGIC_STRING);
        int l = name.length();
        String s2 = String.valueOf(l).concat("90");
        String s3 = RandStringGen + s2;
        System.out.println(s3);
        return s3;
    }

    public static void main(String[] args) {
        PasswordMaker passmaker = new PasswordMaker("bianca");
        passmaker.getPassword();
    }

}
