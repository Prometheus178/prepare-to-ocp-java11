package conclusion.scopeAndLifeCycleVariables;

// область жизни переменной

// LifeCycle life = new LifeCycle();
public class LifeCycle {

    String life;

    {
        String life;
    }

    void foo(){
        String life;

        for (int i = 0; i < 5; i++){
            String lifeInLoop;
        }
    }


}
