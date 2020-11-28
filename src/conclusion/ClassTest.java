package conclusion; // пакет может быть только 1 либо его вообще нет

// 0 или множество импортов

// 1 или множество ссылочных типов (Class, Enum, Interface)
public class ClassTest { // только один публичный класс в 1 файле

    String str = "hello"; // str ссылка на место в памяти где хранится значение
    String str2 = str; // передали переменной ссылку на значение

    // возвращаемый тип долже быть всегда слева от названия метода
    Float foo(){
        return null;
    }
    // ключевые слова могут находиться в разном порядке кроме ТИПА
    final static private  void fooKeyWord(){
    }

    // принимает аргументом только массив строк
    // String[] args
    // String args[]
    // String []args

    public final static void main(String []args) { // может быть final , но лишнее

        int a, b, c = 10;
        // var a , b ,c = 10  множественное истанцирование не поддерживается

        double d = 10_000_000;
        int hex = 0xCAFE_BABE;
        float f = 9898_7878.333_333f;
        int bin = 0b1111_0000_1100_1100;


        //оператор создания говорит JVM создать объект и положить в HEAP (кучу)
        //Все объекты хранятся куче
        Student student = new Student(); // конструктор
        //тип  //название переменной = ссылка
        //ссылки хранятся в Stack (стэке)
        //члены инстанса(экзмпляра) принадлежат только 1 инстансу, а не классу
        student.id = 1;// JVM знает что это ссылочный тип
        Student student2 = student; // оба ссылаются на один и тот же объект в памяти
        student2.id = 2; // 2 переменная поменяла значение у объекта
        // теперь в КУЧЕ   id = 2
        // оба получат результат id = 2

        Student newStudent = new Student(); // новый экземпляр класса
        newStudent.id = 3; // каждый экземпляр класа хранит свое значение

        System.gc(); // позвать уборщик мусора

        // String string =  new Object(); нельзя создать

        // объект мб создан 3 путями через new , сериализацией , клонированием
        Student objectStudent;

        // Cоздание объектов и ссылок на них
        Student stud1 , stud2, stud3 , stud4; // объявлено 4 ссылки
        stud1 = stud2 = new Student(); //создано 1 объект
        stud3 = newStudent; // создан 2 объект

        System.out.println(notFound.toString());
    }

    // TODO: 24.08.2020 Wrappers
    private final static Long notFound = -1L;

}


