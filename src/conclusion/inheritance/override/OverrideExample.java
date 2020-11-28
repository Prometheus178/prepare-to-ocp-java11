package conclusion.inheritance.override;

class Override1 {

    String str = null;
    int anInt;
    Integer integer;


    protected void setStr(String s) {
        this.str = s;
    }

    public void setAnInt(int i){
        this.anInt = i;
    }

    public void setInteger(Number integer) {
        this.integer =(Integer) integer;
    }

    public Number getInteger() {
        return integer;
    }
}

public class OverrideExample extends Override1 {
    // переопределяемые методы должны быть именно этого типа
    String str;
    @Override
    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public void setAnInt(int i) {
       this.anInt = i;
    }

    @Override
    public void setInteger(Number i){
        this.integer = (Integer) i;
    }

    @Override
    public Integer getInteger() {
        return integer;
    }
}
