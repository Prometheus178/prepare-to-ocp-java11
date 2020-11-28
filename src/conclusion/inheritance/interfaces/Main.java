package conclusion.inheritance.interfaces;

public class Main {

    public static void main(String[] args) {
        ResourceLoaderImpl resourceLoaderImpl = new ResourceLoaderImpl();

        resourceLoaderImpl.getFile();
        resourceLoaderImpl.setPath();
        String resource = resourceLoaderImpl.loader("Implementation");
        System.out.println(resource);

        ResourceLoader resourceLoader = new ResourceLoaderImpl();
        String resourceInt =  resourceLoader.loader("Interface");
        System.out.println(resourceInt);

        ResourceLoader.print("hello");
        resourceLoaderImpl.print("hello");

       /* SuperInterface superInterface = new SuperInterfaceImpl();
        superInterface.sayHello("Serg");
        superInterface.saySomething("aloha");

        SuperInterface subInterface2 = new SubInterfaceImpl();
        subInterface2.sayHello("Serg");
        subInterface2.saySomething("aloha");*/

    }


}
