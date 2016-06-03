
import kafka.consumer.ConsumerConnector;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;

import java.util.Properties;

/**
 * Created by shridharmanvi on 5/27/16.
 */
public class consumer {

    public static void main(String args[]){
        KafkaConsumer<String,String> consumer; //Create kafka consumer instance

        Properties props = new Properties();
        props.put("broker.id","0");
        props.put("zk.connect", "localhost:2181");
        props.put("group_id","test_group");
        props.put("zk.connectiontimeout.ms", "1000000");

        String topic = "test";

        //ConsumerConfig conconfig = new ConsumerConfig(props);
        //ConsumerConnector con = kafka.consumer.Consumer.createJavaConsumerConnector(conconfig);

    }
}
