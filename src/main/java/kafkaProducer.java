
import org.apache.kafka.clients.producer.KafkaProducer;
import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;
import java.util.Properties;
import java.util.*;


/**
 * Created by shridharmanvi on 5/26/16.
 */

public class kafkaProducer{


    public static void main(String args[]){

        Properties props = new Properties();
        props.put("metadata.broker.list", "localhost:9092");
        props.put("broker.id","0");
        props.put("zk.connect", "localhost:2181");
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        props.put("auto.create.topics.enable","true");
        //props.put("partitioner.class", "kafka.producer.Partitioner");
        //props.put("request.required.acks", "1");
        //Properties variable created and set.

        ProducerConfig config = new ProducerConfig(props);
        Producer<String, String> producer = new Producer<String, String>(config); //Producer is ready with all the config set

        for(int i =0;i<1000;i++){
            String va = Integer.toString(i);
            KeyedMessage<String, String> message = new KeyedMessage<String, String>("test", "Message "+ va);
            producer.send(message);
            System.out.println(i);
        }


    }



}
