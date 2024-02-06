import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.Client;

public class ClientServerTest {
    @Test
    public void test() {
        assertEquals(2, 1+1);
    }

    @Test
    public void serverClientTest() {
        Client client = new Client();
        try {
            client.startConnection("127.0.0.1", 6666);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        String response = "";
        try {
            response = client.sendMessage("hello server");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        assertEquals("hello client", response);
    }
}