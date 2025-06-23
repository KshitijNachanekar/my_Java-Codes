public class SingletonExamp {
    private static SingletonExmp str;
    private SingletonExamp(){}
    public static SingletonExmp getSingleInstance(){
        if(str == null){
            synchronized (SingletonExmp.class){
                if(str == null){
                    str= new SingletonExmp();
                }
            } 
        }
        return str;
    }
     public void DisplayMsg(){
        System.out.println("str info");
    }
}
