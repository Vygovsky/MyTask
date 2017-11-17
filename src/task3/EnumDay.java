package task3;

public class EnumDay {
    public enum Days {
        MONDAY {
            @Override
            public String toString() {
                return "Понедельник";
            }
        },

        TUESDAY {
            @Override
            public String toString() {
                return "Вторник";
            }
        },

        WEDNESDAY {
            @Override
            public String toString() {
                return "Среда";
            }
        },

        THURSDAY {
            @Override
            public String toString() {
                return "Четверг";
            }
        },

        FRIDAY {
            @Override
            public String toString() {
                return "Пятница";
            }
        },

        SATURDAY {
            @Override
            public String toString() {
                return "Суббота";
            }
        },

        SUNDAY {
            @Override
            public String toString() {
                return "Воскресенье";
            }
        };

        public static void main(String[] args) {
            System.out.println(Days.MONDAY);
            Days d = Days.MONDAY;
            System.out.println(d);
            System.out.println(d.toString());
        }
    }
}

   /* MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");
    private String value;

    Days(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value ;
    }*/