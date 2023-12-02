package set;

/**
 * @Author Wenbin Zuo
 * @Date 2023-12-02-15:04
 * @Description:
 */
public class User implements Comparable<Integer>{
    Integer id;
    String name;

    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }





    @Override
    public int compareTo(Integer o) {
        return this.id - o;
    }
}
