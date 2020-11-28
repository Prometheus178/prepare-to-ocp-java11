package conclusion.inheritance.packageA;

// не доступен для наследования для классов из других пакетов
class A {
    int aValue;

    // конструкторы НЕ наследуются
    //наследники обязаны его переопределить
    A(int val) {
        this.aValue = val;
    }
}

