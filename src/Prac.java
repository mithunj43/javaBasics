class Singleton{
    private static Singleton singleton;
    private Singleton(){
    }
    public static Singleton getSingleton(){
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }

}

public class Prac{
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton);
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton1 );
    }
}