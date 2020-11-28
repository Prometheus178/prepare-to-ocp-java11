package conclusion.inheritance.check;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class Base {
    public List<CharSequence> transform(Set<CharSequence> list) {
        return null;
    }

}

class Derived extends Base {

    @Override
    public ArrayList<CharSequence> transform(Set<CharSequence> id) {
        return null;
    }
}
