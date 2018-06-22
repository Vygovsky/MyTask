package serialaz.serial;

import java.io.Serializable;

public class Hero implements Serializable {
    int level;
    transient Sword sword;
}
