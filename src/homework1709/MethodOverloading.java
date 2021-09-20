package homework1709;

public class MethodOverloading {
    public String name;
    public int age;

    public void returnName() {
        System.out.println(" I don't know this name");

    }
    public String returnName (String name, int age) {
        this.name=name;
        return name;
    }
/*При создании методов с одинаковым названиемб одинаковыми
параметрами и одинаковым их расположением получаем ошибку:
изменение настроек намерения
 */
    public int returnName (String name,int age) {
        this.age = age;
        return age;
    }

}
