package conclusion.stringAPI;

public class TestString {
//public class TestString extends String{  Стринг класс final

    public static void main(String[] args) {
        String a = new String("hello"); // создается 2 объекта 1 хранится в куче другой в стринг пуле
        String ab = "he";
        String bc = "llo";
        String abc = ab + bc;

        // хранятся отдельно в куче в StringPool
        String b = "hello";
        String c = "hello";

        //  "==" для сравнения ссылок
        // "equals()" для сравнения значений

        System.out.println(a == b); // false
        System.out.println(a.intern() == b); // true    через метод intern делает запрос в стринг пул и сравнивает значения есть или нет

        System.out.println(b == abc); //false
        System.out.println(b == abc.intern()); //true

        System.out.println(b == c); // true


        String stringInteger = "12";
        String concatString = "1";
        concatString += 2;

        System.out.println(concatString == stringInteger); //false
        System.out.println(concatString.intern() == stringInteger); //true

        int concatInt = 1;
        // concatInt += "1"; не валидно

        // как работает
        String abcd = ""; // ссылка на пустую строку
        System.out.println(abcd.concat("abc")); // вернет ссылку на новый объект
        System.out.print(abcd); //ссылка на пустую строку осталась прежней

        //  ЛОКАЛЬНЫЕ переменные строят из массива строку
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd'};
        String newStr = "";
        for (char ch : myCharArr) {
            newStr = newStr + ch;
        }
        boolean b1 = newStr == myStr; // false создан через конкатанацию значит имеет 2 объекта в куче
        boolean b3 = newStr.intern() == myStr; //true можно достучаться до значение через метод intern()
        boolean b2 = newStr.equals(myStr); //true
        System.out.println(b1 + " " + b3 + " " + b2);
        fooEqualSB();
    }

    static void fooEqualSB() {

        StringBuilder sb = new StringBuilder();

        String str1 = sb.toString(); // toString() возвращает всегда новое значение
        String str2 = sb.toString();
        System.out.println(str1 == str2); //false
        String str3 = str2; // ссылается на одно и тоже значение
        System.out.println(str2 == str3);  // true
    }

}
