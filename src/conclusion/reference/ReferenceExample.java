package conclusion.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ReferenceExample {

    public static void main(String[] args) {


        Object object = new Object();
        SoftReference<Object> softReference = new SoftReference<Object>(object);
        WeakReference<Object> weakReference = new WeakReference<Object>(object);
        PhantomReference<Object> phantomReference = new PhantomReference<>(object, new ReferenceQueue<>());
    }
}
