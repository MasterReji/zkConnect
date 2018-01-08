import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.KeeperException;

public class ZKDelete {
    private static ZooKeeper zk;
    private static ZooKeeperConnection conn;
    private static int myid = 9;

    // Method to check existence of znode and its status, if znode is available.
    public static void delete(String path) {

        try {
            if (zk.exists(path, false) != null)
                zk.delete(path, zk.exists(path, true).getVersion());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException, KeeperException {
        String path = "/MyFirstZnode"; //Assign path to the znode


        try {
            conn = new ZooKeeperConnection();
            zk = conn.connect("10.130.96.62");

            for (int i = 1000; i > 0; i--) {
                delete("/node" + 1 + "_" + i);
            }
            Thread.sleep(1000);
            for (int i = 1000; i > 0; i--) {
                delete("/node" + 2 + "_" + i);
            }
            Thread.sleep(1000);
            for (int i = 1000; i > 0; i--) {
                delete("/node" + 3 + "_" + i);
            }
            Thread.sleep(1000);
            for (int i = 1000; i > 0; i--) {
                delete("/node" + 4 + "_" + i);
            }
            Thread.sleep(1000);
            for (int i = 1000; i > 0; i--) {
                delete("/node" + 5 + "_" + i);
            }
            Thread.sleep(1000);
            for (int i = 1000; i > 0; i--) {
                delete("/node" + 6 + "_" + i);
            }
            Thread.sleep(1000);
            for (int i = 1000; i > 0; i--) {
                delete("/node" + 7 + "_" + i);
            }
            Thread.sleep(1000);
            for (int i = 1000; i > 0; i--) {
                delete("/node" + 8 + "_" + i);
            }
            Thread.sleep(1000);
            for (int i = 1000; i > 0; i--) {
                delete("/node" + 9 + "_" + i);
            }
            Thread.sleep(1000);
            for (int i = 1000; i > 0; i--) {
                delete("/node" + 0 + "_" + i);
            }
            Thread.sleep(1000);
            //delete(path); //delete the node with the specified path
            conn.close();
        } catch (Exception e) {
            System.out.println("skiten kommer hit");
            System.out.println(e.getMessage()); // catches error messages
        }
    }
}

