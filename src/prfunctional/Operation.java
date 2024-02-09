package prfunctional;

@FunctionalInterface
public interface Operation {
    float interfazStaticMethod();

    private void interfacePrivateMethod(){
        System.out.println("LLamando al método privado de una interfaz");
        interfaceDefaultMethod();
    }

    static void interfaceStaticMethod(){
        System.out.println("LLamando al método estático de una interfaz");
    }

    default void interfaceDefaultMethod(){
        interfacePrivateMethod();
        interfaceStaticMethod();
        System.out.println("Llamando al método default de una interfaz");
    }
}
