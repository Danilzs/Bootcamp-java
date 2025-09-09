
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Manager manager = new Manager();

        manager.setName("Daniel");
        manager.setLogin("Daniel");
        manager.setPassword("1234567");

        System.out.println(manager.getName());
        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());
        }
    }
