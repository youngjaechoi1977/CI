import java.io.IOException;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello,  first time!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
     // �ֻ��� �߰��� ����ó�� ���̺귯��


        // ����â �ȿ��ٰ� �ֱ�
        Runtime runtime = Runtime.getRuntime();

        try{
        	
        	runtime.exec("C:/Program Files/Internet Explorer/iexplore.exe http://www.naver.com");

        } catch(IOException ex) {

        }

    }

}