package solid;

public class DIP {
}

interface Database {
    void saveData(String data);
}

class MySQLDatabase implements Database {
    public void saveData(String data) {
        System.out.println("Saving data in MySQL DB");
    }
}

class MongoDBDatabase implements Database {
    public void saveData(String data) {
        System.out.println("Saving data in MongoDB");
    }
}

class UserRepository {
    private Database db;

    public UserRepository(Database db) {
        this.db = db;
    }

    public void save(String user) {
        db.saveData(user);
    }
}
