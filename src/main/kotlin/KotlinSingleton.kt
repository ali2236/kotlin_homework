
object KotlinSingleton {

    var myProperty : String? = null
    
}

/*
final public class JavaSingleton {

    private static JavaSingleton _instance;

    public static JavaSingleton getInstance(){
        if(_instance == null){
            _instance = new JavaSingleton();
        }
        return  _instance;
    }

    private JavaSingleton(){}

    private String myProperty;

    public String getMyProperty() {
        return myProperty;
    }

    public void setMyProperty(String myProperty) {
        this.myProperty = myProperty;
    }
}

 */