package tech.haowei.sms;

public class TestClient {

    public static void main(String[] args) {

        Client client = new Client();
        client.setAppId("你的开发者id");
        client.setSecretKey("你的开发者密钥");
        client.setVersion("1.0");

        Client.Request request = new Client.Request();
        request.setBizContent("");  // 这里是json字符串，请自行实现!!!
        request.setMethod("sms.template.list");
        System.out.println( client.execute(request) );
    }

}
