package conclusion.creating;

class Triangle{
    public int base;
    public int height;

    // инициировать сразу
    private final double ANGLE;
    {
        // либо в блоке инициализации
    //    ANGLE = 1;
    }
    Triangle(){
        // либо в конструкторе
        ANGLE = 2;
    }

    public  void setAngle(double a){
      //  ANGLE = a;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.setAngle(90);
    }
}