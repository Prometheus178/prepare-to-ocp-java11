package conclusion.inheritance.interfaces;

public interface ResourceLoader {

    String getFile();

    void setPath();

    default String loader(String source){
        return source;
    }

    // совпадение сигнатуры метода не допустимо
//    String loader(String s);

//   static String loader(String source){
//        return null;
//   }

    static void print(String text){
        System.out.println(text);
    }
}
