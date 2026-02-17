// Customer.java
public class Customer extends User {
    public Customer(String name, int userId) {
        super(name, userId);
    }

    @Override
    public void manageService(Service s) {
        System.out.println("⚠️ Customer '" + name + "' cannot manage '" + s.getServiceName() + "': insufficient permissions.");
    }

    @Override
    public void useService(Service s) {
        System.out.println("👤 Customer '" + name + "' using service: '" + s.getServiceName() + "'");
        if (s.isActive()) {
            s.performService();
        } else {
            System.out.println("   → Cannot use inactive service.");
        }
    }
}
