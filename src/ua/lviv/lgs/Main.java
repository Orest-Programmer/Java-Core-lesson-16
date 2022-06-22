package ua.lviv.lgs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        Class sc = Student.class;

        System.out.println();

        String name = sc.getName();
        System.out.println("Name of class - "+ name);

        String simpleName = sc.getSimpleName();
        System.out.println("\nSimple name of class - "+ simpleName);

        int modifier = sc.getModifiers();
        String textModifier = Modifier.toString(modifier);
        System.out.println("\nModifier class - "+ textModifier);

        Package classPackage = sc.getPackage();
        System.out.println("\nClass packege - "+ classPackage);

        Constructor<Student>[] classConstructor = sc.getConstructors();
        System.out.println("");
        for (int i = 0; i<classConstructor.length; i++){
            Constructor<Student> constructor = classConstructor[i];
            System.out.println("Constructor item - "+ constructor);
        }

        System.out.println("");

        Constructor<Student> constructor = classConstructor[0];
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++){
            Class<?> class1 = parameterTypes[i];
            System.out.println("Parameter of class - "+ class1);
        }

        System.out.println("");

        Field[] classField = sc.getDeclaredFields();
        for (int i = 0; i < classField.length; i++){
            Field field = classField[i];
            System.out.println("Class field - "+ field);
        }

        Method[] classMethod = sc.getMethods();
        for (int i = 0; i < classMethod.length; i++){
            Method method = classMethod[i];
            System.out.println("Class method - "+ method);
        }

    }
}
