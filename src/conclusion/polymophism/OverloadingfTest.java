package conclusion.polymophism;

// статический полиморфизм
public class OverloadingfTest {
    // на перегрузку влияет только сигнатура методов , что значит порядок параметров или его тип
    void test(int a){}

//    int test(int a, int b){
//        return a+ b;
//    }

    int test(Integer a , Integer b){
        return a * b;
    }
    float test(float a, int b){
        return a * b;
    }


    public static void main(String[] args) {
        OverloadingfTest overloadingfTest = new OverloadingfTest();

        // будет вызван самый подходящий по сигнатуре метод
        // если стоит выбор между оберткой либо притивом будет выбран примитив
        overloadingfTest.test(1 , 2);
    }

}
