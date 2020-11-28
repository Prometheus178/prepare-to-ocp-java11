package conclusion.exceptions;

public interface Exceprtion< T, R> {


    R read(T t) throws Throwable;
}
