/*
*  2019 
*/
package pattern.adapter.example;




public class TestAdapter {

    public static void main(String[] args) {

        GBSocketInterface gbSocket = new GBSocket();

        Hotel hotel = new Hotel();

        SocketAdapter socketAdapter = new SocketAdapter(gbSocket);

        hotel.setSocket(socketAdapter);

        hotel.charge();
    }
}