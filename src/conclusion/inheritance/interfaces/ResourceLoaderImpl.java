package conclusion.inheritance.interfaces;

public class ResourceLoaderImpl implements ResourceLoader {
    @Override
    public String getFile() {
        return "got file";
    }

    @Override
    public void setPath() {
        System.out.println("set path");
    }

    @Override
    public String loader(String s){
        return "overrided";
    }

    public static void print(String t){
        String another = "another ";
        System.out.println(another + t);
    }
}
