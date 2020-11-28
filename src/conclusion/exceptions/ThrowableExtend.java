package conclusion.exceptions;

import java.io.IOException;

// Можно создавть свой  экспешн унаследовавшисть от Throwable или от его наследников
public class ThrowableExtend extends Throwable {
}

class ExceptionExtend extends Exception{
}

class RuntimeExceptionExtend extends RuntimeException{
}

class IOExceptionExtend extends IOException{

}