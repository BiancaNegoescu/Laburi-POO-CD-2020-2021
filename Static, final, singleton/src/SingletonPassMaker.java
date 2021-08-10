public class SingletonPassMaker {
    private final int MAGIC_NUMBER = 9;
    RandomStringGenerator RandStringGen;
    private final String MAGIC_STRING = "abdhofhglt";
    private String name = "bianca";

    private static SingletonPassMaker instance = new SingletonPassMaker();

    private SingletonPassMaker() {}

    public static SingletonPassMaker getInstance() {
        return instance;
    }

    public SingletonPassMaker(String name){
        this.name = name;
    }

    public String getPassword(){
        RandStringGen = new RandomStringGenerator(MAGIC_NUMBER, MAGIC_STRING);
        int l = name.length();
        String s2 = String.valueOf(l).concat("90");
        String s3 = RandStringGen + s2;
        return s3;
    }

    public static void main(String[] args) {
        SingletonPassMaker singleton = SingletonPassMaker.getInstance();
        System.out.println(singleton.getPassword());
    }

}
