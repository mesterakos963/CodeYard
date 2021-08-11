package Workers;

public final class ZooKeeper extends Worker {

    private boolean isLoved;

    public ZooKeeper(String id, String bossID, String name, boolean isLoved) {
        super(id, bossID, name);
        this.isLoved = isLoved;
    }

    public String getID(){
        return id;
    }

    public void setBossID(String newBossId){
        super.bossID = newBossId;
    }

    @Override
    public String getBossID() {
        return bossID;
    }

    public boolean getLoved() {
        return isLoved;
    }

    @Override
    public String getName() { return this.name; }
}
