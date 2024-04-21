/**
 * Interface representing a notification service.
 */
interface NotificationService {
    /**
     * Sends a notification.
     *
     * @param message The message to be sent.
     */
    void sendNotification(String message);
}

/**
 * Class representing an email notification service.
 */
class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email notification: " + message);
    }
}

/**
 * Class representing a SMS notification service.
 */
class SMSNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}

/**
 * Class representing a client that uses a notification service.
 */
class NotificationClient {
    private final NotificationService notificationService;

    /**
     * Constructor to initialize the notification service.
     *
     * @param notificationService The notification service to use.
     */
    public NotificationClient(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    /**
     * Sends a notification using the injected notification service.
     *
     * @param message The message to be sent.
     */
    public void sendNotification(String message) {
        notificationService.sendNotification(message);
    }
}

/**
 * A simple demonstration of using NotificationClient with different notification services.
 */
public class Dependency_Inversion_Principle{
    public static void main(String[] args) {
        // Create a notification client with EmailNotificationService
        NotificationClient emailClient = new NotificationClient(new EmailNotificationService());
        emailClient.sendNotification("Hello from Email");

        // Create a notification client with SMSNotificationService
        NotificationClient smsClient = new NotificationClient(new SMSNotificationService());
        smsClient.sendNotification("Hello from SMS");
    }
}

/**
 * This example demonstrates the Dependency Inversion Principle (DIP) by decoupling high-level
 * modules (NotificationClient) from low-level modules (EmailNotificationService, SMSNotificationService)
 * through the use of abstraction (NotificationService interface). The NotificationClient depends
 * on an abstraction (NotificationService), rather than concrete implementations, promoting
 * flexibility, reusability, and ease of testing. This adherence to DIP facilitates easier
 * maintenance and extension, as changes to low-level modules do not impact high-level modules,
 * and vice versa.
 */

