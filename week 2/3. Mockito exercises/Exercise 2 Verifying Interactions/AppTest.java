package com.example.notificationservice;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class AppTest {

    @Test
    public void testSendNotification_VerifyInteraction() {
        // Arrange: Create a mock EmailSender
        EmailSender emailSenderMock = mock(EmailSender.class);

        // Arrange: Create NotificationService with the mock
        NotificationService notificationService = new NotificationService(emailSenderMock);

        String user = "test@example.com";
        String content = "Your password has been reset.";

        // Act: call sendNotification
        notificationService.sendNotification(user, content);

        // Assert: verify that sendEmail was called correctly
        verify(emailSenderMock).sendEmail(eq(user), eq("Dear " + user + ", " + content));

        System.out.println(">>> Interaction verified successfully.");
    }
}
