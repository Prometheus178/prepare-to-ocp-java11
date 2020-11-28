package conclusion.inferenceORvar;

// var это НЕ ТИП это сокращение
public class Inference {
    // var a ; не валидно для класса
    // static var = 10; не валидно для статика
    // void foo(var a){}    не валидно для аргумента метода
     // var[] array = new int[5]; //  не валидно

    Inference() { // не валидно аргументом конструктора
        var variable = 1; // нужно сразу проинициализировать
        // var b = null; не может быть проинициализирован NULL
    }

    void foo() {
        var a = 10;//ok
        //var b, c ,d = 20;  не поддерживает
        for (var i = 0; i < 10; i++) {//ok

        }
    }

    void bar() {
        // TODO: 24.08.2020 пример для switch с var
        // switch ()

    }


}
