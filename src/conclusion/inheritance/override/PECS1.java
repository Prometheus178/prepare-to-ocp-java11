package conclusion.inheritance.override;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public interface PECS1 {

    List<? super Integer> getSum(int a, int b);
}

interface PECS2 {


    List<? extends Number> getSum(double a, double b);
}

class PECS1Test implements PECS1 {

    //  ? super Integer
    // не ниже по иерархии Integer
    // но и не другие типы наследники родителя Integer
    // возможно повысить иерархию возвращаемого типа дженерика
    @Override
    public List<? super Integer> getSum(int a, int b) {
        return new ArrayList<>();
    }
//    @Override
//    public List<Double> getSum(int a , int b){
//        return new ArrayList<>();
//    }
    //  @Override
//    public List<Number> getSum(int a, int b){ // валидно
//        return new ArrayList();
//    }
//    @Override
//    public List<Serializable> getSum(int a, int b) {
//        return new ArrayList();
//    }

//    // может принять выше Number по иерархии либо Number
    //  @Override
//    public List<? super Number> getSum(int a, int b) {
//        List<Number> listInt = new ArrayList();
//        return listInt;
//    }
 
}

class PECS2Test implements PECS2 {

    //  ? extends Number
    // не выше по иерархии Number
    // возможно понизить иерархию возвращаемого типа дженерика

    // @Override
//    public List<? extends Double> getSum(double a, double b) {
//        return new ArrayList<>();
//    }

//    public List<Number> getSum(double a, double b) {
//        return new ArrayList<>();
//    }

    //@Override
//    public List<? extends Number> getSum(double a, double b) {
//        return null;
//    }

    @Override
    public List<Integer> getSum(double a, double b) {
        return new ArrayList<>();
    }
}
