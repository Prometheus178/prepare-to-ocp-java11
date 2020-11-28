package conclusion.fields;

public class Final {

    /* должен быть сразу проинициализирован*/
    final String finalField = "Can not change";

    /* либо проининциализирован в блоке инициализации
    {
        finalField = "Can not change";
    }*/
    /* либо в конструкторе
    Final(){
        finalField = "Can not change";
    }
    */

}
