package conclusion.scopeAndLifeCycleVariables;

public class Scope {

    // у  переменных 3 области видимости
    String sameName;
    int a ;

    {
        String sameName;
        a = 10; // доступен

    }

    void Foo() {
        String sameName;
        a = 10; // доступен
    }

    private int j;


}
