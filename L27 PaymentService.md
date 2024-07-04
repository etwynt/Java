# PAYMENT SERVICE #
Learning about inheritance, casting and instances. 

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var list = new ArrayList<PaymentService>();

        var sebPaymentService1 = new SebPaymentService();
        list.add(sebPaymentService1);
        sebPaymentService1.currency = "$";
        var sebPaymentService2 = new SebPaymentService();
        list.add(sebPaymentService2);
        sebPaymentService2.currency = "€";

        var swedPaymentService1 = new SwedPaymentService();
        swedPaymentService1.currency = "$";
        list.add(swedPaymentService1);
        var swedPaymentService2 = new SwedPaymentService();
        swedPaymentService2.currency = "€";
        list.add(swedPaymentService2);

        for (var paymentService : list) {
            System.out.println(paymentService.currency);
            paymentService.sendPayment();
            paymentService.printInfo();
        }
    }
}


public class PaymentService{
    public String clientAddress;//IBAN
    public int amount;
    public String description;
    public String currency;

    public void sendPayment() {
        System.out.println("This is a payment to some service");
    }

    public void printInfo(){
        System.out.println("INFO");
    }
}


public class SebPaymentService extends PaymentService {

    @Override
    public void sendPayment() {
        System.out.println("This is a payment to SEB service");
    }

    @Override
    public void printInfo(){
        System.out.println("This is SEB info");
    }
}


public class SwedPaymentService extends PaymentService {

    @Override
    public void sendPayment() {
        System.out.println("This is a payment to Swedbank service");
    }
}
```
