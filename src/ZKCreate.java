import java.io.IOException;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.Watcher.Event.KeeperState;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs;

public class ZKCreate {
    // create static instance for zookeeper class.
    private static ZooKeeper zk;

    // create static instance for ZooKeeperConnection class.
    private static ZooKeeperConnection conn;

    // Method to create znode in zookeeper ensemble
    public static void create(String path, byte[] data) throws
            KeeperException,InterruptedException {
        if(zk.exists(path, true) == null) {
            zk.create(path, data, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
           // System.out.println("då den här");
        }
    }

    public static void main(String[] args) {

        // znode path
       // String path = "/MyFirstZnode"; // Assign path to znode

        // data in byte array
        //String str = "My first zookeeper app";
       // byte[] data = str.getBytes(); // Declare data

        try {
            conn = new ZooKeeperConnection();
            zk = conn.connect("10.130.96.62");

            for (int i = 1000; i > 0; i--) {
                create("/node" + 1 + "_" + i, new byte[0]);
            }
            // Thread.sleep(10);
            for (int i = 1000; i > 0; i--) {
                create("/node" + 2 + "_" + i, new byte[0]);
            }
            // Thread.sleep(10);
            for (int i = 1000; i > 0; i--) {
                create("/node" + 3 + "_" + i, new byte[0]);
            }
            // Thread.sleep(10);
            for (int i = 1000; i > 0; i--) {
                create("/node" + 4 + "_" + i, new byte[0]);
            }
            //  Thread.sleep(10);
            for (int i = 1000; i > 0; i--) {
                create("/node" + 5 + "_" + i, new byte[0]);
            }
            //  Thread.sleep(10);
            for (int i = 1000; i > 0; i--) {
                create("/node" + 6 + "_" + i, new byte[0]);
            }
            //  Thread.sleep(10);
            for (int i = 1000; i > 0; i--) {
                create("/node" + 7 + "_" + i, new byte[0]);
            }
            //  Thread.sleep(10);
            for (int i = 1000; i > 0; i--) {
                create("/node" + 8 + "_" + i, new byte[0]);
            }
            //   Thread.sleep(10);
            for (int i = 1000; i > 0; i--) {
                create("/node" + 9 + "_" + i, new byte[0]);
            }
            //   Thread.sleep(10);
            for (int i = 1000; i > 0; i--) {
                create("/node" + 0 + "_" + i, new byte[0]);
            }
           // Thread.sleep(10);



            //create(path, data); // Create the data to the specified path
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage()); //Catch error message
        }
    }
}