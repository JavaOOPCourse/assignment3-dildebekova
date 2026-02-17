// StreamingService.java
public class StreamingService extends Service implements PremiumFeature {
    private boolean isPremium = false;

    public StreamingService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
    }

    @Override
    public void performService() {
        if (!isActive) {
            System.out.println("⚠️ Cannot stream: '" + serviceName + "' is inactive.");
            return;
        }
        System.out.println("🎬 Streaming content via '" + serviceName + 
                          (isPremium ? "' [PREMIUM]" : "' [BASIC]"));
    }

    @Override
    public void upgradeToPremium() {
        isPremium = true;
        System.out.println("🌟 '" + serviceName + "' upgraded to PREMIUM: 4K, no ads, offline mode.");
    }
}public class StreamingService extends Service
        implements PremiumFeature {

    // TODO: declare premium field


    // TODO: constructor


    @Override
    public void performService() {

        // TODO:
        // check if service is active
        // print different message for premium and normal

    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // set premium = true
        // print message

    }
}
