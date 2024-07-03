package tech.buildrun.aws_sqs;

import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tech.buildrun.aws_sqs.consumer.MyMessage;

@SpringBootApplication
public class AwsSqsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AwsSqsApplication.class, args);
	}

	@Autowired
	private SqsTemplate sqsTemplate;

	@Override // será sempre executado assim que a aplicação inicializar
	public void run(String... args) throws Exception {
		var SQS = "https://localhost.localstack.cloud:4566/000000000000/minha-fila";
		sqsTemplate.send(SQS, new MyMessage("My initialization value!"));
	}
}
