package conclusion.inheritance.packageB;

import conclusion.inheritance.packageA.AC;


// невозможно унаследоваться из дефолтного класса другого пакета
//public class ACD extends A {
//}

// наследование из другого пакета, доступен т.к класс объявлен публичным
public class ACD extends AC {
     ACD(int val) {
        super(val);
    }
}
