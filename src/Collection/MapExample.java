package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, WebSiteUser> mapItem = new HashMap<>();
        WebSiteUser wsu = new WebSiteUser("hash@ukr.ua", "Tolya", "Kokorin", "066-998-33-56");
        WebSiteUser wsu2 = new WebSiteUser("Utka_Putka@mail.ru", "Marina", "Sholoh", "097-158-98-00");
        WebSiteUser wsu3 = new WebSiteUser("Polya@gmail.com", "Polya", "Krolik", "063-665-88-88");

        mapItem.put(wsu.getMail(), wsu);
        mapItem.put(wsu2.getMail(), wsu2);
        mapItem.put(wsu3.getMail(), wsu3);
        // Еще раз вставляем объект, но с другим ключом
        mapItem.put("Manna@jto.org", wsu3);

        // Получить полбзователя по ключу
        WebSiteUser user = mapItem.get("Utka_Putka@mail.ru");
        System.out.println("User: " + user.getName() + " " + user.getLastName());
        System.out.println();
        System.out.println("Список пользователей по ключу:");
        for (String mail : mapItem.keySet()) {
            WebSiteUser user1 = mapItem.get(mail);
            System.out.println("User " + mail + ", " + user1.getName() + ":" + user1.getLastName());
        }
        System.out.println();
        System.out.println("По значению");
        for (WebSiteUser value : mapItem.values()) {
            System.out.println("User " + value.getName() + ":" + value.getLastName());
        }
        System.out.println();
        System.out.println("По ключу и значению");
        for (Map.Entry<String, WebSiteUser> us : mapItem.entrySet()) {
            System.out.println("User " + us.getKey() + ":" + us.getValue().getName() + ":" + us.getValue().getLastName());
        }
    }

}
