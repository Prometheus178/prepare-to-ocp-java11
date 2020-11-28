package conclusion.inheritance.packageA;
// можно расширить модификатор и унаследоваться из другого пакета
public class AC extends A {

    // если у родителя есть конструктор то наследник ОБЯЗАН его переопредлить
    public AC(int val) {
        super(val);
    }
}
