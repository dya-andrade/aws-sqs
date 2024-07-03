# aws-sqs
SQS da AWS com Spring Cloud e LocalStack.

* Dependências
  * Spring Cloud
  * Spring Web
  * LocalStack
  * Docker e Docker Compose
--------------
* Para rodar o container do LocalStack
    <p>Na raiz do projeto:</p>
    
    ```shell
    docker-compose up
    ```
    <p>Clique neste link para ver suas instâncias: </p>
    <a href="https://app.localstack.cloud/inst/default/status">Instâncias AWS</a>
--------------
  
* Para criar a fila por meio de script
  * Dê permissão para execução do arquivo
  
  ```shell
  chmod +x setup_run.sh
  ```

  * Execute o script
  
  ```shell
  ./setup_run.sh
  ```
