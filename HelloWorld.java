import java.io.IOException;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello,  first time!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
     // 최상위 추가할 예외처리 라이브러리


        // 메인창 안에다가 넣기
        Runtime runtime = Runtime.getRuntime();

        try{
        	
        	runtime.exec("C:/Program Files/Internet Explorer/iexplore.exe http://www.naver.com");

        } catch(IOException ex) {

        }

    }

}