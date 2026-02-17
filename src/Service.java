// Service.java
public abstract class Service {
    protected String serviceName;
    protected int serviceId;
    protected boolean isActive;

    public Service(String serviceName, int serviceId) {
        this.serviceName = serviceName;
        this.serviceId = serviceId;
        this.isActive = false;
    }

    public void activateService() {
        isActive = true;
        System.out.println("✅ Service '" + serviceName + "' activated.");
    }

    public void deactivateService() {
        isActive = false;
        System.out.println("❌ Service '" + serviceName + "' deactivated.");
    }

    public abstract void performService();

    public String getServiceName() {
        return serviceName;
    }

    public boolean isActive() {
        return isActive;
    }
}
