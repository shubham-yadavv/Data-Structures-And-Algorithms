class Employee{

    int id;
    String name;
    static String company = "google";

    Employee(int id, String name){
        this.id = id;
        this.name = name;

    }

    void display(){
        System.out.println(id +" "+ name+" " + company);

    };

}


public class test {
    public static void main(String[] args) {
        Employee e = new Employee(2,"shubh");
        e.display();
        
    }
    
}
