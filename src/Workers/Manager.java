package Workers;

public class Manager extends Worker {
    public Manager(String id,String bossID, String name){
        super(id, bossID, name);
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public String getBossID() {
        return null;
    }

    @Override
    public String getName() { return this.name; }
}
