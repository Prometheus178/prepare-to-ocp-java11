package conclusion.abstractClass;

public abstract class SuperAbstract {

    abstract void superProcess();

    String superResult(){
        return "SuperAbstract";
    }

    String result(){
        return "SuperAbstractResult";
    }
}

abstract class SubClass extends SuperAbstract{

    abstract void subProcess();

    String subResult(){
        return "SubAbstract";
    }

    String result(){
        return "SubAbstractResult";
    }
}

class ClassImpl extends SubClass{

   /*
    * переопределить все абстрактные методы
    */
    @Override
    void superProcess() {

    }

    @Override
    void subProcess() {

    }

}
