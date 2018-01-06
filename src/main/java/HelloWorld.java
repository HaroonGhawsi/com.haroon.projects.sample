/**
 * Created by HaroonGhawsi on 1/6/2018.
 */
public class HelloWorld {

    private String myName;
    private String myMsg;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getMyMsg() {
        return myMsg;
    }

    public void setMyMsg(String myMsg) {
        this.myMsg = myMsg;
    }

    public static void main(String[] args){

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMyName("Haroon");
        helloWorld.setMyMsg("says I am coming back!");

        System.out.println(helloWorld.getMyName() + " " + helloWorld.getMyMsg());
    }
}
