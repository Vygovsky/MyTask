package sapper;


public enum Box {
    ZERO,
    NUM1,
    NUM2,
    NUM3,
    NUM4,
    NUM5,
    NUM6,
    NUM7,
    NUM8,
    BOMB,

    OPENED,
    CLOSED,
    FLAGED,
    BOMBED,
    NOBOMB;
    public Object image;

    Box getNumberBox() {
        return Box.values()[this.ordinal() + 1];
    }

    public int getNumber() {
        int numb = ordinal();
        if (numb >= Box.NUM1.ordinal() && numb <= Box.NUM8.ordinal()) {
            return ordinal();
        }
        return -1;
    }
}

