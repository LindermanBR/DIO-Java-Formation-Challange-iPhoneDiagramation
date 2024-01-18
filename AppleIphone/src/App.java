
import model.IPhone;
import model.Macintosh128k;
import model.StarTAC338;
import model.IPod;

public class App {
    public static void main(String[] args) throws Exception {
        IPod ipod = new IPod();
        Macintosh128k mac = new Macintosh128k();
        StarTAC338 startac = new StarTAC338();
        IPhone iphone = new IPhone();

        System.out.println("iPod:");
        ipod.play();
        ipod.pause();
        ipod.selectMusic();
        System.out.println("--------------------");

        System.out.println("Macintosh:");
        mac.displayPage();
        mac.addNewTab();
        mac.updatePage();
        System.out.println("--------------------");

        System.out.println("StarTAC338:");
        startac.call();
        startac.answer();
        startac.startVoiceMail();
        System.out.println("--------------------");

        System.out.println("IPhone:");
        iphone.play();
        iphone.pause();
        iphone.selectMusic();
        iphone.displayPage();
        iphone.addNewTab();
        iphone.updatePage();
        iphone.call();
        iphone.answer();
        iphone.startVoiceMail();
        System.out.println("--------------------");

    }
}
