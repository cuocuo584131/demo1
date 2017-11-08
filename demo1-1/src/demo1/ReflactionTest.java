package demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflactionTest{  
        public static void main(String[] args) {  
            Scanner scanner = new Scanner(System.in);  
            String name = scanner.next();  
              
            try{  
                Class c1 = Class.forName(name);  
                Class superCl = c1.getSuperclass();  
                System.out.println("superClass"+superCl.getName());  
                String modifilter = Modifier.toString(c1.getModifiers());  
                System.out.println("modifiers:" + modifilter );  
                  
                printContruct(c1);  
            }catch(ClassNotFoundException e){  
                e.printStackTrace();  
            }  
            System.exit(0);  
        }  
          
        public static void printContruct(Class c1){  
            System.out.println("*********打印Constructor*********");  
            Constructor[] construct = c1.getConstructors();  
            for (Constructor c : construct) {  
                System.out.println("该构造方法所属类：" + c.getName());  
                System.out.println("使用Modifier类:" +Modifier.toString(c.getModifiers())  );  
                Class[] paramTypes = c.getParameterTypes();  
      
                for (Class class1 : paramTypes) {  
                    System.out.println("参数类型："+class1.getName());  
                }  
                System.out.println("toString方法：" + c.toString());  
            }  
              
        }  
          
        public static void printField(Class c1) throws IllegalArgumentException, IllegalAccessException{  
              
            System.out.println("*********打印Field*********");  
            Field[] fields = c1.getFields();  
            for (Field field : fields) {  
                System.out.println("获取所属类：" +field.getName());  
                System.out.println(Modifier.toString(field.getModifiers()));  
                System.out.println("获取type" + field.getType());  
                Object b = new ReflactionTest();  
                System.out.println("get()方法做什么用的："+field.get(b));//对应还有getDouble(),getInt()....  
            }  
        }  
          
        public static void printMethod(Class c1){  
      
            System.out.println("*********打印Method*********");  
            Method[] method = c1.getDeclaredMethods();  
            for (Method m : method) {  
                System.out.println(m.getName());  
                System.out.println(m.getReturnType());//获取返回类型  
               // m.invoke(obj, args)//允许调用包装在Method对象中的方法。  
            }  
        }  
          
    }  
