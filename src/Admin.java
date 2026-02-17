// Admin.java
public class Admin extends User {
    public Admin(String name, int userId) {
        super(name, userId);
    }

    @Override
    public void manageService(Service s) {
        System.out.println("🔧 Admin '" + name + "' managing service: '" + s.getServiceName() + "'");
        if (!s.isActive()) {
            System.out.println("   → Service is currently inactive.");
        }
    }

    @Override
    public void useService(Service s) {
        System.out.println("⚙️ Admin '" + name + "' accessing service: '" + s.getServiceName() + "'");
        s.performService();
    }
}
