package conclusion.promotion;

public class NumericPromotionTest {

    public static void main(String[] args) {
        // приведение по повышению
        byte pByte = 1;
        short pShort = pByte;
        char pChar = 1;
        int pInt;
        pInt = pShort;
        pInt = pChar;
        long pLong = pInt;

        float pFlout;
        pFlout = pInt;  // может потеряться информация
        pFlout = pLong;  // может потеряться информация
        double pDouble ;
        pDouble = pInt; // может потеряться информация
        pDouble = pLong; // может потеряться информация


        // приведение по понижению требует cast
         double rDouble = 1.0;
         float rFloat = (float) rDouble; // может потеряться информация
        long rLong = (long) rFloat;  // может потеряться информация
        int rInt = (int) rLong;
        short rShort = (short) rInt;
        byte rByte = (byte) rShort;
        System.out.println(rByte);
    }
}
