package conclusion.inheritance.override;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class OverrideCheck {


    class A{
        public <T extends CharSequence> Collection<String> transform(Collection<T> list)    {       return new ArrayList<String>();    }
    }

    class B extends A{
      public <T extends CharSequence> Collection<String> transform(Collection<T> list) { return new HashSet<String>(); };
//        public <T extends CharSequence> List<T> transform(Collection<T> list) { return new ArrayList<T>(); };
    }
}
