package itmo.java.labs.task9;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class UserMap {

    private Map<User, Integer> map;

    public UserMap() {
        this.map = new HashMap<>();
    }

    public Map<User, Integer> getMap() {
        return map;
    }

    public void setMap(User user, Integer value) {
        this.map.put(user, value);
    }

    public Integer getValue(String name){
        return map.getOrDefault(new User(name), 0);
    }

}
