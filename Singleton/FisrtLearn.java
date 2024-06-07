

public class FisrtLearn {
    private  static  FisrtLearn instance;
    FisrtLearn(){};

    public static synchronized FisrtLearn getInstance(){
        if(instance==null){
            instance=new FisrtLearn();
        }
        return instance;
    }

    public static void main(String[] args) {
       FisrtLearn f1= FisrtLearn.getInstance();
       FisrtLearn f2= FisrtLearn.getInstance();
       System.out.println(f1==f2);    //true

    }
}
