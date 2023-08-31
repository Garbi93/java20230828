package ch08interface.book.q7;

public class DaoExample {
    public static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());
    }
}

interface DataAccessObject{
    public void select();
    public void insert();
    public void update();
    public void delete();
}
class OracleDao implements DataAccessObject{
    @Override
    public void select() {
        System.out.println("오라클 선택");
    }

    @Override
    public void insert() {
        System.out.println("오라클 입력");
    }

    @Override
    public void update() {
        System.out.println("오라클 업데이트");
    }

    @Override
    public void delete() {
        System.out.println("오라클 삭제");
    }
}

class MySqlDao implements DataAccessObject{
    @Override
    public void select() {
        System.out.println("MySql 선택");
    }

    @Override
    public void insert() {
        System.out.println("MySql 입력");
    }

    @Override
    public void update() {
        System.out.println("MySql 업데이트");
    }

    @Override
    public void delete() {
        System.out.println("MySql 삭제");
    }
}