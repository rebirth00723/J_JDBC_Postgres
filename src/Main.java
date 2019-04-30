public class Main {


    public static void main(String args[]) {

        J_DBControler DBC = new J_DBControler(args[0], args[1], args[2], args[3]);

        System.out.println("Opened database successfully\n");

        System.out.println("-----Drop table student-----\n");
        DBC.dropTable();

        System.out.println("-----Create table student-----\n");
        DBC.createTable();

        System.out.println("-----inesrt data-----\n");
        DBC.insert();

        System.out.println("-----select data-----\n");
        DBC.select();

        System.out.println("-----update data, change id and phone-----\n");
        DBC.update();

        System.out.println("-----select data-----\n");
        DBC.select();

        DBC.close();
    }
}
