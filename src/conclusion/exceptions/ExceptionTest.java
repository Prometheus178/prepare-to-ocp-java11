package conclusion.exceptions;

import java.io.IOException;

public class ExceptionTest implements Exceprtion<String, String>{

    @Override
    public String read(String s) {
        return null;
    }

    ExceptionTest() throws Exception{  // можно бросать из конструктора
    }

    void fooTryCatchFinally() {
        try {
            throw new IOException(); // после эксепшена не выполнится код следующий за ним
            //throw new RuntimeException();
        } catch (Throwable e) {// обязательно должен быть объявлен Throwable или наследник
        } finally {
            // выполнинтся в любом случае кроме если вызван System.exit(0)
        }
    }

    void fooFinallyNotWork() throws Exception { // можно бросать из метода
        try {
            System.exit(0);  // можно объявить здесь
        } catch (Throwable e) {
            System.exit(0);  // можно объявить здесь
        } finally {
            // не выполнится
        }
    }

    void fooTryFinally() {
        try {
        } finally {
        }
    }

    void fooMultiCatch() {
        try {
            throw new IOException();
        } catch (IOException ex) {
            throw new RuntimeException(); // этот эксепшн не поймает никто за этим catch
            // 1 от наследника к родителю
        } catch (Exception e) {
            // 2
        }
    }

    void fooMultiCatch2() {
        try {
            throw new IOException();
        } catch (ArithmeticException | IOException e) { // должно быть на одном уровне иерархии
        }
    }
}
