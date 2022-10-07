import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<Contact>> storage = new HashMap<>();

    public boolean addGroup(String groupName) {
        if (storage.containsKey(groupName))
            return false;
        storage.put(groupName, new ArrayList<>());
        return true;
    }

    public boolean addContactToGroups(Contact contact, String... groupNames) {
        for (String groupName : groupNames) {
            if (!storage.containsKey(groupName)) {
                addGroup(groupName);
            }
            final List<Contact> contacts = storage.get(groupName);
            contacts.add(contact);
        }
        return false;
    }

    public List<Contact> findAllByGroup(String groupName) {
        return new ArrayList<>(
                storage.get(groupName));
    }

    public Contact findByPhone(String phone) {
        for (List<Contact> group : storage.values()) {
            for (Contact contact : group) {
                if (contact.getPhone().equals(phone))
                    return contact;
            }
        }
        return null;
    }

    public static Contact createContact(String name, String phone) {
        return new Contact(name, phone);
    }
}

