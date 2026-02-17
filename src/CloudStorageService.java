// CloudStorageService.java
public class CloudStorageService extends Service implements PremiumFeature, Billable {
    private boolean isPremium = false;
    private double usageGB = 15.5;

    public CloudStorageService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
    }

    @Override
    public void performService() {
        if (!isActive) {
            System.out.println("⚠️ Cannot access storage: '" + serviceName + "' is inactive.");
            return;
        }
        System.out.println("☁️ Syncing files with '" + serviceName + 
                          (isPremium ? "' [PREMIUM: 2TB]" : "' [BASIC: 10GB]"));
    }

    @Override
    public void upgradeToPremium() {
        isPremium = true;
        System.out.println("🌟 '" + serviceName + "' upgraded to PREMIUM: extended storage, priority support.");
    }

    @Override
    public void generateBill() {
        double price = isPremium ? usageGB * 0.15 : usageGB * 0.10;
        System.out.println("🧾 Bill for '" + serviceName + "': $" + 
                          String.format("%.2f", price) + " (used: " + usageGB + " GB)");
    }
}
