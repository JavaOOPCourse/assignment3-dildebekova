// ConsultationService.java
public class ConsultationService extends Service implements Billable {
    private int sessionDurationMin = 30;

    public ConsultationService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
    }

    @Override
    public void performService() {
        if (!isActive) {
            System.out.println("⚠️ Cannot start consultation: '" + serviceName + "' is inactive.");
            return;
        }
        System.out.println("💬 Starting " + sessionDurationMin + "-min consultation via '" + serviceName + "'");
    }

    @Override
    public void generateBill() {
        double price = sessionDurationMin * 2.5;
        System.out.println("🧾 Bill for '" + serviceName + "': $" + 
                          String.format("%.2f", price) + " (" + sessionDurationMin + " min × $2.50)");
    }
}
