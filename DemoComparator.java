package lesson28;

import java.util.*;

public class DemoComparator {
    public static void main(String[] args) {
        Capability capability2 = new Capability(1005, "test", "rrrr", false, new Date());
        Capability capability4 = new Capability(900, "test", "rrrr", false, new Date());
        Capability capability3 = new Capability(900, "test", "rrrr", true, new Date());
        Capability capability1 = new Capability(1001, "test", "rrrr", true, new Date());




        ArrayList<Capability> capabilities = new ArrayList<>();
        capabilities.add(capability1);
        capabilities.add(capability2);
        capabilities.add(capability3);
        capabilities.add(capability4);

        capabilities.sort(new IsActiveComparator());
        System.out.println(capabilities);

        /*Comparator<Capability> comparator = new Comparator<Capability>() {
            @Override*/
            public int compare(Capability o1, Capability o2) {
                // если ChannelName не равно - сравниваю по нему+
                // если равно - перехожу к fingerPrint+
                // если fingerPrint не равно - сравниваю по нему+
                // если равно - перехожу к DateCreated+
                // если DateCreated не равно - сравниваю по нему
                // если равно - объекты равны - return 0;
                if(!o1.getChannelName().equals(o2.getChannelName())){
                    return o1.getChannelName().compareTo(o2.getChannelName());
                }
                else
                if(!o1.getFingerprint().equals(o2.getFingerprint())){
                    return o1.getFingerprint().compareTo(o2.getFingerprint());
                }
                else
                if(!o1.getDateCreated().equals(o2.getDateCreated())){
                    return o1.getDateCreated().compareTo(o2.getDateCreated());}
                else
                    return 0;

            }
        };


    }
}

