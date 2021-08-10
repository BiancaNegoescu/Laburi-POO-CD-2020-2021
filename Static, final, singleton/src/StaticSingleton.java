public class StaticSingleton {
    private final int MAGIC_NUMBER = 9;
    RandomStringGenerator RandStringGen;
    private final String MAGIC_STRING = "abdhofhglt";
    private String name = "bianca";
    private static int instanceCount = 0;

    private static StaticSingleton instance = null; //eager init

    private StaticSingleton() {}

    public static StaticSingleton getInstance() {
        if (instance == null) {
            instance = new StaticSingleton();
            instanceCount++;
            System.out.println(instanceCount);
        }
        return instance;
    }

    public StaticSingleton(String name){
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
        StaticSingleton singleton = StaticSingleton.getInstance();
        System.out.println(singleton.getPassword());
        StaticSingleton singleton2 = StaticSingleton.getInstance();
        StaticSingleton singleton3 = StaticSingleton.getInstance();
    }
}
