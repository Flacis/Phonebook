public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        fillGruops(pb);
        fillContacts(pb);
        System.out.println("Контакт по номеру 123: " + pb.findByPhone("123"));
        System.out.println("Все контакты в группе \"Друзья\":");
        for (Contact contact : pb.findAllByGroup("Друзья")) {
            System.out.println(contact);
        }

    }

    private static void fillContacts(PhoneBook pb) {
        pb.addContactToGroups(PhoneBook.createContact("Вася", "123"), "Друзья", "Работа");
        pb.addContactToGroups(PhoneBook.createContact("Оля", "124"), "Семья");
        pb.addContactToGroups(PhoneBook.createContact("Таня", "125"), "Друзья", "Работа");
        pb.addContactToGroups(PhoneBook.createContact("Петя", "126"), "Семья", "Работа");
    }

    private static void fillGruops(PhoneBook pb) {
        pb.addGroup("Друзья");
        pb.addGroup("Семья");
        pb.addGroup("Работа");
    }
}