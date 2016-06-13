package io.github.loop_x.yummywakeup.module.UnlockTypeModule.Model;

/**
 * Enum about all unlock types
 */
public enum UnlockTypeEnum {

    Normal ("Normal"),
    Math   ("Math"),
    Puzzle ("Puzzle"),
    Shake  ("Shake");

    private final String type;

    UnlockTypeEnum(String s) {
        type = s;
    }

    public int toID(String name) {

        if(name == Normal.toString()) {
            return 0;
        } else if(name == Math.toString()) {
            return 1;
        } else if(name == Puzzle.toString()) {
            return 2;
        } else if(name == Shake.toString()) {
            return 3;
        }

        return -1;
    }

    public static String toName(int id) {

        switch (id) {
            case 0:
                return Normal.toString();
            case 1:
                return Math.toString();
            case 2:
                return Puzzle.toString();
            case 3:
                return Shake.toString();
        }

        return null;
    }

    public String toString() {
        return this.type;
    }

    public int getID() {
        return toID(type);
    }

    public boolean equalsName(String otherName) {
        return otherName != null && type.equals(otherName);
    }

}
