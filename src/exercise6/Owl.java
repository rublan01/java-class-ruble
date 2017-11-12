package exercise6;

import java.util.Objects;

/**
 * Class Owl
 * @author rublan01
 */
public class Owl {
        
    private final String name;
    private int age;
    private String wisdom = "medium";

    public Owl(String name, int age, String wisdom) {
        this.name = name;
        this.age = age;
        this.wisdom = wisdom;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWisdom() {
        return wisdom;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.name);
        hash = 11 * hash + this.age;
        hash = 11 * hash + Objects.hashCode(this.wisdom);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Owl other = (Owl) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.wisdom, other.wisdom)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Owl{" + "name=" + name + ", age=" + age + ", wisdom=" + wisdom + '}';
    }
    
}
