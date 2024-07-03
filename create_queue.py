import boto3

# URL do endpoint do LocalStack
endpoint_url = "http://localhost.localstack.cloud:4566"

def create_sqs_queue():
    # Conectar ao serviço SQS no LocalStack
    sqs = boto3.client(
        'sqs',
        endpoint_url=endpoint_url,
        region_name='sa-east-1',
        aws_access_key_id='fake_access_key',
        aws_secret_access_key='fake_secret_key'
    )

    queue_name = 'minha-fila'

    # Criar a fila
    response = sqs.create_queue(
        QueueName=queue_name
    )

    print(f'Fila {queue_name} criada com sucesso. URL: {response["QueueUrl"]}')

def main():
    create_sqs_queue()

if __name__ == "__main__":
    main()