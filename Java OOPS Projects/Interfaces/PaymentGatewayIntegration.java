package com.Interfaces;

interface PaymentGateway {
    void processPayment(double amount);
    void refundPayment(double amount);
}

class Stripe implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding payment of $" + amount + " through Stripe.\n");
    }
}

class PayPal implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal.");
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding payment of $" + amount + " through PayPal.\n");
    }
}

public class PaymentGatewayIntegration {
    public static void main(String[] args) {
        PaymentGateway stripeGateway = new Stripe();
        PaymentGateway payPalGateway = new PayPal();

        stripeGateway.processPayment(100.50);
        stripeGateway.refundPayment(50.25);

        payPalGateway.processPayment(200.75);
        payPalGateway.refundPayment(100.50);
    }
}

