package conclusion.modules;

public class ModuleTest {

    // Преимущество модулей
    /*
    инкапусулирует пакеты
    надежный механизм, позволяющий компонентам приложения указывать свои зависимости друг от друга.
    позволяет указать сервисы и заявить о зависимости от них.
     */
    // Название модулей

    // Валидно
    // com.amazing.movierentals
    // com.amazing.$movierentals
    // no1movierentals

    // не валидно с  - и начинаться с 1(цифры)

    // run a modular application

    // -p c:\modules\movies.jar
    // -p c:\modules
    // --module-path c:\modules

/*
 Module options applicable for java as well as javac:
 --module or -m : used to run or compile only the specified module.
 --module-path or -p: used to specify the paths where java or javac will look for module definitions.

 Module options applicable only for javac:
 --module-source-path has no shortcut. Used by javac to look for source module definitions.
 -d:  used to specify output directory where the class files will be created after compilation.

 Module options applicable only for java:
 --list-modules has no shortcut. It lists observable modules and exits.
 --show-module-resolution has no shortcut. It shows module resolution output during startup.
 --describe-module or -d: It describes a module and exits.
 */
}
