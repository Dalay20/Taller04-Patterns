package com.mycompany.taller04;

public class EmailNotification implements Notification {
    private String emailServidor;

    public EmailNotification(String emailServidor) {
        this.emailServidor = emailServidor;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando email: " + mensaje);
    }
}
