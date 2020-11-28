package conclusion.types;

public class PrimitiveInitialization {
    float  myFloat  = (float) 199.99;
    // Валидно
    int a=100, b, c;
    int d, e, f=100;
    int aa, bb, cc;

    void foo(){
    int aa, bb, cc;
    aa = bb = cc = 100; // не валидно для членов класса
    }


    void variableReading(){
        float myFloat1 = 199.99F;

        float myFloat2 = myFloat1;           // right hand side value in assignment

        float myFloat3 = (float) (myFloat2 + 123.45);
        float myFloat4 =  myFloat2 + 123.45F;
    }
}


