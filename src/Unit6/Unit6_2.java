package Unit6;

    class Unit6_2 {
    static class Person{
        String name;
        int age;
        public Person(String name,int x){
            this.name = name;
            age = x;//static 方法不能引用 this 或 super 关键字，因为它们代表的是具体的实例，而静态方法并不隶属于任何实例。所以如果我在上面写的是this.name=name就一定要
        }
        @Override
        public String toString(){
            return "name:"+name+"age:"+age;//static 方法不能引用 this 或 super 关键字，因为它们代表的是具体的实例，而静态方法并不隶属于任何实例。
        }
    }
    public static void main(String[] Ages){
        Person person1 = new Person("ddd",18);
        System.out.println(person1);
        System.out.println(person1.toString());
    }
}
