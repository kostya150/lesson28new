package lesson28;

import java.util.Comparator;

public class ComparatorDemo {
    Comparator<Capability> comparator = new Comparator<Capability>() {
        @Override
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
