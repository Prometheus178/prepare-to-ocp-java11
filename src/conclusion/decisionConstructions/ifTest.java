package conclusion.decisionConstructions;

class ifTest {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        if (b2 = b1 != b2){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public void ifTest(boolean flag) {
        if (flag)   //1
            if (flag)   //2
                System.out.println("True False");
            else        // 3
                System.out.println("True True");
        else        // 4
            System.out.println("False False");
    }

    void foo() {

        boolean a = true;
        boolean b = false;
        if (a = b) ; // валидно тк здесь присвоили одно значение к другому

        if (true) ; // может принять булево значений или ссылочный тип которорый возвращвет булево

        if (true) ;  // строка заканичвается ;
        else ;

        if (true) ;
        if (false) ;
        else ; // ассоциируется с ближайшим if
    }

}
